package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.MAPFile;
import net.highwayfrogs.editor.file.map.path.Path;
import net.highwayfrogs.editor.file.map.path.PathSegment;
import net.highwayfrogs.editor.file.map.path.PathType;
import net.highwayfrogs.editor.file.map.path.data.LineSegment;
import net.highwayfrogs.editor.file.standard.SVector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Randomizes the order of the lanes in retro levels.  The 5 traffic lanes and the 5 water lanes
 * are scrambled.  To help prevent incredibly difficult to time flows, the 5th water lane direction
 *
 */
public class RetroLaneShuffler {

    Random random;

    static double CHANCE_TO_FLIP_DIRECTION = 0.50;

    RetroLaneShuffler(Random random) {
        this.random = random;
    }

    // Retro 1 Path 6: Start 161.5,-11.0,8.5  End -152.0,-11.0,8.0
    // Retro 1 Path 7: Start 159.0,-11.0,56.0  End -145.0,-11.0,55.5
    // Retro 3 Path 10: Start -322.0,-11.0,39.5  End 294.5,-10.0,39.5
    // Retro 4 Path 2:  Start 152.0,-11.0,8.0  End -152.0,-11.0,8.0
    // Retro 5 Path 0: Start 304,-16,-24  End -305,-16,-24

    /**
     * Converts any SPLINE type paths in the Retro levels in essentially equivalent LINE type paths
     * which can more easily be randomized.  Middle points of the SPLINE path will be ignored, and
     * a new LINE path will be created using the SPLINE path's start and end points.
     * @param levelName The name of a level such as ORG1
     * @param pathIndex The index of the path in the list of all paths
     * @param path The path object from the list of paths
     */
    private void resolvePath(String levelName, int pathIndex, Path path) {
        List<PathSegment> segments = path.getSegments();
        if (segments.get(0).getType() != PathType.SPLINE) {
            return;
        }

        LineSegment ls;
        if (levelName.equals("ORG1.MAP") && pathIndex == 6) {
            ls = new LineSegment(path);
            ls.setStart(new SVector(161.5f,-11.0f,8.5f));
            ls.setEnd(new SVector(-152.0f,-11.0f,8.0f));
        }
        else if (levelName.equals("ORG1.MAP") && pathIndex == 7) {
            ls = new LineSegment(path);
            ls.setStart(new SVector(159.0f,-11.0f,56.0f));
            ls.setEnd(new SVector(-145.0f,-11.0f,55.5f));
        }
        else if (levelName.equals("ORG3.MAP") && pathIndex == 10) {
            ls = new LineSegment(path);
            ls.setStart(new SVector(-322.0f,-11.0f,39.5f));
            ls.setEnd(new SVector(294.5f,-10.0f,39.5f));
        }
        else if (levelName.equals("ORG4.MAP") && pathIndex == 2) {
            ls = new LineSegment(path);
            ls.setStart(new SVector(152.0f,-11.0f,8.0f));
            ls.setEnd(new SVector(-152.0f,-11.0f,8.0f));
        }
        else if (levelName.equals("ORG5.MAP") && pathIndex == 0) {
            ls = new LineSegment(path);
            ls.setStart(new SVector(304.0f,-16.0f,-24.0f));
            ls.setEnd(new SVector(-305.0f,-16.0f,-24.0f));
        }
        else {
            return;
        }
        ls.recalculateLength();
        segments.set(0, ls);
    }


    /**
     * Depending on which retro level, return a list of indexes to the lanes with cars/trucks/etc.
     * @param levelName The String name of the level like ORG1.MAP
     * @return An array of integer indexes corresponding to the indexes in the levels Path array
     *      which contain the vehicles
     */
    private int[] getMotorLaneIndexes(String levelName) {
        switch (levelName) {
            case "ORG1.MAP":
            case "ORG5.MAP":
                return new int[]{0, 1, 2, 3, 4};
            case "ORG2.MAP":
                return new int[]{2, 3, 4, 5, 6};
            case "ORG3.MAP":
                return new int[]{0, 1, 2, 3, 7};
            case "ORG4.MAP":
                return new int[]{0, 3, 4, 8, 9};
            default:
                return new int[]{};
        }
    }


    /**
     * Depending on which retro level, return a list of indexes to the lanes with logs/turtles/etc.
     * @param levelName The String name of the level like ORG1.MAP
     * @return An array of integer indexes corresponding to the indexes in the levels Path array
     *      which contain the traversable water platforms
     */
    private int[] getWaterLaneIndexes(String levelName) {
        switch (levelName) {
            case "ORG1.MAP":
            case "ORG5.MAP":
                return new int[]{5, 6, 7, 8, 9};
            case "ORG2.MAP":
                return new int[]{0, 1, 7, 8, 9};
            case "ORG3.MAP":
                return new int[]{4, 5, 8, 9, 10};
            case "ORG4.MAP":
                return new int[]{1, 2, 5, 6, 10};
            default:
                return new int[]{};
        }
    }


