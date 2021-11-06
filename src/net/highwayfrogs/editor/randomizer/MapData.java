package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.StartRotation;
import net.highwayfrogs.editor.file.standard.psx.ByteUV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapData {

     public static ArrayList<String> VALID_MAPS = new ArrayList<>(
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
         FROG_LOCATIONS.put("ORG1.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition(-87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(-39.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(8.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(56.125, -16.0, 87.625, 180, 0, 180, 1),
                 new FrogPosition(104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG2.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition(-87.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(-39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(8.125, -12.9375, 87.625, 180, 0 ,180, 1),
                 new FrogPosition(56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG3.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition(-87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(-39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(8.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(104.125, -12.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG4.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition(-87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(-39.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(8.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(56.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG5.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition(-87.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(-39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(8.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition(104.125, -12.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-216.0, -41.6875, -168.0, 0, -89.9, 0, 0,
                         25, 16, 13, 31, null),
                 new FrogPosition(-360.0, -39.125, -136.0, 0, 89.9, 0, 0,
                         16, 18, 13, 31, null),
                 new FrogPosition(-120.0, -48.6875, -8.0, 0, 89.9, 0, 0,
                         31, 26, 13, 31, null),
                 new FrogPosition(-264.125, -38.6875, 71.5625, 180, 0, 180, 1,
                         22, 31, 14, 31, null),
                 new FrogPosition(-360.0, -37.1875, 104.0, 0, 0, 0, 2,
                         16, 33, 13, 31, null),
                 new FrogPosition(-343.8125, -34.8125, 264.125, 180, 0, 180, 2,
                         17, 43, 13, 31, null), //
                 new FrogPosition(-199.8125, -35.0, 264.125, 180, 0, 180, 2,
                         26, 43, 13, 31, null), //
                 new FrogPosition(-24.0, -36.0625, 280.0, 180, 0, 180, 2,
                         37, 44, 13, 31, null),
                 new FrogPosition(184.125, -36.5, 264.1875, 180, 0, 180, 3,
                         50, 43, 13, 31, null), //
                 new FrogPosition(360.0, -38.375, 56.0, 0, 0, 0, 3,
                         61, 30, 13, 31, null),
                 new FrogPosition(328.1875, -84.0625, 151.8125, 0, -89.9, 0, 4,
                         59, 36, 13, 31, null), //
                 new FrogPosition(295.8125, -36.125, 23.8125, 0, 0, 0, 5,
                         57, 28, 13, 31, null), //
                 new FrogPosition(136.125, -60.125, 39.375, 0, -89.9, 0, 5,
                         47, 29, 13, 31, null),
                 new FrogPosition(168.0625, -35.25, -120.0, 0, -89.9, 0, 5,
                         49, 19, 13, 31, null)
         )));
         FROG_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-24.0, -3.4375, -616.0, 0, 0, 0, 0,
                         22, 6, 2, 47, null),
                 new FrogPosition(-104.0, -65.875, -520.0, 0, 89.9, 0, 0,
                         17, 12, 19, 47, null), //2nd layer
                 new FrogPosition(-56.0, -70.25, -376.0, 0, -89.9, 0, 1,
                         20, 21, 2, 47, null), //2nd layer
                 new FrogPosition(-170.3125, -67.6875, -295.875, 0, 89.9, 0, 1,
                         13, 26, 6, 47, null),
                 new FrogPosition(-135.75, -67.1875, -217.5625, 180, 0, 180, 1,
                         15, 31, 2, 47, null), //
                 new FrogPosition(-40.0, -3.1875, -361.6875, 0, 0, 0, 2,
                         21, 22, 2, 47, null), //
                 new FrogPosition(-71.0, -19.375, -231.8125, 0, 89.9, 0, 2,
                         19, 30, 2, 47, null), //
                 new FrogPosition(8.25, -3.4375, -375.375, 0, 89.9, 0, 2,
                         24, 21, 2, 47, null),
                 new FrogPosition(40.0, -15.25, -200.0, 180, 0, 180, 2,
                         26, 32, 2, 47, null),
                 new FrogPosition(-7.9375, -4.25, -296.25, 0, 89.9, 0, 2,
                         23, 26, 13, 47, null),
                 new FrogPosition(-152.0, -3.4375, -200.0, 0, 0, 0, 2,
                         14, 32, 2, 47, null),
                 new FrogPosition(120.6875, -7.5, -199.75, 180, 0, 180, 3,
                         31, 32, 13, 47, null),
                 new FrogPosition(168.125, -131.875, -200.9375, 180, 0, 180, 4,
                         34, 32, 2, 47, null), //
                 new FrogPosition(215.9375, -72.625, -361.6875, 0, 0, 0, 4,
                         37, 22, 31, 60, null) //
         )));
         FROG_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-184.0, 0.0, -200.0, 0, -89.9, 0, 0,
                         12, 9, 0, 15, null),
                 new FrogPosition(-88.0, 0.0, -200.0, 0, 89.9, 0, 0,
                         18, 9, 17, 15, null),
                 new FrogPosition(-56.0, 0.0, -136.0, 0, -89.9, 0, 0,
                         20, 13, 26, 15, null),
                 new FrogPosition(40.0, 0.0, -184.0, 180, 0, 180, 0,
                         26, 10, 12, 15, null),
                 new FrogPosition(-279.8125, 3.4375, -231.75, 180, 0, 180, 1,
                         6, 7, 0, 15, null), //
                 new FrogPosition(-184.0, 0.0, -136.0, 0, 0, 0, 1,
                         12, 13, 26, 15,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-55.8125, 0.0, -8.3125, 180, 0, 180, 2,
                         20, 21, 0, 15, null), //
                 new FrogPosition(-119.8125, 0.0, 280.125, 180, 0, 180, 3,
                         16, 39, 0, 15, null), //
                 new FrogPosition(55.8125, 1.25, -8.125, 0, 0, 0, 4,
                         27, 21, 0, 15, null), //
                 new FrogPosition(120.0, -14.375, 136.0, 180, 0, 180, 4,
                         31, 30, -1, -1, null),
                 new FrogPosition(248.125, 0.0, 24.125, 0, 0, 0, 4,
                         39, 23, 0, 15, null),
                 new FrogPosition(40.0, 0.0, -88.0, 180, 0, 180, 5, //
                         26, 16, 0, 15, null),
                 new FrogPosition(120.0, 0.0, -152.0, 0, 89.9, 0, 5,
                         31, 12, 12, 15, null),
                 new FrogPosition(200.0, 0.0, -168.0, 0, -89.9, 0, 5,
                         36, 11, 2, 15, null)
         )));
         FROG_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-376.0, -38.0, -152.0, 0, 89.9, 0, 0,
                         15, 20, 9, 25, null),
                 new FrogPosition(-216.0, -41.75, -168.0, 0, -89.9, 0, 0,
                         25, 19, 9, 25, null),
                 new FrogPosition(-280.1875, -48.625, -8.375, 0, 89.9, 0, 0,
                         21, 29, 9, 25, null),
                 new FrogPosition(-360.0, -92.3125, 265.125, 180, 0, 180, 1,
                         16, 46, 9, 25, null), //
                 new FrogPosition(-360.0, -37.1875, 104.0, 0, 0, 0, 2,
                         16, 36, 9, 25, null),
                 new FrogPosition(-184.25, -32.5625, 265.0625, -180, 0, -180, 2,
                         27, 46, 9, 25, null), //
                 new FrogPosition(-8.0, -36.0625, 152.0, 0, -89.9, 0, 3,
                         38, 39, 9, 25, null),
                 new FrogPosition(264.125, -36.0625, 263.625, 180, 0, 180, 4,
                         55, 46, 9, 25, null), //
                 new FrogPosition(360.0, -38.375, 56.0, 0, 0, 0, 4,
                         61, 33, 9, 25, null),
                 new FrogPosition(327.625, -84.0625, 151.8125, 0, -89.9, 0, 5,
                         59, 39, 9, 25, null), //
                 new FrogPosition(295.8125, -36.0625, 24.3125, 0, 0, 0, 5,
                         57, 31, 9, 25, null), //
                 new FrogPosition(104.0, -37.25, 72.0, 0, 0, 0, 5,
                         45, 34, 9, 25, null),
                 new FrogPosition(168.0, -35.25, -120.0, 0, -89.9, 0, 5,
                         49, 22, 9, 25, null)
         )));
         FROG_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-24.0, -35.375, -616.0, 0, 0, 0, 0,
                         29, 7, 0, 44, null),
                 new FrogPosition(-136.0, -40.625, -584.0, 0, 0, 0, 0,
                         22, 9, 0, 44, null),
                 new FrogPosition(-136.0, -34.875, -472.0, 0, -89.9, 0, 0,
                         22, 16, 0, 44, null),
                 new FrogPosition(-56.0, -101.125, -376.0, 0, -89.9, 0, 0,
                         27, 22, 0, 44, null), //2nd layer
                 new FrogPosition(-69.25, -101.0625, -295.8125, 0, -89.9, 0, 1,
                         26, 27, 0, 44, null),
                 new FrogPosition(-136.125, -99.1875, -215.625, 0, 0, 0, 1,
                         22, 32, 0, 44, null), //
                 new FrogPosition(-40.0, -38.3125, -361.6875, 0, 0, 0, 2,
                         28, 23, 0, 44, null), //
                 new FrogPosition(-7.6875, -36.1875, -279.75, 0, 89.9, 0, 2,
                         30, 28, 0, 44, null),
                 new FrogPosition(-71.0, -51.1875, -231.8125, 0, 89.9, 0, 2,
                         26, 31, 0, 44, null), //
                 new FrogPosition(7.6875, -35.375, -374.125, 0, 89.9, 0, 2,
                         31, 22, 0, 44, null),
                 new FrogPosition(-152.0, -35.375, -200.0, 0, 0, 0, 2,
                         21, 33, 0, 44, null),
                 new FrogPosition(120.6875, -36.0, -199.75, 180, 0, 180, 3,
                         38, 33, 19, 44, null),
                 new FrogPosition(168.0, -164.0, -198.25, 180, 0, 180, 4,
                         41, 33, 0, 44, null), //
                 new FrogPosition(215.9375, -98.875, -361.6875, 0, 0, 0, 4,
                         44, 23, 28, 55, null) //
         )));
         FROG_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-168.0, -35.625, -120.0, 0, 89.9, 0, 0,
                         3, 4, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-120.0, -32.5625, -136.0, 0, 0, 0, 0,
                         6, 3, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-152.0, -38.25, -88.0, 0, -89.9, 0, 0,
                         4, 6, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-120.0, -33.9375, -72.0, 180, 0, 180, 0,
                         6, 7, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-88.0, -30.4375, -88.0, 0, -89.9, 0, 0,
                         8, 6, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-56.0, -27.75, -88.0, 0, 89.9, 0, 0,
                         10, 6, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-168.0, -34.0, 8.0, 0, 89.9, 0, 1,
                         3, 12, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-169.6875, -37.5, 56.0625, 0, 89.9, 0, 2,
                         3, 15, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition(-169.6875, -38.0625, 88.0625, 0, 90, 0, 2,
                         3, 17, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition(-119.9375, -34.5625, 137.6875, 180, 0, 180, 2,
                         6, 20, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition(-55.875, -31.0, 137.6875, 180, 0, 180, 2,
                         10, 20, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition(-88.0, -31.25, 72.0, 0, -89.9, 0, 2,
                         8, 16, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(-120.0, -32.8125, 56.0, 0, 0, 0, 2,
                         6, 15, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(56.0625, -31.5625, 137.6875, 180, 0, 180, 3,
                         17, 20, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition(104.0, -28.3125, 88.0, 0, 0, 0, 3,
                         20, 17, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(136.0, -30.75, 135.9375, 180, 0, 180, 3,
                         22, 20, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(168.0, -31.1875, 88.0, 0, -89.9, 0, 3,
                         24, 17, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(152.0, -30.1875, 40.0, 0, 0, 0, 3,
                         23, 14, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(152.0, -27.0, -8.0, 180, 0, 180, 4,
                         23, 11, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(55.875, -30.1875, -104.0, 0, 89.9, 0, 5,
                         17, 5, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(120.0, -26.8125, -120.0, 0, 89.9, 0, 5,
                         21, 4, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(168.0, -29.9375, -39.8125, 0, -89.9, 0, 5,
                         24, 9, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(167.9375, -29.9375, -87.6875, 0, -89.9, 9, 5,
                         24, 7, -1, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)})
         )));
         FROG_LOCATIONS.put("FOR2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-88.125, -147.6875, -7.75, 0, 89.9, 0, 0),
                 new FrogPosition(53.625, -140.625, -120.0, 0, -89.9, 0, 1),
                 new FrogPosition(-40.0, -36.375, -168.0, 180, 0, 180, 2),
                 new FrogPosition(-119.75, -36.9375, -135.0, 180, 0, 180, 2),
                 new FrogPosition(-150.0625, -100.75, -152.4375, 180, 0, 180, 2),
                 new FrogPosition(-150.0, -102.3125, -84.75, 0, 0, 0, 3),
                 new FrogPosition(-216.125, -132.75, 168.9375, 0, 0, 0, 3),
                 new FrogPosition(-232.0, -128.6875, -360.0, 0, 89.9, 0, 4),
                 new FrogPosition(-135.75, -38.3125, -392.125, 0, 0, 0, 5),
                 new FrogPosition(-39.875, -62.5, -327.8125, 0, -89.9, 0, 5),
                 new FrogPosition(-56.0, -36.3125, -376.0, 0, -89.9, 0, 5),
                 new FrogPosition(-40.9375, -78.625, -264.125, 0, -89.9, 0, 5),
                 new FrogPosition(216.0, -36.375, -376.0, 0, -89.9, 0, 6),
                 new FrogPosition(216.0, -36.125, -248.0, 0, -89.9, 0, 6),
                 new FrogPosition(103.3125, -72.0, -248.3125, 0, 0, 0, 7),
                 new FrogPosition(212.0625, -78.375, -341.1875, 0, -89.9, 0, 7),
                 new FrogPosition(106.625, -96.25, -118.4375, 0, 89.9, 0, 8)
         )));
         FROG_LOCATIONS.put("VOL1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-56.0, -63.9375, -24.0, 180, 0, 180, 1),
                 new FrogPosition(40.0625, -64.0, -24.0, 180, 0, 180, 1),
                 new FrogPosition(-8.0, -64.0, 8.0, 180, 0, 180, 1),
                 new FrogPosition(-39.875, -64.0, 39.9375, 180, 0, 180, 1),
                 new FrogPosition(24.0625, -64.0, 39.9375, 180, 0, 180, 1),
                 new FrogPosition(-71.875, -74.25, 55.9375, 180, 0, 180, 1),
                 new FrogPosition(56.0625, -71.5625, 55.9375, 180, 0, 180, 1),
                 new FrogPosition(-104.0, -80.0, 120.0, 180, 0, 180, 1),
                 new FrogPosition(-8.0, -64.0, 104.0, 180, 0, 180, 1),
                 new FrogPosition(88.0, -68.875, 120.0, 180, 0, 180, 1),
                 new FrogPosition(24.0625, -64.0, 119.9375, 180, 0, 180, 1),
                 new FrogPosition(-39.875, -64.0, 119.9375, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("VOL2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-120.125, -87.1875, 151.8125, 180, 0, 180, 1),
                 new FrogPosition(-88.0, -71.1875, 88.0, 0, 0, 0, 1),
                 new FrogPosition(-104.0, -111.1875, -24.0, 0, 0, 0, 1),
                 new FrogPosition(-103.9375, -71.25, -40.5, 0, 0, 0, 1),
                 new FrogPosition(-8.0, -37.5625, 88.0, 180, 0, 180, 1),
                 new FrogPosition(40.0, -39.0625, 56.0, 0, 89.9, 0, 1),
                 new FrogPosition(71.8125, -87.1875, 151.8125, 180, 0, 180, 1),
                 new FrogPosition(72.0, -71.25, 88.0625, 0, 89.9, 0, 1),
                 new FrogPosition(87.6875, -71.1875, -40.75, 0, 0, 0, 1),
                 new FrogPosition(88.0, -112.125, -24.0, 0, 0, 0, 1)
         )));
         FROG_LOCATIONS.put("VOL3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-56.125, -187.1875, -88.125, 0, 0, 0, 1),
                 new FrogPosition(72.0, -80.0, 8.0, 0, 0, 0, 1),
                 new FrogPosition(72.0, -16.0, 56.0, 0, 0, 0, 1),
                 new FrogPosition(-24.0, -144.0, 40.0, 0, 89.9, 0, 1),
                 new FrogPosition(-40.0, -16.0, -72.0, 0, 0, 0, 1)
         )));
         FROG_LOCATIONS.put("CAV1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(40.0, -7.125, -200.0, 0, 0, 0, 0,
                         15, 2, 6, 31, null),
                 new FrogPosition(-88.0, 0.0, -200.0, 0, 0, 0, 0,
                         7, 2, 1, 31, null),
                 new FrogPosition(-136.0, 0.0, -200.0, 0, 0, 0, 1,
                         4, 2, 0, 31, null),
                 new FrogPosition(-120.0, 0.0, -152.0, 180, 0, 180, 1,
                         5, 5, 20, 31, null),
                 new FrogPosition(-151.875, 0.0, -88.0, 180, 0, 180, 2,
                         3, 9, 6, 31, null),
                 new FrogPosition(-152.0, 0.0, 8.0, 180, 0, 180, 2,
                         3, 15, 16, 31, null),
                 new FrogPosition(-152.0, -18.6875, 56.0, 180, 0, 180, 3,
                         3, 18, 29, 31, null),
                 new FrogPosition(-151.9375, 2.4375, 119.0, 180, 0, 180, 3,
                         3, 22, 11, 31, null),
                 new FrogPosition(-87.8125, 2.4375, 119.0, 180, 0, 180, 4,
                         7, 22, 3, 31, null),
                 new FrogPosition(-23.8125, 2.125, 119.0, 180, 0, 180, 4,
                         11, 22, 3, 31, null),
                 new FrogPosition(-39.8125, 2.4375, 87.0, 180, 0, 180, 4,
                         10, 20, 12, 31, null),
                 new FrogPosition(8.0, -8.375, 88.0, 0, -89.9, 0, 4,
                         13, 20, 16, 31, null),
                 new FrogPosition(24.0, -4.1875, 72.0, 180, 0, 180, 4,
                         14, 19, 6, 31, null),
                 new FrogPosition(103.0, 1.25, 103.8125, 0, -89.9, 0, 5,
                         19, 21, 35, 31, null),
                 new FrogPosition(88.0, -4.1875, 24.0, 180, 0, 180, 5,
                         18, 16, 2, 31, null),
                 new FrogPosition(104.0, 0.0, -24.0, 180, 0, 180, 6,
                         19, 13, 16, 31, null),
                 new FrogPosition(88.0, -3.5625, -72.0, 0, 0, 0, 6,
                         18, 10, 9, 31, null),
                 new FrogPosition(72.0, -7.125, -200.0, 0, 0, 0, 7,
                         17, 2, 7, 31, null)
         )));
         FROG_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-104.0625, -819.6875, 24.0625, 180, 0, 180, 1,
                         13, 53, 12, 17, null),
                 new FrogPosition(-104.0, -695.0, 424.0, 180, 0, 180, 1,
                         13, 78, 7, 17, null), //
                 new FrogPosition(87.75, -620.5625, 600.1875, 0, -89.9, 0, 1,
                         25, 89, 8, 17, null),
                 new FrogPosition(71.75, -576.75, 312.1875, 0, 0, 0, 1,
                         24, 71, 7, 17, null),
                 new FrogPosition(-8.4375, -568.5625, 266.0, 180, 0, 180, 1,
                         19, 68, 7, 17, null), //
                 new FrogPosition(39.75, -518.4375, -23.75, 180, 0, 180, 1,
                         22, 50, 7, 17, null),
                 new FrogPosition(71.75, -480.25, -231.75, 0, 0, 0, 1,
                         24, 37, 8, 17, null),
                 new FrogPosition(40.0, -342.0625, -552.0, 180, 0, 180, 1,
                         22, 17, 7, 17, null), //
                 new FrogPosition(71.75, -362.375, -503.75, 180, 0, 180, 1,
                         24, 20, 7, 17, null),
                 new FrogPosition(231.4375, -319.5625, -663.75, 0, -89.9, 0, 1,
                         34, 10, 7, 17, null),
                 new FrogPosition(248.0, -272.5625, -312.0, 180, 0, 180, 1,
                         35, 32, 7, 17, null), //
                 new FrogPosition(151.4375, -260.9375, -247.5625, 180, 0, 180, 1,
                         29, 36, 12, 17, null),
                 new FrogPosition(231.4375, -219.3125, -7.5625, 180, 0, 180, 1,
                         34, 51, 8, 17, null),
                 new FrogPosition(183.4375, -66.0, 456.375, 180, 0, 180, 1,
                         31, 80, 5, 17, null),
                 new FrogPosition(216.0, -30.0625, 552.0, 180, 0, 180, 1,
                         33, 86, 27, 17, null), //
                 new FrogPosition(199.875, -18.5, 628.6875, 180, 0, 180, 1,
                         32, 91, 27, 17, null)
         )));
         FROG_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-23.9375, -31.1875, -376.0, 180, 0, 180, 0,
                         15, 8, 10, 5, null),
                 new FrogPosition(-104.125, -31.1875, -440.1875, 0, 0, 0, 1,
                         10, 4, 13, 5, null), //
                 new FrogPosition(-103.9375, -31.1875, -376.0, 0, 89.9, 0, 1,
                         10, 8, 29, 5, null),
                 new FrogPosition(-183.9375, -31.1875, -280.0, 180, 0, 180, 2,
                         5, 14, 3, 5, null),
                 new FrogPosition(-200.0, -32.0, -232.0, 0, 89.9, 0, 2,
                         4, 17, 22, 5, null),
                 new FrogPosition(-184.0625, -31.9375, -90.4375, 0, 0, 0, 3,
                         5, 26, 17, 5, null), //
                 new FrogPosition(-56.0, -32.0, -88.0, 0, 0, 0, 3,
                         13, 26, 17, 5, null),
                 new FrogPosition(-40.0, -32.0, -232.0, 0, -89.9, 0, 4,
                         14, 17, 10, 5, null),
                 new FrogPosition(216.0, 0.125, -455.3125, 0, -89.9, 0, 5,
                         30, 3, 28, 5, null),
                 new FrogPosition(151.8125, -31.5, -407.625, 0, 0, 0, 5, //
                         26, 6, 11, 5, null),
                 new FrogPosition(104.0, -31.4375, -424.0, 180, 0, 180, 5,
                         23, 5, 26, 5, null),
                 new FrogPosition(120.0, -31.4375, -376.0, 0, -89.9, 0, 5,
                         24, 8, 11, 5, null),
                 new FrogPosition(56.0, -31.4375, -296.0, 0, -89.9, 0, 5,
                         20, 13, 28, 5, null),
                 new FrogPosition(200.0, -31.4375, -280.0, 0, 0, 0, 5,
                         29, 14, 2, 5, null),
                 new FrogPosition(200.0, -47.9375, -216.0, 0, 0, 0, 6,
                         29, 18, 10, 5, null),
                 new FrogPosition(120.0, -47.9375, -152.0, 180, 0, 180, 6,
                         24, 22, 30, 5, null),
                 new FrogPosition(135.875, -47.9375, -106.4375, 0, 0, 0, 6,
                         25, 25, 11, 5, null), //
                 new FrogPosition(216.0, -32.0, -56.0, 0, -89.9, 0, 6,
                         30, 28, 4, 5, null),
                 new FrogPosition(40.0, -47.9375, -88.0, 0, -89.9, 0, 6,
                         19, 26, 30, 5, null),
                 new FrogPosition(-136.0, 0.0, -40.0, 180, 0, 180, 7,
                         8, 29, 11, 5, null),
                 new FrogPosition(-152.0625, 2.125, 69.5, 0, 0, 0, 8,
                         7, 36, 30, 5, null), //
                 new FrogPosition(-40.0, 0.0, -8.0, 180, 0, 180, 8,
                         14, 31, 8, 5, null),
                 new FrogPosition(40.0, 0.0, 88.0, 180, 0, 180, 8,
                         19, 37, 4, 5, null),
                 new FrogPosition(104.0, 0.0, 8.0, 0, -89.9, 0, 8,
                         23, 32, 14, 5, null)
         )));
         FROG_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-215.875, -45.0625, -39.75, 0, 89.9, 0, 1,
                         8, 20, 0, 1, null),
                 new FrogPosition(-215.625, -75.3125, 136.125, 0, 89.9, 0, 2,
                         8, 31, 0, 1, null),
                 new FrogPosition(-55.625, -71.0, 88.125, 0, 89.9, 0, 3,
                         18, 28, 0, 1, null),
                 new FrogPosition(-24.125, -45.125, -23.625, 0, 0, 0, 3,
                         20, 21, 0, 1, null),
                 new FrogPosition(104.125, -76.25, 7.875, 0, 0, 0, 4,
                         28, 23, 0, 1, null),
                 new FrogPosition(119.8125, -81.0, -119.625, 0, 0, 0, 4,
                         29, 15, 0, 1, null),
                 new FrogPosition(200.0, -43.9375, 120.0, 180, 0, 180, 5,
                         34, 30, 0, 1, null)
         )));
         FROG_LOCATIONS.put("SKY2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-184.0, -173.0, -329.6875, 0, 0, 0, 1,
                         12, 13, 0, 6, null),
                 new FrogPosition(56.125, -78.0, -263.9375, 0, 0, 0, 1,
                         27, 17, 0, 6, null),
                 new FrogPosition(247.9375, -195.6875, -105.6875, 0, 0, 0, 1,
                         39, 27, 0, 6, null),
                 new FrogPosition(136.0625, -80.1875, -119.0, 0, -89.9, 0, 1,
                         32, 26, 0, 6, null),
                 new FrogPosition(-88.0625, -73.375, -183.9375, 0, 89.9, 0, 1,
                         18, 22, 0, 6, null),
                 new FrogPosition(136.25, -75.0, 25.625, 0, -89.9, 0, 1,
                         32, 35, 0, 6, null),
                 new FrogPosition(-55.8125, -88.25, 23.9375, 0, -89.9, 0, 1,
                         20, 35, 0, 6, null),
                 new FrogPosition(-328.0, -100.9375, 54.25, 0, 0, 0, 1,
                         3, 37, 0, 6, null),
                 new FrogPosition(-87.9375, -102.875, 168.8125, 0, 89.9, 0, 1,
                         18, 44, 0, 6, null),
                 new FrogPosition(8.0, -89.5625, 137.5625, 180, 0, 180, 1,
                         24, 42, 0, 6, null),
                 new FrogPosition(104.375, -80.125, 169.6875, 0, -89.9, 0, 1,
                         30, 44, 0, 6, null),
                 new FrogPosition(216.3125, -34.8125, 294.4375, 0, 0, 0, 1,
                         37, 52, 0, 6, null),
                 new FrogPosition(185.25, -32.6875, 232.25, 180, 0, 180, 1,
                         35, 48, 0, 6, null)
         )));
         FROG_LOCATIONS.put("SKY3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(377.6875, -80.125, -152.0, 0, -89.9, 0, 1,
                         48, 11 ,1, 0, null), //
                 new FrogPosition(377.6875, -68.3125, -312.0, 0, -89.9, 0, 1,
                         48, 1 ,1, 0, null), //
                 new FrogPosition(328.125, -72.625, -311.6875, 0, 0, 0, 1,
                         45, 1 ,1, 0, null),
                 new FrogPosition(104.9375, -75.1875, -151.8125, 0, 89.9, 0, 1,
                         31, 11 ,1, 0, null), //
                 new FrogPosition(184.0625, -80.9375, -168.1875, 180, 0, 180, 1,
                         36, 10 ,1, 0, null),
                 new FrogPosition(120.9375, -80.0, -231.8125, 0, 89.9, 0, 1,
                         32, 6 ,1, 0, null), //
                 new FrogPosition(183.6875, -81.375, -311.75, 0, 0, 0, 1,
                         36, 1 ,1, 0, null),
                 new FrogPosition(104.9375, -88.6875, -311.8125, 0, 89.9, 0, 1,
                         31, 1 ,1, 0, null) //
         )));
         FROG_LOCATIONS.put("SKY4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-231.6875, -36.5, 7.125, 0, 89.9, 0, 1,
                         10, 26, 0, 1, null),
                 new FrogPosition(-215.625, -65.0, 136.125, 0, 89.9, 0, 1,
                         11, 34, 0, 1, null),
                 new FrogPosition(-55.625, -64.625, 88.125, 0, 89.9, 0, 1,
                         21, 31, 0, 1, null),
                 new FrogPosition(-24.125, -38.6875, -23.625, 0, 0, 0, 1,
                         23, 24, 0, 1, null),
                 new FrogPosition(104.125, -70.0, 7.875, 0, -89.9, 0, 1,
                         31, 26, 0, 1, null),
                 new FrogPosition(119.8125, -74.75, -119.625, 0, 0, 0, 1,
                         32, 18, 0, 1, null),
                 new FrogPosition(168.125, -36.0, 119.625, 180, 0, 180, 1,
                         35, 33, 0, 1, null)
         )));
         FROG_LOCATIONS.put("SWP1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-168.0, -62.0625, 248.1875, 0, 0, 0, 1),
                 new FrogPosition(-184.0, -80.0, 120.0, 0, 89.9, 0, 1),
                 new FrogPosition(-120.8125, -112.75, 104.0, 0, 0, 0, 1),
                 new FrogPosition(-104.0, -64.0, 88.0, 0, -89.9, 0, 1),
                 new FrogPosition(-134.625, -63.6875, 263.9375, 180, 0, 180, 1),
                 new FrogPosition(-72.0625, -112.375, 119.875, 0, 89.9, 0, 1),
                 new FrogPosition(-88.0, -64.0, 232.0, 0, 89.9, 0, 1),
                 new FrogPosition(56.0, -96.0, 104.0, 0, 0, 0, 1),
                 new FrogPosition(56.0, -64.0, 168.0, 0, -89.9, 0, 1),
                 new FrogPosition(152.0, -64.0, 264.0, 0, 0, 0, 1),
                 new FrogPosition(168.0, -68.125, 152.0, 0, 0, 0, 1),
                 new FrogPosition(184.0, -66.6875, 72.0, 0, 0, 0, 1),
                 new FrogPosition(184.0, -66.375, -104.0, 0, -89.9, 0, 1)
         )));
         FROG_LOCATIONS.put("SWP2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-168.125, -64.125, 247.6875, 0, 0, 0, 1),
                 new FrogPosition(-136.0, -64.0, 88.0, 0, -89.9, 0, 1),
                 new FrogPosition(-71.9375, -80.4375, 103.9375, 180, 0, 180, 1),
                 new FrogPosition(-135.0, -63.75, 264.0, 180, 0, 180, 1),
                 new FrogPosition(-104.0, -64.0625, 264.0, 0, 0, 0, 1),
                 new FrogPosition(55.625, -64.3125, 280.0, 0, 0, 0, 1),
                 new FrogPosition(151.8125, -63.9375, 264.3125, 0, 0, 0, 1),
                 new FrogPosition(56.125, -112.125, 119.875, 0, 89.9, 0, 1),
                 new FrogPosition(168.0, -68.5, 152.0, 0, 0, 0, 1),
                 new FrogPosition(183.8125, -64.0, 72.3125, 0, 0, 0, 1)
         )));
         FROG_LOCATIONS.put("SWP3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-152.0, -128.4375, -40.0, 0, 0, 0, 1),
                 new FrogPosition(-200.0, -112.0, 40.0, 180, 0, 180, 1),
                 new FrogPosition(-184.0, -111.0, -216.0, 0, 0, 0, 2),
                 new FrogPosition(55.875, -62.0625, -214.3125, 0, 89.9, 0, 4),
                 new FrogPosition(216.0, -56.4375, -199.9375, 0, -89.9, 0, 4),
                 new FrogPosition(184.0, -46.0625, 72.0, 0, 0, 0, 4),
                 new FrogPosition(88.0, -40.3125, 200.0, 0, 89.9, 0, 4),
                 new FrogPosition(103.8125, -8.0, 104.4375, 0, 0, 0, 4),
                 new FrogPosition(-8.0, -49.375, 200.0, 0, 0, 0, 5)
         )));
         FROG_LOCATIONS.put("SWP4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(71.1875, -27.0, -53.625, -30, 0, -30, 1),
                 new FrogPosition(-8.125, -47.1875, -87.625, 0, 0, 0, 1),
                 //new FrogPosition(40.0, -47.875, -88.0, 0, -89.9, 0, 1), // Sadly can't hop on this tile in vanilla
                 new FrogPosition(40.0, -79.875, -40.0, 180, 0, 180, 1),
                 new FrogPosition(55.8125, -33.5625, 136.3125, 0, 0, 0, 1),
                 new FrogPosition(-88.0, -48.0, 168.0, 0, 0, 0, 1),
                 new FrogPosition(-119.8125, -125.875, 167.875, 180, 0, 180, 1),
                 new FrogPosition(-120.0, -78.375, -136.0, 0, 0, 0, 1)
         )));
         FROG_LOCATIONS.put("SWP5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-24.9375, -159.0, -264.0, 0, 0, 0, 0),
                 new FrogPosition(-184.0, -153.5625, -264.0, 0, 0, 0, 1),
                 new FrogPosition(-185.1875, -153.5625, -119.9375, 180, 0, 180, 1),
                 new FrogPosition(-344.0, -152.0, -296.0, 0, 0, 0, 1),
                 new FrogPosition(-328.0, -185.5625, -72.0, 0, 0, 0, 2),
                 new FrogPosition(104.0, -61.75, 119.9375, 0, -89.9, 0, 3),
                 new FrogPosition(296.0, 0.0, 135.875, 0, -89.9, 0, 3),
                 new FrogPosition(232.0, 0.0, -88.0, 0, 0, 0, 4),
                 new FrogPosition(-184.0, -73.375, -40.0, 0, 0, 0, 5),
                 new FrogPosition(-200.0, -72.25, 183.9375, 180, 0, 180, 5),
                 new FrogPosition(-264.0, -89.5625, 72.0, 0, 0, 0, 6),
                 new FrogPosition(-328.0, -110.8125, 40.0, 0, 0, 0, 6),
                 new FrogPosition(-344.0, -126.8125, 248.0, 0, 89.9, 0, 7),
                 new FrogPosition(-392.0, -70.8125, 264.0, 0, 89.9, 0, 8),
                 new FrogPosition(-168.0, -151.0, 264.0, 0, -89.9, 0, 8)
         )));
         FROG_LOCATIONS.put("DES1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(216.0, -0.0625, -231.9375, 0, 0, 0, 0,
                         35, 8, 1, 25, null),
                 new FrogPosition(-231.9375, -1.0625, -231.9375, 0, 0, 0, 0,
                         7, 8, 0, 25, null),
                 new FrogPosition(-8.0, 0.0, -87.9375, 0, 0, 0, 0,
                         21, 17, 19, 25, null),
                 new FrogPosition(-120.25, -93.1875, -120.125, 0, -89.9, 0, 1,
                         14, 15, 9, 25, null), //
                 new FrogPosition(-168.0, -132.125, -8.0, 0, -89.9, 0, 1,
                         11, 22, 1, 25, null),
                 new FrogPosition(-232.25, -96.0, 232.375, 180, 0, 180, 2,
                         7, 37, 6, 25, null),
                 new FrogPosition(-55.8125, 3.0, 167.625, 180, 0, 180, 2,
                         18, 33, 1, 25, null), //
                 new FrogPosition(-40.0, -16.0, 40.0, 0, 0, 0, 2,
                         19, 25, 11, 25, null),
                 new FrogPosition(-136.0, -8.0, 8.0, 0, 89.9, 0, 2,
                         13, 23, 26, 25, null),
                 new FrogPosition(136.0, 0.0, -72.0, 0, 0, 0, 2,
                         30, 18, 1, 25, null),
                 new FrogPosition(72.125, -5.6875, 167.625, 180, 0, 180, 2,
                         26, 33, 1, 25, null), //
                 new FrogPosition(232.0, -96.0, 232.5, 0, -89.9, 0, 2,
                         36, 37, 1, 25, null),
                 new FrogPosition(152.0, -96.0, -8.0, 0, 89.9, 0, 3,
                         31, 22, 11, 25, null),
                 new FrogPosition(120.3125, -93.25, -119.8125, 0, 89.9, 0, 3,
                         29, 15, 28, 25, null), //
                 new FrogPosition(-7.8125, -72.0, -120.3125, 180, 0, 180, 3,
                         21, 15, 1, 25, null) //
         )));
         FROG_LOCATIONS.put("DES2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-88.0, -111.9375, 40.0, 0, 89.9, 0, 0,
                         15, 24, 0, 70, null),
                 new FrogPosition(-56.1875, -95.0625, -23.4375, 0, -89.9, 0, 0,
                         17, 20, 0, 70, null),
                 new FrogPosition(-200.375, -96.3125, -182.875, 0, 0, 0, 0,
                         8, 10, 0, 70, null),
                 new FrogPosition(-199.8125, -390.0, 199.625, 180, 0, 180, 1,
                         8, 34, 0, 70, null), //
                 new FrogPosition(-167.8125, -276.6875, 215.625, 180, 0, 180, 1,
                         10, 35, 0, 70, null), //
                 new FrogPosition(-56.0, -96.0, 216.0, 0, 89.9, 0, 2,
                         17, 35, 49, 70, null),
                 new FrogPosition(120.0, -94.0, -104.0, 0, -89.9, 0, 3,
                         28, 15, 48, 70, null),
                 new FrogPosition(-40.1875, 0.0, -70.9375, 0, 89.9, 0, 3,
                         18, 17, 34, 70, null),
                 new FrogPosition(56.125, 3.0, 71.625, 180, 0, 180, 3,
                         24, 26, 0, 70, null), //
                 new FrogPosition(120.0, -96.0, -24.0, 180, 0, 180, 4,
                         28, 20, 22, 70,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(39.875, -191.0, 197.5, 0, 0, 0, 4,
                         23, 34, 0, 70, null), //
                 new FrogPosition(168.125, -351.25, 215.625, 180, 0, 180, 5,
                         31, 35, 0, 70, null) //
         )));
         FROG_LOCATIONS.put("DES3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-7.9375, -101.5625, -152.0, 0, 0, 0, 0,
                         11, 9, 12, 3, null),
                 new FrogPosition(-88.0, -101.5, -232.5625, 0, 0, 0, 0,
                         6, 4, 0, 0, null),
                 new FrogPosition(-88.125, -152.0, -151.625, 0, 0, 0, 1,
                         6, 9, 0, 3, null), //
                 new FrogPosition(-8.125, -152.0, -231.625, 0, 89.9, 0, 2,
                         11, 4, 0, 3, null), //
                 new FrogPosition(-104.0, -100.9375, 40.0, 180, 0, 180, 3,
                         5, 21, 0, 3, null), //
                 new FrogPosition(-120.0, -100.9375, 56.0, 0, -89.9, 0, 4,
                         4, 22, 18, 3, null),
                 new FrogPosition(-136.0, -101.6875, 216.0, 180, 0, 180, 5,
                         3, 32, 0, 3, null), //
                 new FrogPosition(88.0, -100.9375, 216.0, 180, 0, 180, 5,
                         17, 32, 0, 3, null), //
                 new FrogPosition(120.0, -100.3125, 72.0, 180, 0, 180, 6,
                         19, 23, 0, 3, null)
         )));
         FROG_LOCATIONS.put("DES4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(72.0, 0.0, -231.9375, 0, 0, 0, 0,
                         26, 8, 5, 24, null),
                 new FrogPosition(-231.9375, 0.0, -231.9375, 0, 0, 0, 0,
                         7, 8, 5, 24, null),
                 new FrogPosition(-120.3125, -95.9375, -120.125, 0, -89.9, 0, 1,
                         14, 15, 5, 24, null), //
                 new FrogPosition(-232.0, -132.125, 104.0, 0, 89.9, 0, 1,
                         7, 29, 2, 24, null),
                 new FrogPosition(-200.0, -94.9375, 232.0, 180, 0, 180, 2,
                         9, 37, 6, 24, null),
                 new FrogPosition(-56.0, 0.0, 136.0, 180, 0, 180, 2,
                         18, 31, 5, 24, null), //
                 new FrogPosition(72.125, -5.9375, 167.625, 180, 0, 180, 2,
                         26, 33, 5, 24, null), //
                 new FrogPosition(-136.0, 0.0, -88.0, 0, 89.9, 0, 3,
                         13, 17, 38, 24, null),
                 new FrogPosition(-39.9375, 0.0, -24.3125, 180, 0, 180, 3,
                         19, 21, 51, 24, null),
                 new FrogPosition(24.0, 0.0, -104.0, 180, 89.9, 180, 3,
                         23, 16, 25, 24,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition(104.0625, -8.0625, -6.6875, 180, 0, 180, 3,
                         28, 22, 38, 24, null),
                 new FrogPosition(200.0, -96.0, -40.0, 0, -89.9, 0, 4,
                         34, 20, 28, 24, null),
                 new FrogPosition(120.3125, -95.9375, -119.8125, 0, 89.9, 0, 4,
                         29, 15, 28, 24, null), //
                 new FrogPosition(-7.8125, -72.0, -120.3125, 180, 0, 180, 4,
                         21, 15, 5, 24, null) //
         )));
         FROG_LOCATIONS.put("DES5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-200.375, -96.3125, -182.875, 0, 0, 0, 0,
                         8, 10, 3, 41, null),
                 new FrogPosition(120.0, -96.0, -104.0, 0, 0, 0, 1,
                         28, 15, 0, 41, null), //
                 new FrogPosition(-56.0, -96.0, 120.0, 180, 0, 180, 2,
                         17, 29, 15, 41, null),
                 new FrogPosition(-120.0, -194.5, 88.0, 0, 89.9, 0, 2,
                         13, 27, 0, 41, null),
                 new FrogPosition(-199.8125, -390.375, 201.9375, 180, 0, 180, 3,
                         8, 34, 0, 41, null), //
                 new FrogPosition(88.0, -96.0, 200.0, 0, -89.9, 0, 4,
                         26, 34, 0, 41, null),
                 new FrogPosition(168.375, -351.9375, 218.375, 180, 0, 180, 5,
                         31, 35, 0, 41, null), //
                 new FrogPosition(56.0, 0.0, 72.0, 0, -89.9, 0, 6,
                         24, 26, 0, 41, null),
                 new FrogPosition(88.0, 0.0, -152.0, 0, 89.9, 0, 7,
                         26, 12, 0, 41, null),
                 new FrogPosition(232.0, 0.0, -24.0, 180, 0, 180, 7,
                         35, 20, 0, 41, null), //
                 new FrogPosition(-56.25, -0.1875, -199.125, 180, 0, 180, 8,
                         17, 9, 0, 41, null),
                 new FrogPosition(-232.375, 0.0, -198.875, 180, 0, 180, 8,
                         6, 9, 11, 41, null),
                 new FrogPosition(-184.0, -8.0, 8.0, 180, 0, 180, 9,
                         9, 22, 0, 41, null) //
         )));
         FROG_LOCATIONS.put("JUN1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(152.1875, -8.8125, -424.5, 0, 0, 0, 0,
                         23, 3, 8, 1, null),
                 new FrogPosition(-136.0, -11.1875, -424.0, 0, 0, 0, 1, //
                         5, 3, 8, 1, null),
                 new FrogPosition(-39.5, -12.5, -343.3125, 0, 0, 0, 2,
                         11, 8, 15, 1, null),
                 new FrogPosition(168.5625, -37.3125, -296.25, 0, -89.9, 0, 3,
                         24, 11, -1, -1, null),
                 new FrogPosition(136.0, -64.0, -168.0, 180, 0, 180, 4, //
                         22, 19, 8, 1, null),
                 new FrogPosition(-55.75, -43.9375, -232.5, 0, -89.9, 0, 5,
                         10, 15, 23, 1,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)}),
                 new FrogPosition(8.3125, -54.6875, -150.875, 0, 89.9, 0, 6,
                         14, 20, 28, 1,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)}),
                 new FrogPosition(-71.75, -112.9375, -72.5, 0, -89.9, 0, 6,
                         9, 25, 28, 1, null),
                 new FrogPosition(-71.75, -136.4375, -24.5, 0, -89.9, 0, 7,
                         9, 28, 21, 1, null),
                 new FrogPosition(-8.0, -166.0625, -40.0, 0, 0, 0, 8, //
                         13, 27, 8, 1, null),
                 new FrogPosition(88.3125, -116.5625, -24.375, 0, -89.9, 0, 9,
                         19, 28, 21, 1, null),
                 new FrogPosition(152.0, -162.125, 56.0, 0, 0, 0, 10,
                         23, 33, 8, 1, null), //
                 new FrogPosition(120.1875, -182.4375, 119.4375, 0, -89.9, 0, 10,
                         21, 37, 44, 46, null),
                 new FrogPosition(-72.0, -182.875, 104.0, 0, 0, 0, 10, //
                         9, 36, 44, 46, null),
                 new FrogPosition(-135.75, -150.75, 135.4375, 0, 89.9, 0, 10,
                         5, 38, 45, 46,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)})
         )));
     }



     public static Map<String, ArrayList<StartPosition>> START_LOCATIONS = new HashMap<>();
     static {
         START_LOCATIONS.put("ORG1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 1, StartRotation.NORTH, 0) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1)
         )));
         START_LOCATIONS.put("ORG2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 1, StartRotation.NORTH, 0) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1)
         )));
         START_LOCATIONS.put("ORG3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 1, StartRotation.NORTH, 0) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1)
         )));
         START_LOCATIONS.put("ORG4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 1, StartRotation.NORTH, 0) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1)
         )));
         START_LOCATIONS.put("ORG5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 1, StartRotation.NORTH, 0) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1)
         )));
         START_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 21, StartRotation.NORTH, 0,
                         13, 47, null),
                 new StartPosition(23, 26, StartRotation.EAST, 1,
                         14, 47, null),
                 new StartPosition(16, 42, StartRotation.EAST, 2,
                         13, 47, null),
                 new StartPosition(19, 38, StartRotation.NORTH, 2,
                         13, 47, null),
                 new StartPosition(37, 42, StartRotation.SOUTH, 2,
                         13, 47, null),
                 new StartPosition(50, 42, StartRotation.WEST, 3,
                         14, 47, null),
                 new StartPosition(51, 29, StartRotation.EAST, 5,
                         13, 47, null),
                 new StartPosition(47, 22, StartRotation.NORTH, 5,
                         13, 47, null)
         )));
         START_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(26, 6, StartRotation.NORTH, 0,
                         2, 12, null), //
                 new StartPosition(19, 26, StartRotation.WEST, 1,
                         2, 12, null),
                 new StartPosition(21, 34, StartRotation.SOUTH, 2,
                         2, 12, null),
                 new StartPosition(31, 29, StartRotation.WEST, 3,
                         2, 12, null)
         )));
         START_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(21, 6, StartRotation.NORTH, 0,
                         0, 43, null), //
                 new StartPosition(5, 11, StartRotation.EAST, 1,
                         0, 43, null),
                 new StartPosition(17, 17, StartRotation.EAST, 2,
                         0, 43, null),
                 new StartPosition(14, 24, StartRotation.SOUTH, 2,
                         36, 43,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new StartPosition(16, 38, StartRotation.SOUTH, 3,
                         0, 43, null),
                 new StartPosition(25, 31, StartRotation.EAST, 4,
                         17, 43,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new StartPosition(39, 24, StartRotation.NORTH, 4,
                         0, 43, null),
                 new StartPosition(29, 10, StartRotation.SOUTH, 5,
                         12, 43, null),
                 new StartPosition(35, 11, StartRotation.WEST, 5,
                         0, 43, null)
         )));
         START_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 24, StartRotation.NORTH, 0,
                         9, 19, null), //
                 new StartPosition(23, 29, StartRotation.EAST, 0,
                         14, 19, null),
                 new StartPosition(19, 41, StartRotation.NORTH, 2,
                         9, 19, null),
                 new StartPosition(32, 39, StartRotation.EAST, 3,
                         9, 19, null),
                 new StartPosition(37, 45, StartRotation.SOUTH, 3,
                         14, 19, null),
                 new StartPosition(56, 41, StartRotation.NORTH, 4,
                         14, 19, null),
                 new StartPosition(47, 32, StartRotation.WEST, 5,
                         9, 19, null)
         )));
         START_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(33, 7, StartRotation.NORTH, 0,
                         0, 9, null), //
                 new StartPosition(20, 12, StartRotation.EAST, 0,
                         0, 9, null),
                 new StartPosition(20, 27, StartRotation.EAST, 1,
                         3, 9, null),
                 new StartPosition(36, 22, StartRotation.SOUTH, 2,
                         29, 9, null),
                 new StartPosition(38, 30, StartRotation.WEST, 3,
                         0, 9, null)
         )));
         START_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(9, 3, StartRotation.NORTH, 0,
                         3, 30, //
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(5))),
                 new StartPosition(3, 9, StartRotation.EAST, 1,
                         -1, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(0, 5))),
                 new StartPosition(3, 19, StartRotation.EAST, 2,
                         -1, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(3))),
                 new StartPosition(15, 20, StartRotation.SOUTH, 3,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(2))),
                 new StartPosition(24, 15, StartRotation.WEST, 3,
                         -1, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(4, 5))),
                 new StartPosition(24, 5, StartRotation.WEST, 5,
                         -1, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(0, 4))),
                 new StartPosition(19, 3, StartRotation.NORTH, 5,
                         -1, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList(0, 4)))
         )));
         START_LOCATIONS.put("FOR2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(15, 23, StartRotation.SOUTH, 0),
                 new StartPosition(15, 29, StartRotation.NORTH, 0),
                 new StartPosition(18, 26, StartRotation.EAST, 0),
                 new StartPosition(20, 19, StartRotation.WEST, 1),
                 new StartPosition(6, 5, StartRotation.WEST, 4,
                         new ArrayList<>(Arrays.asList(0, 1, 7, 8))),
                 new StartPosition(24, 15, StartRotation.SOUTH, 6,
                         new ArrayList<>(Arrays.asList(0, 1, 7, 8))),
                 new StartPosition(30, 10, StartRotation.WEST, 7,
                         new ArrayList<>(Arrays.asList(0, 1)))
         )));
         START_LOCATIONS.put("VOL1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(9, 2, StartRotation.NORTH, 0),
                 new StartPosition(2, 3, StartRotation.EAST, 0),
                 new StartPosition(16, 3, StartRotation.WEST, 0)
         )));
         START_LOCATIONS.put("VOL2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(9, 2, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("VOL3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(3, 3, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("CAV1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(11, 2, StartRotation.NORTH, 0,
                         3, 4, null,
                         new ArrayList<>(Arrays.asList(1, 7))),
                 new StartPosition(3, 7, StartRotation.EAST, 2,
                         23, 4, null,
                         new ArrayList<>(Arrays.asList(0, 1, 3))),
                 new StartPosition(5, 22, StartRotation.SOUTH, 4,
                         27, 4, null,
                         new ArrayList<>(Arrays.asList(3, 5))),
                 new StartPosition(15, 22, StartRotation.SOUTH, 4,
                         1, 4, null,
                         new ArrayList<>(Arrays.asList(3, 5))),
                 new StartPosition(19, 7, StartRotation.WEST, 6,
                         22, 4, null,
                         new ArrayList<>(Arrays.asList(0, 5, 7)))
         )));
         START_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(13, 12, StartRotation.NORTH, 0,
                        7,  2, null)
         )));
         START_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 5, StartRotation.NORTH, 0,
                         4, 21, null), //
                 new StartPosition(4, 16, StartRotation.EAST, 2,
                         13, 21, null),
                 new StartPosition(17, 17, StartRotation.NORTH, 4,
                          7, 21, null),
                 new StartPosition(6, 29, StartRotation.EAST, 7,
                         24, 21, null),
                 new StartPosition(23, 29, StartRotation.WEST, 7,
                         23, 21, null),
                 new StartPosition(16, 37, StartRotation.SOUTH, 8,
                         17, 21, null)
         )));
         START_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(20, 15, StartRotation.NORTH, 0,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList(1))),
                 new StartPosition(10, 30, StartRotation.EAST, 2,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList(1))),
                 new StartPosition(30, 13, StartRotation.NORTH, 4,
                         0, 2, null),
                 new StartPosition(32, 31, StartRotation.SOUTH, 5,
                         0, 2, null)
         )));
         START_LOCATIONS.put("SKY2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(23, 8, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("SKY3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(3, 9, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("SKY4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(23, 18, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("SWP1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 10, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("SWP2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(10, 10, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("SWP3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(15, 4, StartRotation.NORTH, 0),
                 new StartPosition(13, 16, StartRotation.NORTH, 1), //TODO: Check if need to move so camera doesn't flip out
                 new StartPosition(17, 16, StartRotation.NORTH, 3) //TODO: Check if need to move so camera doesn't flip out
         )));
         START_LOCATIONS.put("SWP4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(14, 12, StartRotation.NORTH, 0),
                 new StartPosition(11, 15, StartRotation.EAST, 0),
                 new StartPosition(17, 15, StartRotation.WEST, 0)
         )));
         START_LOCATIONS.put("SWP5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(25, 5, StartRotation.NORTH, 0),
                 new StartPosition(15, 3, StartRotation.NORTH, 1),
                 new StartPosition(26, 30, StartRotation.WEST, 3),
                 new StartPosition(15, 27, StartRotation.EAST, 5),
                 new StartPosition(9, 26, StartRotation.NORTH, 6,
                         new ArrayList<>(Arrays.asList(8))),
                 new StartPosition(3, 34, StartRotation.SOUTH, 6,
                         new ArrayList<>(Arrays.asList(8)))
         )));
         START_LOCATIONS.put("DES1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(21, 8, StartRotation.NORTH, 0,
                         1, 88, null), //
                 new StartPosition(7, 15, StartRotation.EAST, 1,
                         11, 88, null),
                 new StartPosition(21, 30, StartRotation.NORTH, 2,
                         1, 88, null),
                 new StartPosition(36, 15, StartRotation.WEST, 3,
                         1, 88, null)
         )));
         START_LOCATIONS.put("DES2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(8, 9, StartRotation.NORTH, 0,
                         0, 92, null), //
                 new StartPosition(9, 28, StartRotation.EAST, 1,
                         56, 92, null),
                 new StartPosition(26, 15, StartRotation.NORTH, 3,
                         38, 92, null),
                 new StartPosition(30, 20, StartRotation.SOUTH, 4,
                         30 , 92, null)
         )));
         START_LOCATIONS.put("DES3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(6, 4, StartRotation.NORTH, 0,
                         0, 80, null), //
                 new StartPosition(6, 9, StartRotation.NORTH, 1,
                         0, 80, null),
                 new StartPosition(11, 4, StartRotation.EAST, 2,
                         0, 80, null),
                 new StartPosition(3, 24, StartRotation.EAST, 4,
                         11, 80, null),
                 new StartPosition(11, 32, StartRotation.SOUTH, 5,
                         0, 80, null),
                 new StartPosition(15, 20, StartRotation.NORTH, 6,
                         15, 80, null)
         )));
         START_LOCATIONS.put("DES4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(21, 8, StartRotation.NORTH, 0,
                         5, 68, null), //
                 new StartPosition(7, 15, StartRotation.EAST, 1,
                         11, 68, null),
                 new StartPosition(21, 37, StartRotation.SOUTH, 2,
                         39, 68, null),
                 new StartPosition(36, 15, StartRotation.WEST, 4,
                         5, 68, null),
                 new StartPosition(22, 16, StartRotation.SOUTH, 4,
                         5, 68, null)
         )));
         START_LOCATIONS.put("DES5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(8, 9, StartRotation.NORTH, 0,
                         0, 93, null, //
                         new ArrayList<>(Arrays.asList(2))),
                 new StartPosition(17, 19, StartRotation.WEST, 0,
                         46, 93, null),
                 new StartPosition(26, 15, StartRotation.NORTH, 1,
                         36, 93, null),
                 new StartPosition(7, 29, StartRotation.EAST, 3,
                         14, 93, null),
                 new StartPosition(17, 34, StartRotation.EAST, 4,
                         0, 93, null),
                 new StartPosition(28, 20, StartRotation.SOUTH, 4,
                         14, 93, null),
                 new StartPosition(18, 17, StartRotation.EAST, 6,
                         31, 93, null,
                         new ArrayList<>(Arrays.asList(8))),
                 new StartPosition(34, 20, StartRotation.SOUTH, 7,
                         11, 93, null),
                 new StartPosition(6, 17, StartRotation.EAST, 9,
                         0, 93, null,
                         new ArrayList<>(Arrays.asList(8)))
         )));
         START_LOCATIONS.put("JUN1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(12, 3, StartRotation.NORTH, 0, //
                         44, 7,  // UVs of the default underlying dirt tile are backwards here so using a stone block
                         null, new ArrayList<>(Arrays.asList(2))),
                 new StartPosition(6, 3, StartRotation.NORTH, 1,
                         2, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList(2))),
                 new StartPosition(24, 17, StartRotation.WEST, 4,
                         24, 7,
                         new ByteUV[]{new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f)},
                         new ArrayList<>(Arrays.asList(3, 5))),
                 new StartPosition(13, 15, StartRotation.SOUTH, 5,
                         24, 7,
                         new ByteUV[]{new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f)},
                         new ArrayList<>(Arrays.asList(2, 4))),
                 new StartPosition(11, 20, StartRotation.SOUTH, 6,
                         26, 7, null),
                 new StartPosition(9, 25, StartRotation.WEST, 6,
                         28, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)}),
                 new StartPosition(9, 29, StartRotation.NORTH, 7,
                         21, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)}),
                 new StartPosition(19, 29, StartRotation.WEST, 9,
                         6, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList(8, 10))),
                 new StartPosition(6, 34, StartRotation.NORTH, 10,
                         44, 7, null,
                         new ArrayList<>(Arrays.asList(8, 9))),
                 new StartPosition(14, 38, StartRotation.SOUTH, 10,
                         44, 7, null,
                         new ArrayList<>(Arrays.asList(8, 9)))
         )));

     }


}
