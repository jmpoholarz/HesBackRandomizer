package net.highwayfrogs.editor.randomizer.data;

import net.highwayfrogs.editor.file.standard.psx.ByteUV;
import net.highwayfrogs.editor.games.sony.frogger.map.packets.FroggerMapFilePacketGeneral.FroggerMapStartRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapData {

     static ByteUV[] FULL_SQUARE_UVS = new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)};

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
                 new FrogPosition("ORG1_B1", -87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG1_B2", -39.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG1_B3", 8.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG1_B4", 56.125, -16.0, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG1_B5", 104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG2.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition("ORG2_B1", -87.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG2_B2", -39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG2_B3", 8.125, -12.9375, 87.625, 180, 0 ,180, 1),
                 new FrogPosition("ORG2_B4", 56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG2_B5", 104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG3.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition("ORG3_B1", -87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG3_B2", -39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG3_B3", 8.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG3_B4", 56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG3_B5", 104.125, -12.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG4.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition("ORG4_B1", -87.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG4_B2", -39.8125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG4_B3", 8.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG4_B4", 56.125, -15.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG4_B5", 104.125, -15.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("ORG5.MAP", new ArrayList<>(Arrays.asList(
                 //new FrogPosition(-88.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(-40.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(8.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(56.0, -16.0, -120.0, 0, 0, 0, 0),
                 //new FrogPosition(104.6875, -16.0, -120.0, 0, 0, 0, 0),
                 new FrogPosition("ORG5_B1", -87.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG5_B2", -39.8125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG5_B3", 8.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG5_B4", 56.125, -12.9375, 87.625, 180, 0, 180, 1),
                 new FrogPosition("ORG5_B5", 104.125, -12.9375, 87.625, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SUB1_A2", -216.0, -41.6875, -168.0, 0, -89.9, 0, 0,
                         25, 16, 0, 13, 31, null),
                 new FrogPosition("SUB1_A1", -360.0, -39.125, -136.0, 0, 89.9, 0, 0,
                         16, 18, 0, 13, 31, null),
                 new FrogPosition("SUB1_A3", -120.0, -48.6875, -8.0, 0, 89.9, 0, 0,
                         31, 26, 0, 13, 31, null),
                 new FrogPosition("SUB1_B1", -264.125, -38.6875, 71.5625, 180, 0, 180, 1,
                         22, 31, 0, 14, 31, null),
                 new FrogPosition("SUB1_C1", -360.0, -37.1875, 104.0, 0, 0, 0, 2,
                         16, 33, 0, 13, 31, null),
                 new FrogPosition("SUB1_C2", -343.8125, -34.8125, 264.125, 180, 0, 180, 2,
                         17, 43, 0, 13, 31, null), //
                 new FrogPosition("SUB1_C3", -199.8125, -35.0, 264.125, 180, 0, 180, 2,
                         26, 43, 0, 13, 31, null), //
                 new FrogPosition("SUB1_C4", -24.0, -36.0625, 280.0, 180, 0, 180, 2,
                         37, 44, 0, 13, 31, null),
                 new FrogPosition("SUB1_D1", 184.125, -36.5, 264.1875, 180, 0, 180, 3,
                         50, 43, 0, 13, 31, null), //
                 new FrogPosition("SUB1_D2", 360.0, -38.375, 56.0, 0, 0, 0, 3,
                         61, 30, 0, 13, 31, null),
                 new FrogPosition("SUB1_E1", 328.1875, -84.0625, 151.8125, 0, -89.9, 0, 4,
                         59, 36, 0, 13, 31, null), //
                 new FrogPosition("SUB1_F3", 295.8125, -36.125, 23.8125, 0, 0, 0, 5,
                         57, 28, 0, 13, 31, null), //
                 new FrogPosition("SUB1_F1", 136.125, -60.125, 39.375, 0, -89.9, 0, 5,
                         47, 29, 0, 13, 31, null),
                 new FrogPosition("SUB1_F2", 168.0625, -35.25, -120.0, 0, -89.9, 0, 5,
                         49, 19, 0, 13, 31, null)
         )));
         FROG_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SUB2_A1", -24.0, -3.4375, -616.0, 0, 0, 0, 0,
                         22, 6, 0, 2, 47, null),
                 new FrogPosition("SUB2_A2", -104.0, -65.875, -520.0, 0, 89.9, 0, 0,
                         17, 12, 1, 2, 47, null), //2nd layer
                 new FrogPosition("SUB2_B1", -56.0, -70.25, -376.0, 0, -89.9, 0, 1,
                         20, 21, 1, 2, 47, null), //2nd layer
                 new FrogPosition("SUB2_B2", -170.3125, -67.6875, -295.875, 0, 89.9, 0, 1,
                         13, 26, 0, 6, 47, null),
                 new FrogPosition("SUB2_B3", -135.75, -67.1875, -217.5625, 180, 0, 180, 1,
                         15, 31, 0, 2, 47, null), //
                 new FrogPosition("SUB2_C1", -40.0, -3.1875, -361.6875, 0, 0, 0, 2,
                         21, 22, 0, 2, 47, null), //
                 new FrogPosition("SUB2_C5", -71.0, -19.375, -231.8125, 0, 89.9, 0, 2,
                         19, 30, 0, 2, 47, null), //
                 new FrogPosition("SUB2_C2", 8.25, -3.4375, -375.375, 0, 89.9, 0, 2,
                         24, 21, 0, 2, 47, null),
                 new FrogPosition("SUB2_C4", 40.0, -15.25, -200.0, 180, 0, 180, 2,
                         26, 32, 0, 2, 47, null),
                 new FrogPosition("SUB2_C3", -7.9375, -4.25, -296.25, 0, 89.9, 0, 2,
                         23, 26, 0, 13, 47, null),
                 new FrogPosition("SUB2_C6", -152.0, -3.4375, -200.0, 0, 0, 0, 2,
                         14, 32, 0, 2, 47, null),
                 new FrogPosition("SUB2_D1", 120.6875, -7.5, -199.75, 180, 0, 180, 3,
                         31, 32, 0, 13, 47, null),
                 new FrogPosition("SUB2_E2", 168.125, -131.875, -200.9375, 180, 0, 180, 4,
                         34, 32, 0, 2, 47, null), //
                 new FrogPosition("SUB2_E1", 215.9375, -72.625, -361.6875, 0, 0, 0, 4,
                         37, 22, 0, 31, 60, null) //
         )));
         FROG_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SUB3_A4", -184.0, 0.0, -200.0, 0, -89.9, 0, 0,
                         12, 9, 0, 0, 15, null),
                 new FrogPosition("SUB3_A3", -88.0, 0.0, -200.0, 0, 89.9, 0, 0,
                         18, 9, 0, 17, 15, null),
                 new FrogPosition("SUB3_A2", -56.0, 0.0, -136.0, 0, -89.9, 0, 0,
                         20, 13, 0, 26, 15, null),
                 new FrogPosition("SUB3_A1", 40.0, 0.0, -184.0, 180, 0, 180, 0,
                         26, 10, 0, 12, 15, null),
                 new FrogPosition("SUB3_B1", -279.8125, 3.4375, -231.75, 180, 0, 180, 1,
                         6, 7, 0, 0, 15, null), //
                 new FrogPosition("SUB3_B2", -184.0, 0.0, -136.0, 0, 0, 0, 1,
                         12, 13, 0, 26, 15,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("SUB3_C1", -55.8125, 0.0, -8.3125, 180, 0, 180, 2,
                         20, 21, 0, 0, 15, null), //
                 new FrogPosition("SUB3_D1", -119.8125, 0.0, 280.125, 180, 0, 180, 3,
                         16, 39, 0, 0, 15, null), //
                 new FrogPosition("SUB3_E1", 55.8125, 1.25, -8.125, 0, 0, 0, 4,
                         27, 21, 0, 0, 15, null), //
                 new FrogPosition("SUB3_E2", 120.0, -14.375, 136.0, 180, 0, 180, 4,
                         31, 30, 0, -1, -1, null),
                 new FrogPosition("SUB3_E3", 248.125, 0.0, 24.125, 0, 0, 0, 4,
                         39, 23, 0, 0, 15, null),
                 new FrogPosition("SUB3_F1", 40.0, 0.0, -88.0, 180, 0, 180, 5, //
                         26, 16, 0, 0, 15, null),
                 new FrogPosition("SUB3_F2", 120.0, 0.0, -152.0, 0, 89.9, 0, 5,
                         31, 12, 0, 12, 15, null),
                 new FrogPosition("SUB3_F3", 200.0, 0.0, -168.0, 0, -89.9, 0, 5,
                         36, 11, 0, 2, 15, null)
         )));
         FROG_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SUB4_A1", -376.0, -38.0, -152.0, 0, 89.9, 0, 0,
                         15, 20, 0, 9, 25, null),
                 new FrogPosition("SUB4_A2", -216.0, -41.75, -168.0, 0, -89.9, 0, 0,
                         25, 19, 0, 9, 25, null),
                 new FrogPosition("SUB4_A3", -280.1875, -48.625, -8.375, 0, 89.9, 0, 0,
                         21, 29, 0, 9, 25, null),
                 new FrogPosition("SUB4_B1", -360.0, -92.3125, 265.125, 180, 0, 180, 1,
                         16, 46, 0, 9, 25, null), //
                 new FrogPosition("SUB4_C1", -360.0, -37.1875, 104.0, 0, 0, 0, 2,
                         16, 36, 0, 9, 25, null),
                 new FrogPosition("SUB4_C2", -184.25, -32.5625, 265.0625, -180, 0, -180, 2,
                         27, 46, 0, 9, 25, null), //
                 new FrogPosition("SUB4_D1", -8.0, -36.0625, 152.0, 0, -89.9, 0, 3,
                         38, 39, 0, 9, 25, null),
                 new FrogPosition("SUB4_E1", 264.125, -36.0625, 263.625, 180, 0, 180, 4,
                         55, 46, 0, 9, 25, null), //
                 new FrogPosition("SUB4_E2", 360.0, -38.375, 56.0, 0, 0, 0, 4,
                         61, 33, 0, 9, 25, null),
                 new FrogPosition("SUB4_F4", 327.625, -84.0625, 151.8125, 0, -89.9, 0, 5,
                         59, 39, 0, 9, 25, null), //
                 new FrogPosition("SUB4_F3", 295.8125, -36.0625, 24.3125, 0, 0, 0, 5,
                         57, 31, 0, 9, 25, null), //
                 new FrogPosition("SUB4_F1", 104.0, -37.25, 72.0, 0, 0, 0, 5,
                         45, 34, 0, 9, 25, null),
                 new FrogPosition("SUB4_F2", 168.0, -35.25, -120.0, 0, -89.9, 0, 5,
                         49, 22, 0, 9, 25, null)
         )));
         FROG_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SUB5_A1", -24.0, -35.375, -616.0, 0, 0, 0, 0,
                         29, 7, 0, 0, 44, null),
                 new FrogPosition("SUB5_A2", -136.0, -40.625, -584.0, 0, 0, 0, 0,
                         22, 9, 0, 0, 44, null),
                 new FrogPosition("SUB5_A3", -136.0, -34.875, -472.0, 0, -89.9, 0, 0,
                         22, 16, 0, 0, 44, null),
                 new FrogPosition("SUB5_A4", -56.0, -101.125, -376.0, 0, -89.9, 0, 0,
                         27, 22, 1, 0, 44, null), //2nd layer
                 new FrogPosition("SUB5_B1", -69.25, -101.0625, -295.8125, 0, -89.9, 0, 1,
                         26, 27, 0, 0, 44, null),
                 new FrogPosition("SUB5_B2", -136.125, -99.1875, -215.625, 0, 0, 0, 1,
                         22, 32, 0, 0, 44, null), //
                 new FrogPosition("SUB5_C4", -40.0, -38.3125, -361.6875, 0, 0, 0, 2,
                         28, 23, 0, 0, 44, null), //
                 new FrogPosition("SUB5_C3", -7.6875, -36.1875, -279.75, 0, 89.9, 0, 2,
                         30, 28, 0, 0, 44, null),
                 new FrogPosition("SUB5_C2", -71.0, -51.1875, -231.8125, 0, 89.9, 0, 2,
                         26, 31, 0, 0, 44, null), //
                 new FrogPosition("SUB5_C5", 7.6875, -35.375, -374.125, 0, 89.9, 0, 2,
                         31, 22, 0, 0, 44, null),
                 new FrogPosition("SUB5_C1", -152.0, -35.375, -200.0, 0, 0, 0, 2,
                         21, 33, 0, 0, 44, null),
                 new FrogPosition("SUB5_D1", 120.6875, -36.0, -199.75, 180, 0, 180, 3,
                         38, 33, 0, 19, 44, null),
                 new FrogPosition("SUB5_E1", 168.0, -164.0, -198.25, 180, 0, 180, 4,
                         41, 33, 0, 0, 44, null), //
                 new FrogPosition("SUB5_E2", 215.9375, -98.875, -361.6875, 0, 0, 0, 4,
                         44, 23, 0, 28, 55, null) //
         )));
         FROG_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("FOR1_A2", -168.0, -35.625, -120.0, 0, 89.9, 0, 0,
                         3, 4, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_A1", -120.0, -32.5625, -136.0, 0, 0, 0, 0,
                         6, 3, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_A3", -152.0, -38.25, -88.0, 0, -89.9, 0, 0,
                         4, 6, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_A4", -120.0, -33.9375, -72.0, 180, 0, 180, 0,
                         6, 7, 0, 6, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_A5", -88.0, -30.4375, -88.0, 0, -89.9, 0, 0,
                         8, 6, 0, 2, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_A6", -56.0, -27.75, -88.0, 0, 89.9, 0, 0,
                         10, 6, 0, 5, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_B1", -168.0, -34.0, 8.0, 0, 89.9, 0, 1,
                         3, 12, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_C3", -169.6875, -37.5, 56.0625, 0, 89.9, 0, 2,
                         3, 15, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition("FOR1_C4", -169.6875, -38.0625, 88.0625, 0, 90, 0, 2, //TODO Double check rotation
                         3, 17, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition("FOR1_C5", -119.9375, -34.5625, 137.6875, 180, 0, 180, 2,
                         6, 20, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition("FOR1_C6", -55.875, -31.0, 137.6875, 180, 0, 180, 2,
                         10, 20, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition("FOR1_C1", -88.0, -31.25, 72.0, 0, -89.9, 0, 2,
                         8, 16, 0, 11, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_C2", -120.0, -32.8125, 56.0, 0, 0, 0, 2,
                         6, 15, 0, 4, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_D1", 56.0625, -31.5625, 137.6875, 180, 0, 180, 3,
                         17, 20, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}), //
                 new FrogPosition("FOR1_D2", 104.0, -28.3125, 88.0, 0, 0, 0, 3,
                         20, 17, 0, 6, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_D3", 136.0, -30.75, 135.9375, 180, 0, 180, 3,
                         22, 20, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_D4", 168.0, -31.1875, 88.0, 0, -89.9, 0, 3,
                         24, 17, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_D5", 152.0, -30.1875, 40.0, 0, 0, 0, 3,
                         23, 14, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_E1", 152.0, -27.0, -8.0, 180, 0, 180, 4,
                         23, 11, 0, 13, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_F4", 55.875, -30.1875, -104.0, 0, 89.9, 0, 5,
                         17, 5, 0, 5, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_F3", 120.0, -26.8125, -120.0, 0, 89.9, 0, 5,
                         21, 4, 0, 3, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_F1", 168.0, -29.9375, -39.8125, 0, -89.9, 0, 5,
                         24, 9, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("FOR1_F2", 167.9375, -29.9375, -87.6875, 0, -89.9, 9, 5,
                         24, 6, 0, 0, 21,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)})
         )));
         FROG_LOCATIONS.put("FOR2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("FOR2_A1", -88.125, -147.6875, -7.75, 0, 89.9, 0, 0),
                 new FrogPosition("FOR2_B1", 53.625, -140.625, -120.0, 0, -89.9, 0, 1),
                 new FrogPosition("FOR2_C3", -40.0, -36.375, -168.0, 180, 0, 180, 2),
                 new FrogPosition("FOR2_C2", -119.75, -36.9375, -135.0, 180, 0, 180, 2),
                 new FrogPosition("FOR2_C1", -150.0625, -100.75, -152.4375, 180, 0, 180, 2),
                 new FrogPosition("FOR2_D1", -150.0, -102.3125, -84.75, 0, 0, 0, 3),
                 new FrogPosition("FOR2_D2", -216.125, -132.75, 168.9375, 0, 0, 0, 3),
                 new FrogPosition("FOR2_E1", -232.0, -128.6875, -360.0, 0, 89.9, 0, 4),
                 new FrogPosition("FOR2_F4", -135.75, -38.3125, -392.125, 0, 0, 0, 5),
                 new FrogPosition("FOR2_F2", -39.875, -62.5, -327.8125, 0, -89.9, 0, 5),
                 new FrogPosition("FOR2_F3", -56.0, -36.3125, -376.0, 0, -89.9, 0, 5),
                 new FrogPosition("FOR2_F1", -40.9375, -78.625, -264.125, 0, -89.9, 0, 5),
                 new FrogPosition("FOR2_G1", 216.0, -36.375, -376.0, 0, -89.9, 0, 6),
                 new FrogPosition("FOR2_G2", 216.0, -36.125, -248.0, 0, -89.9, 0, 6),
                 new FrogPosition("FOR2_H1", 103.3125, -72.0, -248.3125, 0, 0, 0, 7),
                 new FrogPosition("FOR2_H2", 212.0625, -78.375, -341.1875, 0, -89.9, 0, 7),
                 new FrogPosition("FOR2_I1", 106.625, -96.25, -118.4375, 0, 89.9, 0, 8)
         )));
         FROG_LOCATIONS.put("VOL1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("VOL1_B5", -56.0, -63.9375, -24.0, 180, 0, 180, 1,
                         6, 8, 0, 3, 15, null), //
                 new FrogPosition("VOL1_B10", 40.0625, -64.0, -24.0, 180, 0, 180, 1,
                         12, 8, 0, 3, 15, null),
                 new FrogPosition("VOL1_B6", -8.0, -64.0, 8.0, 180, 0, 180, 1,
                         9, 10, 0, 3, 15, null), //
                 new FrogPosition("VOL1_B4", -39.875, -64.0, 39.9375, 180, 0, 180, 1,
                         7, 12, 0, 14, 15, null),
                 new FrogPosition("VOL1_B9", 24.0625, -64.0, 39.9375, 180, 0, 180, 1,
                         11, 12, 0, 3, 15, null),
                 new FrogPosition("VOL1_B2", -71.875, -74.25, 55.9375, 180, 0, 180, 1,
                         5, 13, 0, 3, 15, null),
                 new FrogPosition("VOL1_B11", 56.0625, -71.5625, 55.9375, 180, 0, 180, 1,
                         13, 13, 0, 3, 15, null),
                 new FrogPosition("VOL1.B1", -104.0, -80.0, 120.0, 180, 0, 180, 1,
                         3, 17, 0, 3, 15, null), //
                 new FrogPosition("VOL1_B7", -8.0, -64.0, 104.0, 180, 0, 180, 1,
                         9, 16, 0, 3, 15, null), //
                 new FrogPosition("VOL1_B12", 88.0, -68.875, 120.0, 180, 0, 180, 1,
                         15, 17, 0, 3, 15, null), //
                 new FrogPosition("VOL1_B8", 24.0625, -64.0, 119.9375, 180, 0, 180, 1,
                         11, 17, 0, 14, 15, null),
                 new FrogPosition("VOL1_B3", -39.875, -64.0, 119.9375, 180, 0, 180, 1,
                         7, 17, 0, 14, 15, null)
         )));
         FROG_LOCATIONS.put("VOL2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("VOL2_B3", -120.125, -87.1875, 151.8125, 180, 0, 180, 1,
                         2, 21, 0, 2, 14, null), //
                 new FrogPosition("VOL2_B4", -88.0, -71.1875, 88.0, 0, 0, 0, 1, // TODO: didn't reset
                         4, 17, 1, -1, -1, null), //2nd level
                 new FrogPosition("VOL2_B2", -104.0, -111.1875, -24.0, 0, 0, 0, 1,
                         3, 9, 0, -1, -1, null), //grate