    /**
     * Filter list of Paths to obtain the paths at the provided indices
     * @param indexes Indices to choose from the input List
     * @param allPaths List of paths to filter
     * @return List of paths from the input indices
     */
    private List<Path> getPathsAtIndexes(int[] indexes, List<Path> allPaths) {
        ArrayList<Path> filteredList = new ArrayList<>();
        for (int i = 0; i < indexes.length; i++) {
            filteredList.add(allPaths.get(indexes[i]));
        }
        return filteredList;
    }


    /**
     * Swap start and end points of a given LINE type path.  Do nothing for other path types.
     * @param p Path to swap direction of
     */
    private void flipPathDirection(Path p) {
        if (p.getSegments().get(0).getType() != PathType.LINE) {
            return;
        }
        LineSegment segment = (LineSegment) p.getSegments().get(0);
        SVector temp = segment.getStart();
        segment.setStart(segment.getEnd());
        segment.setEnd(temp);
    }


    /**
     * Swaps the start and end points of two Paths with 1 segment of LINE type
     * @param a The first Path object to swap
     * @param b The second Path object to swap
     */
    public void swapPaths(Path a, Path b) {
        LineSegment aSegment = (LineSegment) a.getSegments().get(0);
        LineSegment bSegment = (LineSegment) b.getSegments().get(0);

        SVector tempStart = aSegment.getStart();
        SVector tempEnd = aSegment.getEnd();

        aSegment.setStart(new SVector(aSegment.getStart().getX(), aSegment.getStart().getY(), bSegment.getStart().getZ()));
        aSegment.setEnd(new SVector(aSegment.getEnd().getX(), aSegment.getEnd().getY(), bSegment.getEnd().getZ()));
        bSegment.setStart(new SVector(bSegment.getStart().getX(), bSegment.getStart().getY(), tempStart.getZ()));
        bSegment.setEnd(new SVector(bSegment.getEnd().getX(), bSegment.getEnd().getY(), tempEnd.getZ()));
    }

    /**
     * Shuffles the order of all lanes in an input retro level.  Lane directions may also change.
     * In order to prevent difficult timing layouts, the 4th and 5th lanes of the water portion
     * are guaranteed to be opposite directions.
     * @param mapName Name of the map, such as ORG1.MAP
     * @param mapFile File for the input map to edit path data of
     */
    public void shuffleLanes(String mapName, MAPFile mapFile) {
        List<Path> allPaths = mapFile.getPaths();
        for (int i = 0; i < allPaths.size(); i++) {
            resolvePath(mapName, i, allPaths.get(i));
        }
        List<Path> trafficPaths = getPathsAtIndexes(getMotorLaneIndexes(mapName), allPaths);
        for (int i = 0; i < 5; i++) {
            swapPaths(trafficPaths.get(random.nextInt(5)),
                    trafficPaths.get(random.nextInt(5)));
        }
        List<Path> waterPaths = getPathsAtIndexes(getWaterLaneIndexes(mapName), allPaths);
        for (int i = 0; i < 5; i++) {
            swapPaths(waterPaths.get(random.nextInt(5)),
                    waterPaths.get(random.nextInt(5)));
        }
        Path deepestPath = null;
        Path nextDeepestPath = null;
        float largestZ = Float.NEGATIVE_INFINITY;
        for (Path p : allPaths) {
            // Iterate through all paths and randomly flip direction of LINE type paths
            double value = random.nextDouble();
            if (value > CHANCE_TO_FLIP_DIRECTION) {
                flipPathDirection(p);
            }
            // Calculate the last and second to last rows
            if (p.getSegments().get(0).getStartPosition().getZ() > largestZ) {
                nextDeepestPath = deepestPath;
                deepestPath = p;
                largestZ = p.getSegments().get(0).getStartPosition().getZ();
            }
        }

        // Ensure 4th and 5th are always opposite directions in water
        if (deepestPath != null && nextDeepestPath != null) {
            LineSegment deepestSegment = (LineSegment) deepestPath.getSegments().get(0);
            LineSegment nextDeepestSegment = (LineSegment) nextDeepestPath.getSegments().get(0);
            if (deepestSegment.isDirectedRight() == nextDeepestSegment.isDirectedRight()) {
                flipPathDirection(deepestPath);
            }
        }
    }
}
