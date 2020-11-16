package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.StartRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapData {

     public static ArrayList<String> VALID_MAPS = new ArrayList<String>(
             Arrays.asList(
                     "ORG1.MAP", "ORG2.MAP", "ORG3.MAP", "ORG4.MAP", "ORG5.MAP",
                     "SUB1.MAP", "SUB2.MAP", "SUB3.MAP", "SUB4.MAP", "SUB5.MAP",
                     "FOR1.MAP", "FOR2.MAP",
                     "VOL1.MAP", "VOL2.MAP", "VOL3.MAP",
                     "CAV1.MAP", "CAV3.MAP", "CAV4.MAP",
                     "SKY1.MAP", "SKY2.MAP", "SKY3.MAP", "SKY4.MAP",
                     "SWP1.MAP", "SWP2.MAP", "SWP3.MAP", "SWP4.MAP", "SWP5.MAP",
                     "DES1.MAP", "DES2.MAP", "DES3.MAP", "DES4.MAP", "DES5.MAP",
                     "JUN1.MAP"
             )
     );

     public static Map<String, ArrayList<FrogPosition>> FROG_LOCATIONS = new HashMap<>();
     static {
         FROG_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-216.0, -41.6875, -168.0, 0, -90, 0, 0),
                 new FrogPosition(-360.0, -39.125, -136.0, 0, 90, 0, 0),
                 new FrogPosition(-120.0, -48.6875, -8.0, 0, 90, 0, 0),
                 new FrogPosition(-264.125, -38.6875, 71.5625, 180, 0, 180, 1),
                 new FrogPosition(-360.0, -37.1875, 104.0, 0, 0, 0, 2),
                 new FrogPosition(-343.8125, -34.8125, 264.125, 180, 0, 180, 2),
                 new FrogPosition(-199.8125, -35.0, 264.125, 180, 0, 180, 2),
                 new FrogPosition(-24.0, -36.0625, 280.0, 180, 0, 180, 2),
                 new FrogPosition(184.125, -36.5, 264.1875, 180, 0, 180, 3),
                 new FrogPosition(360.0, -38.375, 56.0, 0, 0, 0, 3),
                 new FrogPosition(328.1875, -84.0625, 151.8125, 0, -90, 0, 4),
                 new FrogPosition(295.8125, -36.125, 23.8125, 0, 0, 0, 5),
                 new FrogPosition(136.125, -60.125, 39.375, 0, -90, 0, 5),
                 new FrogPosition(168.0625, -35.25, -120.0, 0, -90, 0, 5)
         )));
     }



     public static Map<String, ArrayList<StartPosition>> START_LOCATIONS = new HashMap<>();
     static {
         START_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 21, StartRotation.NORTH, 0),
                 new StartPosition(23, 26, StartRotation.EAST, 1),
                 new StartPosition(16, 42, StartRotation.EAST, 2),
                 new StartPosition(19, 38, StartRotation.NORTH, 2),
                 new StartPosition(37, 42, StartRotation.SOUTH, 2),
                 new StartPosition(50, 42, StartRotation.WEST, 3),
                 new StartPosition(51, 29, StartRotation.EAST, 5),
                 new StartPosition(47, 22, StartRotation.NORTH, 5)
         )));
     }


}