////                 new FrogPosition(-103.9375, -71.25, -40.5, 0, 0, 0, 1,
////                         -1, -1, -1, 14, null), //tri tile
                 new FrogPosition("VOL2_B5", -8.0, -37.5625, 88.0, 180, 0, 180, 1,
                         9, 17, 0, 2, 14, null), //
                 new FrogPosition("VOL2_B6", 40.0, -39.0625, 56.0, 0, 89.9, 0, 1,
                         12, 15, 0, 2, 14, null),
                 new FrogPosition("VOL2_B8", 71.8125, -87.1875, 151.8125, 180, 0, 180, 1,
                         14, 21, 0, 2, 14, null),
                 new FrogPosition("VOL2_B7", 72.0, -71.25, 88.0625, 0, 89.9, 0, 1,
                         14, 17, 1, 2, 14, null), //2nd level
                 new FrogPosition("VOL2_B10", 87.6875, -71.1875, -40.75, 0, 0, 0, 1,
                         15, 9, 0, -1, -1, null), //tri tile
                 new FrogPosition("VOL2_B9", 88.0, -112.125, -24.0, 0, 0, 0, 1,
                         15, 10, 0, -1, -1, null) //grate
         )));
         FROG_LOCATIONS.put("VOL3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("VOL3_A1", -56.125, -187.1875, -88.125, 0, 0, 0, 1),
                 new FrogPosition("VOL3_A2", 72.0, -80.0, 8.0, 0, 0, 0, 1),
                 new FrogPosition("VOL3_A3", 72.0, -16.0, 56.0, 0, 0, 0, 1),
                 new FrogPosition("VOL2_A4", -24.0, -144.0, 40.0, 0, 89.9, 0, 1),
                 new FrogPosition("VOL2_A5", -40.0, -16.0, -72.0, 0, 0, 0, 1)
         )));
         FROG_LOCATIONS.put("CAV1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("CAV1_A2", 40.0, -7.125, -200.0, 0, 0, 0, 0,
                         15, 2, 0, 6, 31, null),
                 new FrogPosition("CAV1_A1", -88.0, 0.0, -200.0, 0, 0, 0, 0,
                         7, 2, 0, 1, 31, null),
                 new FrogPosition("CAV1_B2", -136.0, 0.0, -200.0, 0, 0, 0, 1,
                         4, 2, 0, 0, 31, null),
                 new FrogPosition("CAV1_B1", -120.0, 0.0, -152.0, 180, 0, 180, 1,
                         5, 5, 0, 20, 31, null),
                 new FrogPosition("CAV1_C2", -151.875, 0.0, -88.0, 180, 0, 180, 2,
                         3, 9, 0, 6, 31, null),
                 new FrogPosition("CAV1_C1", -152.0, 0.0, 8.0, 180, 0, 180, 2,
                         3, 15, 0, 16, 31, null),
                 new FrogPosition("CAV1_D2", -152.0, -18.6875, 56.0, 180, 0, 180, 3,
                         3, 18, 0, 29, 31, null),
                 new FrogPosition("CAV1_D1", -151.9375, 2.4375, 119.0, 180, 0, 180, 3,
                         3, 22, 0, 11, 31, null),
                 new FrogPosition("CAV1_E1", -87.8125, 2.4375, 119.0, 180, 0, 180, 4,
                         7, 22, 0, 3, 31, null),
                 new FrogPosition("CAV1_E3", -23.8125, 2.125, 119.0, 180, 0, 180, 4,
                         11, 22, 0, 3, 31, null),
                 new FrogPosition("CAV1_E2", -39.8125, 2.4375, 87.0, 180, 0, 180, 4,
                         10, 20, 0, 12, 31, null),
                 new FrogPosition("CAV1_E4", 8.0, -8.375, 88.0, 0, -89.9, 0, 4,
                         13, 20, 0, 16, 31, null),
                 new FrogPosition("CAV1_E5", 24.0, -4.1875, 72.0, 180, 0, 180, 4,
                         14, 19, 0, 6, 31, null),
                 new FrogPosition("CAV1_F1", 103.0, 1.25, 103.8125, 0, -89.9, 0, 5,
                         19, 21, 0, 35, 31, null),
                 new FrogPosition("CAV1_F2", 88.0, -4.1875, 24.0, 180, 0, 180, 5,
                         18, 16, 0, 2, 31, null),
                 new FrogPosition("CAV1_G1", 104.0, 0.0, -24.0, 180, 0, 180, 6,
                         19, 13, 0, 16, 31, null),
                 new FrogPosition("CAV1_G2", 88.0, -3.5625, -72.0, 0, 0, 0, 6,
                         18, 10, 0, 9, 31, null),
                 new FrogPosition("CAV1_H1", 72.0, -7.125, -200.0, 0, 0, 0, 7,
                         17, 2, 0, 7, 31, null)
         )));
         FROG_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("CAV3_A1", -104.0625, -819.6875, 24.0625, 180, 0, 180, 1,
                         13, 53, 0, 12, 17, null),
                 new FrogPosition("CAV3_A2", -104.0, -695.0, 424.0, 180, 0, 180, 1,
                         13, 78, 0, 7, 17, null), //
                 new FrogPosition("CAV3_A3", 87.75, -620.5625, 600.1875, 0, -89.9, 0, 1,
                         25, 89, 0, 8, 17, null),
                 new FrogPosition("CAV3_A4", 71.75, -576.75, 312.1875, 0, 0, 0, 1,
                         24, 71, 0, 7, 17, null),
                 new FrogPosition("CAV3_A5", -8.4375, -568.5625, 266.0, 180, 0, 180, 1,
                         19, 68, 0, 7, 17, null), //
                 new FrogPosition("CAV3_A6", 39.75, -518.4375, -23.75, 180, 0, 180, 1,
                         22, 50, 0, 7, 17, null),
                 new FrogPosition("CAV3_A7", 71.75, -480.25, -231.75, 0, 0, 0, 1,
                         24, 37, 0, 8, 17, null),
                 new FrogPosition("CAV3_A9", 40.0, -342.0625, -552.0, 180, 0, 180, 1,
                         22, 17, 0, 7, 17, null), //
                 new FrogPosition("CAV3_A8", 71.75, -362.375, -503.75, 180, 0, 180, 1,
                         24, 20, 0, 7, 17, null),
                 new FrogPosition("CAV3_A10", 231.4375, -319.5625, -663.75, 0, -89.9, 0, 1,
                         34, 10, 0, 7, 17, null),
                 new FrogPosition("CAV3_A11", 248.0, -272.5625, -312.0, 180, 0, 180, 1,
                         35, 32, 0, 7, 17, null), //
                 new FrogPosition("CAV3_A12", 151.4375, -260.9375, -247.5625, 180, 0, 180, 1,
                         29, 36, 0, 12, 17, null),
                 new FrogPosition("CAV3_A13", 231.4375, -219.3125, -7.5625, 180, 0, 180, 1,
                         34, 51, 0, 8, 17, null),
                 new FrogPosition("CAV3_A14", 183.4375, -66.0, 456.375, 180, 0, 180, 1,
                         31, 80, 0, 5, 17, null),
                 new FrogPosition("CAV3_A15", 216.0, -30.0625, 552.0, 180, 0, 180, 1,
                         33, 86, 0, 27, 17, null), //
                 new FrogPosition("CAV3_A16", 199.875, -18.5, 628.6875, 180, 0, 180, 1,
                         32, 91, 0, 27, 17, null)
         )));
         FROG_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("CAV4_A1", -23.9375, -31.1875, -376.0, 180, 0, 180, 0,
                         15, 8, 0, 10, 5, null),
                 new FrogPosition("CAV4_B2", -104.125, -31.1875, -440.1875, 0, 0, 0, 1,
                         10, 4, 0, 13, 5, null), //
                 new FrogPosition("CAV4_B1", -103.9375, -31.1875, -376.0, 0, 89.9, 0, 1,
                         10, 8, 0, 29, 5, null),
                 new FrogPosition("CAV4_C2", -183.9375, -31.1875, -280.0, 180, 0, 180, 2,
                         5, 14, 0, 3, 5, null),
                 new FrogPosition("CAV4_C1", -200.0, -32.0, -232.0, 0, 89.9, 0, 2,
                         4, 17, 0, 22, 5, null),
                 new FrogPosition("CAV4_D1", -184.0625, -31.9375, -90.4375, 0, 0, 0, 3,
                         5, 26, 0, 17, 5, null), //
                 new FrogPosition("CAV4_D2", -56.0, -32.0, -88.0, 0, 0, 0, 3,
                         13, 26, 0, 17, 5, null),
                 new FrogPosition("CAV4_E1", -40.0, -32.0, -232.0, 0, -89.9, 0, 4,
                         14, 17, 0, 10, 5, null),
                 new FrogPosition("CAV4_F1", 216.0, 0.125, -455.3125, 0, -89.9, 0, 5,
                         30, 3, 0, 28, 5, null),
                 new FrogPosition("CAV4_F3", 151.8125, -31.5, -407.625, 0, 0, 0, 5, //
                         26, 6, 0, 11, 5, null),
                 new FrogPosition("CAV4_F2", 104.0, -31.4375, -424.0, 180, 0, 180, 5,
                         23, 5, 0, 26, 5, null),
                 new FrogPosition("CAV4_F4", 120.0, -31.4375, -376.0, 0, -89.9, 0, 5,
                         24, 8, 0, 11, 5, null),
                 new FrogPosition("CAV4_F5", 56.0, -31.4375, -296.0, 0, -89.9, 0, 5,
                         20, 13, 0, 28, 5, null),
                 new FrogPosition("CAV4_F6", 200.0, -31.4375, -280.0, 0, 0, 0, 5,
                         29, 14, 0, 2, 5, null),
                 new FrogPosition("CAV4_G4", 200.0, -47.9375, -216.0, 0, 0, 0, 6,
                         29, 18, 0, 10, 5, null),
                 new FrogPosition("CAV4_G3", 120.0, -47.9375, -152.0, 180, 0, 180, 6,
                         24, 22, 0, 30, 5, null),
                 new FrogPosition("CAV4_G2", 135.875, -47.9375, -106.4375, 0, 0, 0, 6,
                         25, 25, 0, 11, 5, null), //
                 new FrogPosition("CAV4_G5", 216.0, -32.0, -56.0, 0, -89.9, 0, 6,
                         30, 28, 0, 4, 5, null),
                 new FrogPosition("CAV4_G1", 40.0, -47.9375, -88.0, 0, -89.9, 0, 6,
                         19, 26, 0, 30, 5, null),
                 new FrogPosition("CAV4_H1", -136.0, 0.0, -40.0, 180, 0, 180, 7,
                         8, 29, 0, 11, 5, null),
                 new FrogPosition("CAV4_I1", -152.0625, 2.125, 69.5, 0, 0, 0, 8,
                         7, 36, 0, 30, 5, null), //
                 new FrogPosition("CAV4_I2", -40.0, 0.0, -8.0, 180, 0, 180, 8,
                         14, 31, 0, 8, 5, null),
                 new FrogPosition("CAV4_I3", 40.0, 0.0, 88.0, 180, 0, 180, 8,
                         19, 37, 0, 4, 5, null),
                 new FrogPosition("CAV4_I4", 104.0, 0.0, 8.0, 0, -89.9, 0, 8,
                         23, 32, 0, 14, 5, null)
         )));
         FROG_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SKY1_B1", -215.875, -45.0625, -39.75, 0, 89.9, 0, 1,
                         8, 20, 0, 0, 1, null),
                 new FrogPosition("SKY1_C1", -215.625, -75.3125, 136.125, 0, 89.9, 0, 2,
                         8, 31, 0, 0, 1, null),
                 new FrogPosition("SKY1_D1", -55.625, -71.0, 88.125, 0, 89.9, 0, 3,
                         18, 28, 0, 0, 1, null),
                 new FrogPosition("SKY1_D2", -24.125, -45.125, -23.625, 0, 0, 0, 3,
                         20, 21, 0, 0, 1, null),
                 new FrogPosition("SKY1_E1", 104.125, -76.25, 7.875, 0, 0, 0, 4,
                         28, 23, 0, 0, 1, null),
                 new FrogPosition("SKY1_E2", 119.8125, -81.0, -119.625, 0, 0, 0, 4,
                         29, 15, 0, 0, 1, null),
                 new FrogPosition("SKY1_F1", 200.0, -43.9375, 120.0, 180, 0, 180, 5,
                         34, 30, 0, 0, 1, null)
         )));
         FROG_LOCATIONS.put("SKY2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SKY2_A1", -184.0, -173.0, -329.6875, 0, 0, 0, 1,
                         12, 13, 0, 0, 6, null),
                 new FrogPosition("SKY2_A2", 56.125, -78.0, -263.9375, 0, 0, 0, 1,
                         27, 17, 0, 0, 6, null),
                 new FrogPosition("SKY2_A5", 247.9375, -195.6875, -105.6875, 0, 0, 0, 1,
                         39, 27, 0, 0, 6, null),
                 new FrogPosition("SKY2_A4", 136.0625, -80.1875, -119.0, 0, -89.9, 0, 1,
                         32, 26, 0, 0, 6, null),
                 new FrogPosition("SKY2_A3", -88.0625, -73.375, -183.9375, 0, 89.9, 0, 1,
                         18, 22, 0, 0, 6, null),
                 new FrogPosition("SKY2_A6", 136.25, -75.0, 25.625, 0, -89.9, 0, 1,
                         32, 35, 0, 0, 6, null),
                 new FrogPosition("SKY2_A7", -55.8125, -88.25, 23.9375, 0, -89.9, 0, 1,
                         20, 35, 0, 0, 6, null),
                 new FrogPosition("SKY2_A8", -328.0, -100.9375, 54.25, 0, 0, 0, 1,
                         3, 37, 0, 0, 6, null),
                 new FrogPosition("SKY2_A9", -87.9375, -102.875, 168.8125, 0, 89.9, 0, 1,
                         18, 44, 0, 0, 6, null),
                 new FrogPosition("SKY2_A10", 8.0, -89.5625, 137.5625, 180, 0, 180, 1,
                         24, 42, 0, 0, 6, null),
                 new FrogPosition("SKY2_A11", 104.375, -80.125, 169.6875, 0, -89.9, 0, 1,
                         30, 44, 0, 0, 6, null),
                 new FrogPosition("SKY2_A13", 216.3125, -34.8125, 294.4375, 0, 0, 0, 1,
                         37, 52, 0, 0, 6, null),
                 new FrogPosition("SKY2_A12", 185.25, -32.6875, 232.25, 180, 0, 180, 1,
                         35, 48, 0, 0, 6, null)
         )));
         FROG_LOCATIONS.put("SKY3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SKY3_A1", 377.6875, -80.125, -152.0, 0, -89.9, 0, 1,
                         48, 11, 0, 1, 0, null), //
                 new FrogPosition("SKY3_A2", 377.6875, -68.3125, -312.0, 0, -89.9, 0, 1,
                         48, 1, 0, 1, 0, null), //
                 new FrogPosition("SKY3_A3", 328.125, -72.625, -311.6875, 0, 0, 0, 1,
                         45, 1, 0, 1, 0, null),
                 new FrogPosition("SKY3_A6", 104.9375, -75.1875, -151.8125, 0, 89.9, 0, 1,
                         31, 11, 0, 1, 0, null), //
                 new FrogPosition("SKY3_A4", 184.0625, -80.9375, -168.1875, 180, 0, 180, 1,
                         36, 10, 0, 1, 0, null),
                 new FrogPosition("SKY3_A7", 120.9375, -80.0, -231.8125, 0, 89.9, 0, 1,
                         32, 6, 0, 1, 0, null), //
                 new FrogPosition("SKY3_A5", 183.6875, -81.375, -311.75, 0, 0, 0, 1,
                         36, 1, 0, 1, 0, null),
                 new FrogPosition("SKY3_A8", 104.9375, -88.6875, -311.8125, 0, 89.9, 0, 1,
                         31, 1, 0, 1, 0, null) //
         )));
         FROG_LOCATIONS.put("SKY4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SKY4_A1", -231.6875, -36.5, 7.125, 0, 89.9, 0, 1,
                         10, 26, 0, 0, 1, null),
                 new FrogPosition("SKY4_A2", -215.625, -65.0, 136.125, 0, 89.9, 0, 1,
                         11, 34, 0, 0, 1, null),
                 new FrogPosition("SKY4_A3", -55.625, -64.625, 88.125, 0, 89.9, 0, 1,
                         21, 31, 0, 0, 1, null),
                 new FrogPosition("SKY4_A4", -24.125, -38.6875, -23.625, 0, 0, 0, 1,
                         23, 24, 0, 0, 1, null),
                 new FrogPosition("SKY4_A6", 104.125, -70.0, 7.875, 0, -89.9, 0, 1,
                         31, 26, 0, 0, 1, null),
                 new FrogPosition("SKY4_A7", 119.8125, -74.75, -119.625, 0, 0, 0, 1,
                         32, 18, 0, 0, 1, null),
                 new FrogPosition("SKY4_A5", 168.125, -36.0, 119.625, 180, 0, 180, 1,
                         35, 33, 0, 0, 1, null)
         )));
         FROG_LOCATIONS.put("SWP1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SWP1_B1", -168.0, -62.0625, 248.1875, 0, 0, 0, 1,
                         10, 42, 1, 0, 59, null), // //2nd layer
                 new FrogPosition("SWP1_B3", -184.0, -80.0, 120.0, 0, 89.9, 0, 1,
                         9, 34, 0, -1, -1, null), //crate
                 new FrogPosition("SWP1_B4", -120.8125, -112.75, 104.0, 0, 0, 0, 1,
                         13, 33, 0, -1, -1, null), // //pipe
                 new FrogPosition("SWP1_B5", -104.0, -64.0, 88.0, 0, -89.9, 0, 1,
                         14, 32, 0, 0, 59, null),
                 new FrogPosition("SWP1_B2", -134.625, -63.6875, 263.9375, 180, 0, 180, 1,
                         12, 43, 0, 0, 59, null),
                 new FrogPosition("SWP1_B6", -72.0625, -112.375, 119.875, 0, 89.9, 0, 1,
                         16, 34, 0, -1, -1, null), //pipe
                 new FrogPosition("SWP1_B7", -88.0, -64.0, 232.0, 0, 89.9, 0, 1,
                         15, 41, 0, 12, 59, null),
                 new FrogPosition("SWP1_B10", 56.0, -96.0, 104.0, 0, 0, 0, 1,
                         24, 33, 0, -1, -1, null), // //pipe
                 new FrogPosition("SWP1_B9", 56.0, -64.0, 168.0, 0, -89.9, 0, 1,
                         24, 37, 0, 0, 59, null),
                 new FrogPosition("SWP1_B8", 152.0, -64.0, 264.0, 0, 0, 0, 1,
                         30, 43, 0, 0, 59, null), //
                 new FrogPosition("SWP1_B11", 168.0, -68.125, 152.0, 0, 0, 0, 1, // TODO: default texture is wrong
                         31, 36, 1, 2, 59, null), //2nd layer
                 new FrogPosition("SWP1_B12", 184.0, -66.6875, 72.0, 0, 0, 0, 1,
                         32, 31, 0, 0, 59, null), //
                 new FrogPosition("SWP1_B13", 184.0, -66.375, -104.0, 0, -89.9, 0, 1,
                         32, 20, 0, 0, 59, null)
         )));
         FROG_LOCATIONS.put("SWP2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SWP2_B1", -168.125, -64.125, 247.6875, 0, 0, 0, 1,
                         10, 42, 0, 51, 52, null), //
                 new FrogPosition("SWP2_B4", -136.0, -64.0, 88.0, 0, -89.9, 0, 1,
                         12, 32, 0, 39, 52, null),
                 new FrogPosition("SWP2_B5", -71.9375, -80.4375, 103.9375, 180, 0, 180, 1,
                         16, 33, 0, -1, -1, null), //pipe
                 new FrogPosition("SWP2_B2", -135.0, -63.75, 264.0, 180, 0, 180, 1,
                         12, 43, 0, 51, 52, null),
                 new FrogPosition("SWP2_B3", -104.0, -64.0625, 264.0, 0, 0, 0, 1,
                         14, 43, 0, 51, 52, null), //
                 new FrogPosition("SWP2_B6", 55.625, -64.3125, 280.0, 0, 0, 0, 1,
                         24, 44, 2, 51, 52, null), // //3rd layer
                 new FrogPosition("SWP2_B7", 151.8125, -63.9375, 264.3125, 0, 0, 0, 1,
                         30, 43, 0, 51, 52, null), //
                 new FrogPosition("SWP2_B8", 56.125, -112.125, 119.875, 0, 89.9, 0, 1,
                         24, 34, 0, -1, -1, null), //pipe
                 new FrogPosition("SWP2_B9", 168.0, -68.5, 152.0, 0, 0, 0, 1,
                         31, 36, 1, 51, 52, null), //2nd layer
                 new FrogPosition("SWP2_B10", 183.8125, -64.0, 72.3125, 0, 0, 0, 1,
                         32, 31, 0, 51, 52, null) //
         )));
         FROG_LOCATIONS.put("SWP3.MAP", new ArrayList<>(Arrays.asList( //232
                 new FrogPosition("SWP3_B2", -152.0, -128.4375, -40.0, 0, 0, 0, 1,
                         6, 14, 0, 0, 62, null), //
                 new FrogPosition("SWP3_B1", -200.0, -112.0, 40.0, 180, 0, 180, 1,
                         3, 19, 0, 1, 6, null),
                 new FrogPosition("SWP3_C1", -184.0, -111.0, -216.0, 0, 0, 0, 2,
                         4, 3, 0, 1, 6, null), //
                 new FrogPosition("SWP3_E1", 55.875, -62.0625, -214.3125, 0, 89.9, 0, 4,
                         19, 3, 0, 63, 59, null),
                 new FrogPosition("SWP3_E2", 216.0, -56.4375, -199.9375, 0, -89.9, 0, 4,
                         29, 4, 0, 22, 59,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("SWP3_E3", 184.0, -46.0625, 72.0, 0, 0, 0, 4,
                         27, 21, 0, 24, 59, null), //
                 new FrogPosition("SWP3_E4", 88.0, -40.3125, 200.0, 0, 89.9, 0, 4,
                         21, 29, 0, 32, 59, null),
                 new FrogPosition("SWP3_E5", 103.8125, -8.0, 104.4375, 0, 0, 0, 4,
                         22, 23, 0, 24, 59, null), //
                 new FrogPosition("SWP3_F1", -8.0, -49.375, 200.0, 0, 0, 0, 5,
                         15, 29, 0, -1, -1, null) //ignoring since reqs overriding multiple tiles
         )));
         FROG_LOCATIONS.put("SWP4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SWP4_B4", 71.1875, -27.0, -53.625, -30, 0, -30, 1, // TODO: rotation seems wrong?
                         19, 23, 0, 44, 41, null),
                 new FrogPosition("SWP4_B2", -8.125, -47.1875, -87.625, 0, 0, 0, 1,
                         14, 21, 0, 44, 41, null),
                 //new FrogPosition(40.0, -47.875, -88.0, 0, -89.9, 0, 1), // Sadly can't hop on this tile in vanilla
                 new FrogPosition("SWP4_B3", 40.0, -79.875, -40.0, 180, 0, 180, 1,
                         17, 24, 0, 44, 41, null),
                 new FrogPosition("SWP4_B7", 55.8125, -33.5625, 136.3125, 0, 0, 0, 1,
                         18, 35, 0, 44, 41, null),
                 new FrogPosition("SWP4_B6", -88.0, -48.0, 168.0, 0, 0, 0, 1,
                         9, 37, 0, 44, 41, null),
                 new FrogPosition("SWP4_B5", -119.8125, -125.875, 167.875, 180, 0, 180, 1,
                         7, 37, 1, 44, 41, null), //2nd layer
                 new FrogPosition("SWP4_B1", -120.0, -78.375, -136.0, 0, 0, 0, 1,
                         7, 18, 0, 44, 41, null)
         )));
         FROG_LOCATIONS.put("SWP5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("SWP5_A1", -23.9375, -159.4375, -248.0, 0, 0, 0, 0,
                         25, 7, 0, 17, 32, null),
                 new FrogPosition("SWP5_B2", -184.0, -153.5625, -264.0, 0, 0, 0, 1,
                         15, 6, 0, 4, 32, null), //
                 new FrogPosition("SWP5_B1", -185.1875, -153.5625, -119.9375, 180, 0, 180, 1,
                         15, 15, 0, 34, 32, null),
                 new FrogPosition("SWP5_B3", -344.0, -152.0, -296.0, 0, 0, 0, 1,
                         5, 4, 0, 4, 32, null),
                 new FrogPosition("SWP5_C1",-328.0, -185.5625, -72.0, 0, 0, 0, 2,
                         6, 18, 0, 4, 32, null), //
                 new FrogPosition("SWP5_D1", 104.0, -61.75, 119.9375, 0, -89.9, 0, 3,
                         33, 30, 0, 4, 32, null),
                 new FrogPosition("SWP5_D2", 296.0, 0.0, 135.875, 0, -89.9, 0, 3,
                         45, 31, 0, 40, 43,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("SWP5_E1", 232.0, 0.0, -88.0, 0, 0, 0, 4,
                         41, 17, 0, 44, 43, null), //
                 new FrogPosition("SWP5_F1", -184.0, -73.375, -40.0, 0, 0, 0, 5,
                         15, 20, 0, 4, 32, null),
                 new FrogPosition("SWP5_F2", -200.0, -72.25, 183.9375, 180, 0, 180, 5,
                         14, 34, 0, 25, 32, null),
                 new FrogPosition("SWP5_G1", -264.0, -89.5625, 72.0, 0, 0, 0, 6,
                         10, 27, 1, 56, 65, null), // //2nd layer
                 new FrogPosition("SWP_G2", -328.0, -110.8125, 40.0, 0, 0, 0, 6,
                         6, 25, 0, 35, 32, null),
                 new FrogPosition("SWP5_H1", -344.0, -126.8125, 248.0, 0, 89.9, 0, 7,
                         5, 38, 0, 57, 32, null),
                 new FrogPosition("SWP5_I1", -392.0, -70.8125, 264.0, 0, 89.9, 0, 8,
                         2, 39, 0, 4, 32, null),
                 new FrogPosition("SWP5_I2", -168.0, -151.0, 264.0, 0, -89.9, 0, 8,
                         16, 39, 0, 4, 32, null) //
         )));
         FROG_LOCATIONS.put("DES1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("DES1_A2", 216.0, -0.0625, -231.9375, 0, 0, 0, 0,
                         35, 8, 0, 1, 25, null),
                 new FrogPosition("DES1_A1", -231.9375, -1.0625, -231.9375, 0, 0, 0, 0,
                         7, 8, 0, 0, 25, FULL_SQUARE_UVS),
                 new FrogPosition("DES1_A3", -8.0, 0.0, -87.9375, 0, 0, 0, 0,
                         21, 17, 0, 19, 25, null),
                 new FrogPosition("DES1_B2", -120.25, -93.1875, -120.125, 0, -89.9, 0, 1,
                         14, 15, 0, 9, 25, null), //
                 new FrogPosition("DES1_B1", -168.0, -132.125, -8.0, 0, -89.9, 0, 1,
                         11, 22, 0, 1, 25, null),
                 new FrogPosition("DES1_C6", -232.25, -96.0, 232.375, 180, 0, 180, 2,
                         7, 37, 0, 6, 25, null),
                 new FrogPosition("DES1_C4", -55.8125, 3.0, 167.625, 180, 0, 180, 2,
                         18, 33, 0, 1, 25, null), //
                 new FrogPosition("DES1_C2", -40.0, -16.0, 40.0, 0, 0, 0, 2,
                         19, 25, 0, 11, 25, null),
                 new FrogPosition("DES1_C1", -136.0, -8.0, 8.0, 0, 89.9, 0, 2,
                         13, 23, 0, 26, 25, null),
                 new FrogPosition("DES1_C3", 136.0, 0.0, -72.0, 0, 0, 0, 2,
                         30, 18, 0, 1, 25, null),
                 new FrogPosition("DES1_C5", 72.125, -5.6875, 167.625, 180, 0, 180, 2,
                         26, 33, 0, 1, 25, null), //
                 new FrogPosition("DES1_C7", 232.0, -96.0, 232.5, 0, -89.9, 0, 2,
                         36, 37, 0, 1, 25, null),
                 new FrogPosition("DES1_D1", 152.0, -96.0, -8.0, 0, 89.9, 0, 3,
                         31, 22, 0, 11, 25, null),
                 new FrogPosition("DES1_D2", 120.3125, -93.25, -119.8125, 0, 89.9, 0, 3,
                         29, 15, 0, 28, 25, null), //
                 new FrogPosition("DES1_D3", -7.8125, -72.0, -120.3125, 180, 0, 180, 3,
                         21, 15, 0, 1, 25, null) //
         )));
         FROG_LOCATIONS.put("DES2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("DES2_A3", -88.0, -111.9375, 40.0, 0, 89.9, 0, 0,
                         15, 24, 0, 0, 70, null),
                 new FrogPosition("DES2_A2", -56.1875, -95.0625, -23.4375, 0, -89.9, 0, 0,
                         17, 20, 0, 0, 70, null),
                 new FrogPosition("DES2_A1", -200.375, -96.3125, -182.875, 0, 0, 0, 0,
                         8, 10, 0, 0, 70, null),
                 new FrogPosition("DES2_B2", -199.8125, -390.0, 199.625, 180, 0, 180, 1,
                         8, 34, 0, 0, 70, null), //
                 new FrogPosition("DES2_B1", -167.8125, -276.6875, 215.625, 180, 0, 180, 1,
                         10, 35, 0, 0, 70, null), //
                 new FrogPosition("DES2_C1", -56.0, -96.0, 216.0, 0, 89.9, 0, 2,
                         17, 35, 0, 49, 70, null),
                 new FrogPosition("DES2_D3", 120.0, -94.0, -104.0, 0, -89.9, 0, 3,
                         28, 15, 0, 48, 70, null),
                 new FrogPosition("DES2_D2", -40.1875, 0.0, -70.9375, 0, 89.9, 0, 3,
                         18, 17, 0, 34, 70, null),
                 new FrogPosition("DES2_D1", 56.125, 3.0, 71.625, 180, 0, 180, 3,
                         24, 26, 0, 0, 70, null), //
                 new FrogPosition("DES2_E2", 120.0, -96.0, -24.0, 180, 0, 180, 4,
                         28, 20, 0, 22, 70,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("DES2_E1", 39.875, -191.0, 197.5, 0, 0, 0, 4,
                         23, 34, 0, 0, 70, null), //
                 new FrogPosition("DES2_F1", 168.125, -351.25, 215.625, 180, 0, 180, 5,
                         31, 35, 0, 0, 70, null) //
         )));
         FROG_LOCATIONS.put("DES3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("DES3_A2", -7.9375, -101.5625, -152.0, 0, 0, 0, 0,
                         11, 9, 0, 12, 3, null),
                 new FrogPosition("DES3_A1", -88.0, -101.5, -232.5625, 0, 0, 0, 0, // TODO UVs look weird and not using ring on all of them because it's only setting on 1/4 triangles; need to do reverse of the target erase to make it work
                         6, 4, 0, 0, 3, null),
                 new FrogPosition("DES3_B1", -88.125, -152.0, -151.625, 0, 0, 0, 1,
                         6, 9, 0, 0, 3, null), //
                 new FrogPosition("DES3_C1", -8.125, -152.0, -231.625, 0, 89.9, 0, 2,
                         11, 4, 0, 0, 3, null), //
                 new FrogPosition("DES3_D1", -104.0, -100.9375, 40.0, 180, 0, 180, 3,
                         5, 21, 0, 0, 3, null), //
                 new FrogPosition("DES3_E1", -120.0, -100.9375, 56.0, 0, -89.9, 0, 4,
                         4, 22, 0, 18, 3, null),
                 new FrogPosition("DES3_F1", -136.0, -101.6875, 216.0, 180, 0, 180, 5,
                         3, 32, 0, 0, 3, null), //
                 new FrogPosition("DES3_F2", 88.0, -100.9375, 216.0, 180, 0, 180, 5,
                         17, 32, 0, 0, 3, null), //
                 new FrogPosition("DES3_G1", 120.0, -100.3125, 72.0, 180, 0, 180, 6,
                         19, 23, 0, 0, 3, null)
         )));
         FROG_LOCATIONS.put("DES4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("DES4_A2", 72.0, 0.0, -231.9375, 0, 0, 0, 0,
                         26, 8, 0, 5, 24, null),
                 new FrogPosition("DES4_A1", -231.9375, 0.0, -231.9375, 0, 0, 0, 0,
                         7, 8, 0, 5, 24, null),
                 new FrogPosition("DES4_B1", -120.3125, -95.9375, -120.125, 0, -89.9, 0, 1,
                         14, 15, 0, 5, 24, null), //
                 new FrogPosition("DES4_B2", -232.0, -132.125, 104.0, 0, 89.9, 0, 1,
                         7, 29, 0, 2, 24, null),
                 new FrogPosition("DES4_C1", -200.0, -94.9375, 232.0, 180, 0, 180, 2,
                         9, 37, 0, 6, 24, null),
                 new FrogPosition("DES4_C2", -56.0, 0.0, 136.0, 180, 0, 180, 2,
                         18, 31, 0, 5, 24, null), //
                 new FrogPosition("DES4_C3", 72.125, -5.9375, 167.625, 180, 89.9, 180, 2,
                         26, 33, 0, 5, 24, null), //
                 new FrogPosition("DES4_D1", -136.0, 0.0, -88.0, 0, 89.9, 0, 3,
                         13, 17, 0, 38, 24, null),
                 new FrogPosition("DES4_D2", -39.9375, 0.0, -24.3125, 180, 0, 180, 3,
                         19, 21, 0, 51, 24, null),
                 new FrogPosition("DES4_D4", 24.0, 0.0, -104.0, 180, 89.9, 180, 3,
                         23, 16, 0, 25, 24,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)}),
                 new FrogPosition("DES4_D3", 104.0625, -8.0625, -6.6875, 180, 0, 180, 3,
                         28, 22, 0, 38, 24, null),
                 new FrogPosition("DES4_E1", 200.0, -96.0, -40.0, 0, -89.9, 0, 4,
                         34, 20, 0, 28, 24, null),
                 new FrogPosition("DES4_E2", 120.3125, -95.9375, -119.8125, 0, 89.9, 0, 4,
                         29, 15, 0, 28, 24, null), //
                 new FrogPosition("DES4_E3", -7.8125, -72.0, -120.3125, 180, 0, 180, 4,
                         21, 15, 0, 5, 24, null) //
         )));
         FROG_LOCATIONS.put("DES5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("DES5_A1", -200.375, -96.3125, -182.875, 0, 0, 0, 0,
                         8, 10, 0, 3, 41, null),
                 new FrogPosition("DES5_B1", 120.0, -96.0, -104.0, 0, 0, 0, 1,
                         28, 15, 0, 0, 41, null), //
                 new FrogPosition("DES5_C2", -56.0, -96.0, 120.0, 180, 0, 180, 2,
                         17, 29, 0, 15, 41, null),
                 new FrogPosition("DES5_C1", -120.0, -194.5, 88.0, 0, 89.9, 0, 2,
                         13, 27, 0, 0, 41, null),
                 new FrogPosition("DES5_D1", -199.8125, -390.375, 201.9375, 180, 0, 180, 3,
                         8, 34, 0, 0, 41, null), //
                 new FrogPosition("DES5_E1", 88.0, -96.0, 200.0, 0, -89.9, 0, 4,
                         26, 34, 0, 0, 41, null),
                 new FrogPosition("DES5_F1", 168.375, -351.9375, 218.375, 180, 0, 180, 5,
                         31, 35, 0, 0, 41, null), //
                 new FrogPosition("DES5_G1", 56.0, 0.0, 72.0, 0, -89.9, 0, 6,
                         24, 26, 0, 0, 41, null),
                 new FrogPosition("DES5_H1", 88.0, 0.0, -152.0, 0, 89.9, 0, 7,
                         26, 12, 0, 0, 41, null),
                 new FrogPosition("DES5_H2", 232.0, 0.0, -24.0, 180, 0, 180, 7,
                         35, 20, 0, 0, 41, null), //
                 new FrogPosition("DES5_I1", -56.25, -0.1875, -199.125, 180, 0, 180, 8,
                         17, 9, 0, 0, 41, null),
                 new FrogPosition("DES5_I2", -232.375, 0.0, -198.875, 180, 0, 180, 8,
                         6, 9, 0, 11, 41, null),
                 new FrogPosition("DES5_J1", -184.0, -8.0, 8.0, 180, 0, 180, 9,
                         9, 22, 0, 0, 41, null) //
         )));
         FROG_LOCATIONS.put("JUN1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition("JUN1_A1", 152.1875, -8.8125, -424.5, 0, 0, 0, 0,
                         23, 3, 0, 8, 1, null),
                 new FrogPosition("JUN1_B1", -136.0, -11.1875, -424.0, 0, 0, 0, 1, //
                         5, 3, 0, 8, 1, null),
                 new FrogPosition("JUN1_C1", -39.5, -12.5, -343.3125, 0, 0, 0, 2,
                         11, 8, 0, 15, 1, null),
                 new FrogPosition("JUN1_D1", 168.5625, -37.3125, -296.25, 0, -89.9, 0, 3,
                         24, 11, 0, -1, -1, null), //mushroom tile
                 new FrogPosition("JUN1_E1", 136.0, -64.0, -168.0, 180, 0, 180, 4, //
                         22, 19, 0, 8, 1, null),
                 new FrogPosition("JUN1_F1", -55.75, -43.9375, -232.5, 0, -89.9, 0, 5,
                         10, 15, 0, 23, 1,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)}),
                 new FrogPosition("JUN1_G1", 8.3125, -54.6875, -150.875, 0, 89.9, 0, 6,
                         14, 20, 0, 28, 1,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)}),
                 new FrogPosition("JUN1_G2", -71.75, -112.9375, -72.5, 0, -89.9, 0, 6,
                         9, 25, 0, 28, 1, null),
                 new FrogPosition("JUN1_H1", -71.75, -136.4375, -24.5, 0, -89.9, 0, 7,
                         9, 28, 0, 21, 1, null),
                 new FrogPosition("JUN1_I1", -8.0, -166.0625, -40.0, 0, 0, 0, 8, //
                         13, 27, 0, 8, 1, null),
                 new FrogPosition("JUN1_J1", 88.3125, -116.5625, -24.375, 0, -89.9, 0, 9,
                         19, 28, 0, 21, 1, null),
                 new FrogPosition("JUN1_K4", 152.0, -162.125, 56.0, 0, 0, 0, 10,
                         23, 33, 0, 8, 1, null), //
                 new FrogPosition("JUN1_K3", 120.1875, -182.4375, 119.4375, 0, -89.9, 0, 10,
                         21, 37, 0, 44, 46, null),
                 new FrogPosition("JUN1_K2", -72.0, -182.875, 104.0, 0, 0, 0, 10, //
                         9, 36, 0, 44, 46, null),
                 new FrogPosition("JUN1_K1", -135.75, -150.75, 135.4375, 0, 89.9, 0, 10,
                         5, 38, 0, 45, 46,
                         new ByteUV[]{new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f)})
         )));
     }



     public static Map<String, ArrayList<StartPosition>> START_LOCATIONS = new HashMap<>();
     static {
         START_LOCATIONS.put("ORG1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("ORG1_A1", 10, 1, FroggerMapStartRotation.NORTH, 0, 25,
                         -1, -1, null,
                         new ArrayList<>()) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1) River Side
         ))
         );
         START_LOCATIONS.put("ORG2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("ORG2_A1", 10, 1, FroggerMapStartRotation.NORTH, 0, 20,
                         -1, -1, null,
                         new ArrayList<>()) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1) River Side
         )));
         START_LOCATIONS.put("ORG3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("ORG3_A1", 10, 1, FroggerMapStartRotation.NORTH, 0, 30,
                         -1, -1, null,
                         new ArrayList<>()) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1) River Side
         )));
         START_LOCATIONS.put("ORG4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("ORG4_A1", 10, 1, FroggerMapStartRotation.NORTH, 0, 24,
                         -1, -1, null,
                         new ArrayList<>()) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1) River Side
         )));
         START_LOCATIONS.put("ORG5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("ORG5_A1", 10, 1, FroggerMapStartRotation.NORTH, 0, 30,
                         -1, -1, null,
                         new ArrayList<>()) //,
                 //new StartPosition(10, 13, StartRotation.SOUTH, 1) River Side
         )));
         START_LOCATIONS.put("SUB1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SUB1_A1", 17, 21, FroggerMapStartRotation.NORTH, 0, 60,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_A1", "SUB1_A2", "SUB1_A3"))), //
                 new StartPosition("SUB1_B1", 23, 26, FroggerMapStartRotation.EAST, 1, 72,
                         14, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_A1", "SUB1_A2", "SUB1_A3", "SUB1_B1"))),
                 new StartPosition("SUB1_C1", 16, 42, FroggerMapStartRotation.EAST, 2, 52,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_C1", "SUB1_C2", "SUB1_C3", "SUB1_C4"))),
                 new StartPosition("SUB1_C2", 19, 38, FroggerMapStartRotation.NORTH, 2, 52,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_C1", "SUB1_C2", "SUB1_C3", "SUB1_C4"))),
                 new StartPosition("SUB1_C3", 37, 42, FroggerMapStartRotation.SOUTH, 2, 45,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_C2", "SUB1_C3", "SUB1_C4"))),
                 new StartPosition("SUB1_D1", 50, 42, FroggerMapStartRotation.WEST, 3, 52,
                         14, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_C4", "SUB1_D1", "SUB1_D2"))),
                 new StartPosition("SUB1_F1", 51, 29, FroggerMapStartRotation.EAST, 5, 45,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_F1", "SUB1_F2", "SUB1_F3"))),
                 new StartPosition("SUB1_F2", 47, 22, FroggerMapStartRotation.NORTH, 5, 50,
                         13, 47, null,
                         new ArrayList<>(Arrays.asList("SUB1_F1", "SUB1_F2", "SUB1_F3")))
         )));
         START_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SUB2_A1", 26, 6, FroggerMapStartRotation.NORTH, 0, 45,
                         2, 12, null,
                         new ArrayList<>(Arrays.asList("SUB2_A1", "SUB2_A2"))), //
                 new StartPosition("SUB2_B1", 19, 26, FroggerMapStartRotation.WEST, 1, 51,
                         2, 12, null,
                         new ArrayList<>(Arrays.asList("SUB2_A2", "SUB2_B1", "SUB2_B2", "SUB2_B3"))),
                 new StartPosition("SUB2_C1", 21, 34, FroggerMapStartRotation.SOUTH, 2, 64,
                         2, 12, null,
                         new ArrayList<>(Arrays.asList("SUB2_C1", "SUB2_C2", "SUB2_C3", "SUB2_C4", "SUB2_C5", "SUB2_C6"))),
                 new StartPosition("SUB2_D1", 31, 29, FroggerMapStartRotation.WEST, 3, 57,
                         2, 12, null,
                         new ArrayList<>(Arrays.asList("SUB2_D1", "SUB2_C2", "SUB2_C4")))
         )));
         START_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SUB3_A1", 21, 6, FroggerMapStartRotation.NORTH, 0, 50,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_A1", "SUB3_A2", "SUB3_A3", "SUB3_A4"))), //
                 new StartPosition("SUB3_B1", 5, 11, FroggerMapStartRotation.EAST, 1, 50,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_B1", "SUB3_B2"))),
                 new StartPosition("SUB3_C1", 17, 17, FroggerMapStartRotation.EAST, 2, 44,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_C1", "SUB3_F1"))),
                 new StartPosition("SUB3_C2", 14, 24, FroggerMapStartRotation.SOUTH, 2, 46,
                         36, 43,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("SUB3_C1"))),
                 new StartPosition("SUB3_D1", 16, 38, FroggerMapStartRotation.SOUTH, 3, 50,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_D1"))),
                 new StartPosition("SUB3_E1", 25, 31, FroggerMapStartRotation.EAST, 4, 50,
                         17, 43,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("SUB3_E1", "SUB3_E2"))),
                 new StartPosition("SUB3_E2", 39, 24, FroggerMapStartRotation.NORTH, 4, 50,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_E2", "SUB3_E3"))),
                 new StartPosition("SUB3_F1", 29, 10, FroggerMapStartRotation.SOUTH, 5, 50,
                         12, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_F1", "SUB3_F2", "SUB3_F3"))),
                 new StartPosition("SUB3_F2", 35, 11, FroggerMapStartRotation.WEST, 5, 50,
                         0, 43, null,
                         new ArrayList<>(Arrays.asList("SUB3_F1", "SUB3_F2", "SUB3_F3")))
         )));
         START_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SUB4_A1", 17, 24, FroggerMapStartRotation.NORTH, 0, 60,
                         9, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_A1", "SUB4_A2", "SUB4_A3"))), //
                 new StartPosition("SUB4_A2", 23, 29, FroggerMapStartRotation.EAST, 0, 72,
                         14, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_A1", "SUB4_A2", "SUB4_A3"))),
                 new StartPosition("SUB4_C1", 19, 41, FroggerMapStartRotation.NORTH, 2, 55,
                         9, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_C1", "SUB4_C2"))),
                 new StartPosition("SUB4_D1", 32, 39, FroggerMapStartRotation.EAST, 3, 49,
                         9, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_C2", "SUB4_D1"))),
                 new StartPosition("SUB4_D2", 37, 45, FroggerMapStartRotation.SOUTH, 3, 52,
                         14, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_C2", "SUB4_D1"))),
                 new StartPosition("SUB4_E1", 56, 41, FroggerMapStartRotation.NORTH, 4, 55,
                         14, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_E1", "SUB4_E2"))),
                 new StartPosition("SUB4_F1", 47, 32, FroggerMapStartRotation.WEST, 5, 52,
                         9, 19, null,
                         new ArrayList<>(Arrays.asList("SUB4_F1", "SUB4_F2", "SUB4_F3")))
         )));
         START_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SUB5_A1", 33, 7, FroggerMapStartRotation.NORTH, 0, 40,
                         0, 9, null,
                         new ArrayList<>(Arrays.asList("SUB5_A1", "SUB5_A2", "SUB5_A3", "SUB5_A4"))), //
                 new StartPosition("SUB5_A2", 20, 12, FroggerMapStartRotation.EAST, 0, 40,
                         0, 9, null,
                         new ArrayList<>(Arrays.asList("SUB5_A1", "SUB5_A2", "SUB5_A3", "SUB5_A4"))),
                 new StartPosition("SUB5_B1", 20, 27, FroggerMapStartRotation.EAST, 1, 40,
                         3, 9, null,
                         new ArrayList<>(Arrays.asList("SUB5_A4", "SUB5_B1", "SUB5_B2"))),
                 new StartPosition("SUB5_C1", 36, 22, FroggerMapStartRotation.SOUTH, 2, 54,
                         29, 9, null,
                         new ArrayList<>(Arrays.asList("SUB5_C1", "SUB5_C2", "SUB5_C3", "SUB5_C4", "SUB5_C5"))),
                 new StartPosition("SUB5_D1", 38, 30, FroggerMapStartRotation.WEST, 3, 45,
                         0, 9, null,
                         new ArrayList<>(Arrays.asList("SUB5_D1", "SUB5_C5", "SUB5_C2")))
         )));
         START_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("FOR1_A1", 9, 3, FroggerMapStartRotation.NORTH, 0, 25, // TODO: UVs Bugged
                         3, 30, //
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_A1", "FOR1_A2", "FOR1_A3", "FOR1_A4", "FOR1_A5", "FOR1_A6", "FOR1_F1", "FOR1_F2", "FOR1_F3", "FOR1_F4"))),
                 new StartPosition("FOR1_B1", 3, 9, FroggerMapStartRotation.EAST, 1, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_A1", "FOR1_A2", "FOR1_A3", "FOR1_A4", "FOR1_A5", "FOR1_A6", "FOR1_B1", "FOR1_F1", "FOR1_F2", "FOR1_F3", "FOR1_F4"))),
                 new StartPosition("FOR1_C1", 3, 19, FroggerMapStartRotation.EAST, 2, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_C1", "FOR1_C2", "FOR1_C3", "FOR1_C4", "FOR1_C5", "FOR1_C6", "FOR1_D1", "FOR1_D2", "FOR1_D3", "FOR1_D4", "FOR1_D5"))),
                 new StartPosition("FOR1_D1", 15, 20, FroggerMapStartRotation.SOUTH, 3, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_C1", "FOR1_C2", "FOR1_C3", "FOR1_C4", "FOR1_C5", "FOR1_C6", "FOR1_D1", "FOR1_D2", "FOR1_D3", "FOR1_D4", "FOR1_D5"))),
                 new StartPosition("FOR1_D2", 24, 15, FroggerMapStartRotation.WEST, 3, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_D1", "FOR1_D2", "FOR1_D3", "FOR1_D4", "FOR1_D5", "FOR1_E1", "FOR1_F1", "FOR1_F2", "FOR1_F3", "FOR1_F4"))),
                 new StartPosition("FOR1_F2", 24, 5, FroggerMapStartRotation.WEST, 5, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_A1", "FOR1_A2", "FOR1_A3", "FOR1_A4", "FOR1_A5", "FOR1_A6", "FOR1_E1", "FOR1_F1", "FOR1_F2", "FOR1_F3", "FOR1_F4"))),
                 new StartPosition("FOR1_F1", 19, 3, FroggerMapStartRotation.NORTH, 5, 25,
                         0, 30,
                         new ByteUV[]{new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f)},
                         new ArrayList<>(Arrays.asList("FOR1_A1", "FOR1_A2", "FOR1_A3", "FOR1_A4", "FOR1_A5", "FOR1_A6", "FOR1_E1", "FOR1_F1", "FOR1_F2", "FOR1_F3", "FOR1_F4")))
         )));
         START_LOCATIONS.put("FOR2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("FOR2_A1", 15, 23, FroggerMapStartRotation.SOUTH, 0, 45,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1"))),
                 new StartPosition("FOR2_A3", 15, 29, FroggerMapStartRotation.NORTH, 0, 45,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1"))),
                 new StartPosition("FOR2_A2", 18, 26, FroggerMapStartRotation.EAST, 0, 45,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1"))),
                 new StartPosition("FOR2_B1", 20, 19, FroggerMapStartRotation.WEST, 1, 45,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_B1", "FOR2_C1", "FOR2_C2", "FOR2_C3"))),
                 new StartPosition("FOR2_E1", 6, 5, FroggerMapStartRotation.WEST, 4, 34,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1", "FOR2_E1", "FOR2_H1", "FOR2_H2"))),
                 new StartPosition("FOR2_G1", 24, 15, FroggerMapStartRotation.SOUTH, 6, 34,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1", "FOR2_G1", "FOR2_H1", "FOR2_H2", "FOR2_I1"))),
                 new StartPosition("FOR2_H1", 30, 10, FroggerMapStartRotation.WEST, 7, 34,
                         -1, -1, null,
                         new ArrayList<>(Arrays.asList("FOR2_A1", "FOR2_B1", "FOR2_G1", "FOR2_G2", "FOR2_H1", "FOR2_H2")))
         )));
         START_LOCATIONS.put("VOL1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("VOL1_A1", 9, 2, FroggerMapStartRotation.NORTH, 0, 40,
                         3, 34, null,
                         new ArrayList<>()),
                 new StartPosition("VOL1_A2", 2, 3, FroggerMapStartRotation.EAST, 0, 40,
                         3, 34, null,
                         new ArrayList<>()),
                 new StartPosition("VOL1_A3", 16, 3, FroggerMapStartRotation.WEST, 0, 40,
                         3, 34, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("VOL2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("VOL2_A1", 9, 2, FroggerMapStartRotation.NORTH, 0, 60,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("VOL3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("VOL3_A1", 3, 3, FroggerMapStartRotation.NORTH, 0, 60,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("CAV1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("CAV1_A1", 11, 2, FroggerMapStartRotation.NORTH, 0, 60,
                         3, 4, null,
                         new ArrayList<>(Arrays.asList("CAV1_A1", "CAV1_A2", "CAV1_B1", "CAV1_B2", "CAV1_H1"))),
                 new StartPosition("CAV1_C1", 3, 7, FroggerMapStartRotation.EAST, 2, 60,
                         23, 4, null,
                         new ArrayList<>(Arrays.asList("CAV1_A1", "CAV1_A2", "CAV1_B1", "CAV1_B2", "CAV1_C1", "CAV1_C2", "CAV1_D1", "CAV1_D2"))),
                 new StartPosition("CAV1_E1", 5, 22, FroggerMapStartRotation.SOUTH, 4, 60,
                         27, 4, null,
                         new ArrayList<>(Arrays.asList("CAV1_D1", "CAV1_D2", "CAV1_E1", "CAV1_E2", "CAV1_E3", "CAV1_E4", "CAV1_E5", "CAV1_F1", "CAV1_F2"))),
                 new StartPosition("CAV1_E2", 15, 22, FroggerMapStartRotation.SOUTH, 4, 60,
                         1, 4, null,
                         new ArrayList<>(Arrays.asList("CAV1_D1", "CAV1_D2", "CAV1_E1", "CAV1_E2", "CAV1_E3", "CAV1_E4", "CAV1_E5", "CAV1_F1", "CAV1_F2"))),
                 new StartPosition("CAV1_G1", 19, 7, FroggerMapStartRotation.WEST, 6, 60,
                         22, 4, null,
                         new ArrayList<>(Arrays.asList("CAV1_A1", "CAV1_A2", "CAV1_F1", "CAV1_F2", "CAV1_G1", "CAV1_G2", "CAV1_H1")))
         )));
         START_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("CAV3_A1", 13, 12, FroggerMapStartRotation.NORTH, 0, 52,
                        7,  2, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("CAV4_A1", 17, 5, FroggerMapStartRotation.NORTH, 0, 38, // TODO: didn't reset
                         4, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_A1"))), //
                 new StartPosition("CAV4_C1", 4, 16, FroggerMapStartRotation.EAST, 2, 50,
                         13, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_C1", "CAV4_C2", "CAV4_E1"))),
                 new StartPosition("CAV4_E1", 17, 17, FroggerMapStartRotation.NORTH, 4, 45,
                          7, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_C1", "CAV4_C2", "CAV4_E1"))),
                 new StartPosition("CAV4_H1", 6, 29, FroggerMapStartRotation.EAST, 7, 60,
                         24, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_H1", "CAV4_I2"))),
                 new StartPosition("CAV4_H2", 23, 29, FroggerMapStartRotation.WEST, 7, 60,
                         23, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_H1", "CAV4_I2"))),
                 new StartPosition("CAV4_I1", 16, 37, FroggerMapStartRotation.SOUTH, 8, 65,
                         17, 21, null,
                         new ArrayList<>(Arrays.asList("CAV4_I1", "CAV4_I2", "CAV4_I3", "CAV4_I4")))
         )));
         START_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SKY1_A1", 20, 15, FroggerMapStartRotation.NORTH, 0, 70,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList("SKY1_B1"))),
                 new StartPosition("SKY1_C1", 10, 30, FroggerMapStartRotation.EAST, 2, 54,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList("SKY1_B1", "SKY1_C1"))),
                 new StartPosition("SKY1_E1", 30, 13, FroggerMapStartRotation.NORTH, 4, 54,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList("SKY1_E1", "SKY1_E2"))),
                 new StartPosition("SKY1_F1", 32, 31, FroggerMapStartRotation.SOUTH, 5, 42,
                         0, 2, null,
                         new ArrayList<>(Arrays.asList("SKY1_D1", "SKY1_F1")))
         )));
         START_LOCATIONS.put("SKY2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SKY2_A1", 23, 8, FroggerMapStartRotation.NORTH, 0, 60,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SKY3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SKY3_A1", 3, 9, FroggerMapStartRotation.NORTH, 0, 22,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SKY4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SKY4_A1", 23, 18, FroggerMapStartRotation.NORTH, 0, 34,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SWP1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SWP1_A1", 10, 10, FroggerMapStartRotation.NORTH, 0, 23,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SWP2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SWP2_A1", 10, 10, FroggerMapStartRotation.NORTH, 0, 50,
                         -1, -1, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SWP3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SWP3_A1", 15, 4, FroggerMapStartRotation.NORTH, 0, 40,
                         -1, -1, null,
                         new ArrayList<>()), //ignoring since too complicated to overwrite and mostly out of view anyway
                 new StartPosition("SWP3_B1", 13, 17, FroggerMapStartRotation.NORTH, 1, 34,
                         1, 75, null,
                         new ArrayList<>(Arrays.asList("SWP3_B1", "SWP3_B2"))), //TODO: Need to move so camera doesn't flip out
                 new StartPosition("SWP3_D1", 17, 17, FroggerMapStartRotation.NORTH, 3, 34,
                         15, 75, null,
                         new ArrayList<>()) //TODO: Need to move so camera doesn't flip out
         )));
         START_LOCATIONS.put("SWP4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SWP4_A2", 14, 12, FroggerMapStartRotation.NORTH, 0, 45,
                         44, 66, null,
                         new ArrayList<>()),
                 new StartPosition("SWP4_A1", 11, 15, FroggerMapStartRotation.EAST, 0, 45,
                         44, 66, null,
                         new ArrayList<>()),
                 new StartPosition("SWP4_A3", 17, 15, FroggerMapStartRotation.WEST, 0, 45,
                         44, 66, null,
                         new ArrayList<>())
         )));
         START_LOCATIONS.put("SWP5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("SWP5_A1", 25, 5, FroggerMapStartRotation.NORTH, 0, 60,
                         4, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_A1"))),
                 new StartPosition("SWP5_B1", 15, 3, FroggerMapStartRotation.NORTH, 1, 70,
                         3, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_B1", "SWP5_B2"))),
                 new StartPosition("SWP5_D1", 26, 30, FroggerMapStartRotation.WEST, 3, 60,
                         2, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_D1", "SWP5_D2"))),
                 new StartPosition("SWP5_F1", 15, 27, FroggerMapStartRotation.EAST, 5, 60,
                         4, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_F1", "SWP5_F2"))),
                 new StartPosition("SWP5_G2", 9, 26, FroggerMapStartRotation.NORTH, 6, 70,
                         35, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_G1", "SWP5_G2", "SWP5_I1", "SWP5_I2"))),
                 new StartPosition("SWP5_G1", 3, 34, FroggerMapStartRotation.SOUTH, 6, 70,
                         35, 58, null,
                         new ArrayList<>(Arrays.asList("SWP5_G1", "SWP5_G2", "SWP5_I1", "SWP5_I2")))
         )));
         START_LOCATIONS.put("DES1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("DES1_A1", 21, 8, FroggerMapStartRotation.NORTH, 0, 40, // TODO: default Texture UVs look weird
                         1, 88, null,
                         new ArrayList<>(Arrays.asList("DES1_A1", "DES1_A2", "DES1_A3"))), //
                 new StartPosition("DES1_B1", 7, 15, FroggerMapStartRotation.EAST, 1, 40,
                         11, 88, null,
                         new ArrayList<>(Arrays.asList("DES1_B1", "DES1_B2"))),
                 new StartPosition("DES1_C1", 21, 30, FroggerMapStartRotation.NORTH, 2, 32,
                         1, 88, null,
                         new ArrayList<>(Arrays.asList("DES1_C1", "DES1_C2", "DES1_C3", "DES1_C4", "DES1_C5"))),
                 new StartPosition("DES1_D1", 36, 15, FroggerMapStartRotation.WEST, 3, 40,
                         1, 88, null,
                         new ArrayList<>(Arrays.asList("DES1_D1", "DES1_D2", "DES1_D3")))
         )));
         START_LOCATIONS.put("DES2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("DES2_A1", 8, 9, FroggerMapStartRotation.NORTH, 0, 50,
                         0, 92, null,
                         new ArrayList<>(Arrays.asList("DES2_A1", "DES2_A2", "DES2_A3"))), //
                 new StartPosition("DES2_B1", 9, 28, FroggerMapStartRotation.EAST, 1, 58,
                         56, 92, null,
                         new ArrayList<>(Arrays.asList("DES2_A3", "DES2_B1", "DES2_B2"))),
                 new StartPosition("DES2_D1", 26, 15, FroggerMapStartRotation.NORTH, 3, 44,
                         38, 92, null,
                         new ArrayList<>(Arrays.asList("DES2_A2", "DES2_A3", "DES2_D1", "DES2_D2", "DES2_D3"))),
                 new StartPosition("DES2_E1", 30, 20, FroggerMapStartRotation.SOUTH, 4, 44,
                         30 , 92, null,
                         new ArrayList<>(Arrays.asList("DES2_E1", "DES2_E2")))
         )));
         START_LOCATIONS.put("DES3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("DES3_A1", 6, 4, FroggerMapStartRotation.NORTH, 0, 30,
                         0, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_A1", "DES3_A2"))), //
                 new StartPosition("DES3_B1", 6, 9, FroggerMapStartRotation.NORTH, 1, 30,
                         0, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_B1"))),
                 new StartPosition("DES3_C1", 11, 4, FroggerMapStartRotation.EAST, 2, 30,
                         0, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_C1"))),
                 new StartPosition("DES3_E1", 3, 24, FroggerMapStartRotation.EAST, 4, 30,
                         11, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_E1", "DES3_F1"))),
                 new StartPosition("DES3_F1", 11, 32, FroggerMapStartRotation.SOUTH, 5, 30,
                         0, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_F1", "DES3_F2"))),
                 new StartPosition("DES3_G1", 15, 20, FroggerMapStartRotation.NORTH, 6, 30,
                         15, 80, null,
                         new ArrayList<>(Arrays.asList("DES3_F2", "DES3_G1")))
         )));
         START_LOCATIONS.put("DES4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("DES4_A1", 21, 8, FroggerMapStartRotation.NORTH, 0, 70,
                         5, 68, null,
                         new ArrayList<>(Arrays.asList("DES4_A1", "DES4_A2"))), //
                 new StartPosition("DES4_B1", 7, 15, FroggerMapStartRotation.EAST, 1, 70,
                         11, 68, null,
                         new ArrayList<>(Arrays.asList("DES4_B1", "DES4_B2"))),
                 new StartPosition("DES4_C1", 21, 37, FroggerMapStartRotation.SOUTH, 2, 55,
                         39, 68, null,
                         new ArrayList<>(Arrays.asList("DES4_C1", "DES4_C2", "DES4_C3"))),
                 new StartPosition("DES4_E2", 36, 15, FroggerMapStartRotation.WEST, 4, 65,
                         5, 68, null,
                         new ArrayList<>(Arrays.asList("DES4_E1", "DES4_E2", "DES4_E3"))),
                 new StartPosition("DES4_E1", 22, 16, FroggerMapStartRotation.SOUTH, 4, 70,
                         5, 68, null,
                         new ArrayList<>(Arrays.asList("DES4_E1", "DES4_E2", "DES4_E3")))
         )));
         START_LOCATIONS.put("DES5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("DES5_A1", 8, 9, FroggerMapStartRotation.NORTH, 0, 75,
                         0, 93, null, //
                         new ArrayList<>(Arrays.asList("DES5_A1", "DES5_C1", "DES5_C2"))),
                 new StartPosition("DES5_A2", 17, 19, FroggerMapStartRotation.WEST, 0, 67,
                         46, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_A1", "DES5_C1", "DES5_C2"))),
                 new StartPosition("DES5_B1", 26, 15, FroggerMapStartRotation.NORTH, 1, 67,
                         36, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_B1", "DES5_C2"))),
                 new StartPosition("DES5_D1", 7, 29, FroggerMapStartRotation.EAST, 3, 75,
                         14, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_D1"))),
                 new StartPosition("DES5_E1", 17, 34, FroggerMapStartRotation.EAST, 4, 75,
                         0, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_E1"))),
                 new StartPosition("DES5_E2", 28, 20, FroggerMapStartRotation.SOUTH, 4, 70,
                         14, 93,
                         new ByteUV[]{new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("DES5_E1"))),
                 new StartPosition("DES5_G1", 18, 17, FroggerMapStartRotation.EAST, 6, 75,
                         31, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_G1", "DES5_H1", "DES5_I1"))),
                 new StartPosition("DES5_H1", 34, 20, FroggerMapStartRotation.SOUTH, 7, 75,
                         11, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_H1", "DES2_H2"))),
                 new StartPosition("DES5_J1", 6, 17, FroggerMapStartRotation.EAST, 9, 75,
                         0, 93, null,
                         new ArrayList<>(Arrays.asList("DES5_I1", "DES5_I2", "DES5_J1")))
         )));
         START_LOCATIONS.put("JUN1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition("JUN1_A1", 12, 3, FroggerMapStartRotation.NORTH, 0, 45, //
                         43, 7,  // UVs of the default underlying dirt tile are backwards here so using a stone block TODO: fix tile ID
                         null, new ArrayList<>(Arrays.asList("JUN1_A1", "JUN1_C1"))),
                 new StartPosition("JUN1_B1", 6, 3, FroggerMapStartRotation.NORTH, 1, 45,
                         2, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_B1", "JUN1_C1"))),
                 new StartPosition("JUN1_E1", 24, 17, FroggerMapStartRotation.WEST, 4, 45,
                         24, 7,
                         new ByteUV[]{new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_D1", "JUN1_E1", "JUN1_F1"))),
                 new StartPosition("JUN1_F1", 13, 15, FroggerMapStartRotation.SOUTH, 5, 40,
                         24, 7,
                         new ByteUV[]{new ByteUV(1.0f,0.0f), new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_C1", "JUN1_E1", "JUN1_F1"))),
                 new StartPosition("JUN1_G1", 11, 20, FroggerMapStartRotation.SOUTH, 6, 37,
                         26, 7, null,
                         new ArrayList<>(Arrays.asList("JUN1_G1", "JUN1_G2"))),
                 new StartPosition("JUN1_G2", 9, 25, FroggerMapStartRotation.WEST, 6, 35,
                         28, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_G1", "JUN1_G2"))),
                 new StartPosition("JUN1_H1", 9, 29, FroggerMapStartRotation.NORTH, 7, 53,
                         21, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_H1"))),
                 new StartPosition("JUN1_J1", 19, 29, FroggerMapStartRotation.WEST, 9, 45,
                         6, 7,
                         new ByteUV[]{new ByteUV(1.0f,1.0f), new ByteUV(0.0f,1.0f), new ByteUV(0.0f,0.0f), new ByteUV(1.0f,0.0f)},
                         new ArrayList<>(Arrays.asList("JUN1_I1", "JUN1_J1", "JUN1_K1", "JUN1_K2", "JUN1_K3", "JUN1_K4"))),
                 new StartPosition("JUN1_K1", 6, 34, FroggerMapStartRotation.NORTH, 10, 45,
                         44, 7, null,
                         new ArrayList<>(Arrays.asList("JUN1_I1", "JUN1_J1", "JUN1_K1", "JUN1_K2", "JUN1_K3", "JUN1_K4"))),
                 new StartPosition("JUN1_K2", 14, 38, FroggerMapStartRotation.SOUTH, 10, 45,
                         44, 7, null,
                         new ArrayList<>(Arrays.asList("JUN1_I1", "JUN1_J1", "JUN1_K1", "JUN1_K2", "JUN1_K3", "JUN1_K4")))
         )));

     }


}
