package net.highwayfrogs.editor.randomizer;

import java.util.Arrays;

/**
 * Common reusable utility functions.
 */
public class Utils {
    /**
     * Given two arrays of vertex IDs, check if all the IDs between the two arrays match.  Order
     * may differ between a and b.
     * @param aa first array of vertices
     * @param bb second array of vertices
     * @return true if all elements in a match all elements in b
     */
    public static boolean verticesMatch(int[] aa, int[] bb) {
        // Copy arrays since the original is pass by reference, and we're going to overwrite values
        int[] a = Arrays.copyOf(aa, aa.length);
        int[] b = Arrays.copyOf(bb, bb.length);
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            boolean isInB = false;
            for (int j = 0; j < b. length; j++) {
                if (b[j] == a[i]) {
                    isInB = true;
                    a[i] = -1 * i;
                    b[j] = -1 * j;
                }
            }
            if (!isInB)
                return false;
        }
        return true;
    }

    /**
     * Given two arrays of vertex IDs, check if any of the IDs between the two arrays match
     * @param a first array of vertices
     * @param b second array of vertices
     * @return true if any element of a matches any element of b
     */
    public static boolean verticesIntersect(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
