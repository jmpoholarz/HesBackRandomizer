package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.StartRotation;

import java.lang.reflect.Array;
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
                 new FrogPosition(-216.0, -41.6875, -168.0, 0, -89.9, 0, 0),
                 new FrogPosition(-360.0, -39.125, -136.0, 0, 89.9, 0, 0),
                 new FrogPosition(-120.0, -48.6875, -8.0, 0, 89.9, 0, 0),
                 new FrogPosition(-264.125, -38.6875, 71.5625, 180, 0, 180, 1),
                 new FrogPosition(-360.0, -37.1875, 104.0, 0, 0, 0, 2),
                 new FrogPosition(-343.8125, -34.8125, 264.125, 180, 0, 180, 2),
                 new FrogPosition(-199.8125, -35.0, 264.125, 180, 0, 180, 2),
                 new FrogPosition(-24.0, -36.0625, 280.0, 180, 0, 180, 2),
                 new FrogPosition(184.125, -36.5, 264.1875, 180, 0, 180, 3),
                 new FrogPosition(360.0, -38.375, 56.0, 0, 0, 0, 3),
                 new FrogPosition(328.1875, -84.0625, 151.8125, 0, -89.9, 0, 4),
                 new FrogPosition(295.8125, -36.125, 23.8125, 0, 0, 0, 5),
                 new FrogPosition(136.125, -60.125, 39.375, 0, -89.9, 0, 5),
                 new FrogPosition(168.0625, -35.25, -120.0, 0, -89.9, 0, 5)
         )));
         FROG_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-24.0, -3.4375, -616.0, 0, 0, 0, 0),
                 new FrogPosition(-104.0, -65.875, -520.0, 0, 89.9, 0, 0),
                 new FrogPosition(-56.0, -70.25, -376.0, 0, -89.9, 0, 1),
                 new FrogPosition(-170.3125, -67.6875, -295.875, 0, 89.9, 0, 1),
                 new FrogPosition(-135.75, -67.1875, -217.5625, 180, 0, 180, 1),
                 new FrogPosition(-40.0, -3.1875, -361.6875, 0, 0, 0, 2),
                 new FrogPosition(-71.0, -19.375, -231.8125, 0, 89.9, 0, 2),
                 new FrogPosition(8.25, -3.4375, -375.375, 0, 89.9, 0, 2),
                 new FrogPosition(40.0, -15.25, -200.0, 180, 0, 180, 2),
                 new FrogPosition(-7.9375, -4.25, -296.25, 0, 89.9, 0, 2),
                 new FrogPosition(-152.0, -3.4375, -200.0, 0, 0, 0, 2),
                 new FrogPosition(120.6875, -7.5, -199.75, 180, 0, 180, 3),
                 new FrogPosition(168.125, -131.875, -200.9375, 180, 0, 180, 4),
                 new FrogPosition(215.9375, -72.625, -361.6875, 0, 0, 0, 4)
         )));
         FROG_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-184.0, 0.0, -200.0, 0, -89.9, 0, 0),
                 new FrogPosition(-88.0, 0.0, -200.0, 0, 89.9, 0, 0),
                 new FrogPosition(-56.0, 0.0, -136.0, 0, -89.9, 0, 0),
                 new FrogPosition(40.0, 0.0, -184.0, 180, 0, 180, 0),
                 new FrogPosition(-279.8125, 3.4375, -231.75, 180, 0, 180, 1),
                 new FrogPosition(-184.0, 0.0, -136.0, 0, 0, 0, 1),
                 new FrogPosition(-55.8125, 0.0, -8.3125, 180, 0, 180, 2),
                 new FrogPosition(-119.8125, 0.0, 280.125, 180, 0, 180, 3),
                 new FrogPosition(55.8125, 1.25, -8.125, 0, 0, 0, 4),
                 new FrogPosition(120.0, -14.375, 136.0, 180, 0, 180, 4),
                 new FrogPosition(248.125, 0.0, 24.125, 0, 0, 0, 4),
                 new FrogPosition(40.0, 0.0, -88.0, 180, 0, 180, 5),
                 new FrogPosition(120.0, 0.0, -152.0, 0, 89.9, 0, 5),
                 new FrogPosition(200.0, 0.0, -168.0, 0, -89.9, 0, 5)
         )));
         FROG_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-376.0, -38.0, -152.0, 0, 89.9, 0, 0),
                 new FrogPosition(-216.0, -41.75, -168.0, 0, -89.9, 0, 0),
                 new FrogPosition(-280.1875, -48.625, -8.375, 0, 89.9, 0, 0),
                 new FrogPosition(-360.0, -92.3125, 265.125, 180, 0, 180, 1),
                 new FrogPosition(-360.0, -37.1875, 104.0, 0, 0, 0, 2),
                 new FrogPosition(-184.25, -32.5625, 265.0625, -180, 0, -180, 2),
                 new FrogPosition(-8.0, -36.0625, 152.0, 0, -89.9, 0, 3),
                 new FrogPosition(264.125, -36.0625, 263.625, 180, 0, 180, 4),
                 new FrogPosition(360.0, -38.375, 56.0, 0, 0, 0, 4),
                 new FrogPosition(327.625, -84.0625, 151.8125, 0, -89.9, 0, 5),
                 new FrogPosition(295.8125, -36.0625, 24.3125, 0, 0, 0, 5),
                 new FrogPosition(104.0, -37.25, 72.0, 0, 0, 0, 5),
                 new FrogPosition(168.0, -35.25, -120.0, 0, -89.9, 0, 5)
         )));
         FROG_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-24.0, -35.375, -616.0, 0, 0, 0, 0),
                 new FrogPosition(-136.0, -40.625, -584.0, 0, 0, 0, 0),
                 new FrogPosition(-136.0, -34.875, -472.0, 0, -89.9, 0, 0),
                 new FrogPosition(-56.0, -101.125, -376.0, 0, -89.9, 0, 0),
                 new FrogPosition(-69.25, -101.0625, -295.8125, 0, -89.9, 0, 1),
                 new FrogPosition(-136.125, -99.1875, -215.625, 0, 0, 0, 1),
                 new FrogPosition(-40.0, -38.3125, -361.6875, 0, 0, 0, 2),
                 new FrogPosition(-7.6875, -36.1875, -279.75, 0, 89.9, 0, 2),
                 new FrogPosition(-71.0, -51.1875, -231.8125, 0, 89.9, 0, 2),
                 new FrogPosition(7.6875, -35.375, -374.125, 0, 89.9, 0, 2),
                 new FrogPosition(-152.0, -35.375, -200.0, 0, 0, 0, 2),
                 new FrogPosition(120.6875, -36.0, -199.75, 180, 0, 180, 3),
                 new FrogPosition(168.0, -164.0, -198.25, 180, 0, 180, 4),
                 new FrogPosition(215.9375, -98.875, -361.6875, 0, 0, 0, 4)
         )));
         FROG_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-168.0, -35.625, -120.0, 0, 89.9, 0, 0),
                 new FrogPosition(-120.0, -32.5625, -136.0, 0, 0, 0, 0),
                 new FrogPosition(-152.0, -38.25, -88.0, 0, -89.9, 0, 0),
                 new FrogPosition(-120.0, -33.9375, -72.0, 180, 0, 180, 0),
                 new FrogPosition(-88.0, -30.4375, -88.0, 0, -89.9, 0, 0),
                 new FrogPosition(-56.0, -27.75, -88.0, 0, 89.9, 0, 0),
                 new FrogPosition(-168.0, -34.0, 8.0, 0, 89.9, 0, 1),
                 new FrogPosition(-169.6875, -37.5, 56.0625, 0, 89.9, 0, 2),
                 new FrogPosition(-169.6875, -38.0625, 88.0625, 0, 90, 0, 2),
                 new FrogPosition(-119.9375, -34.5625, 137.6875, 180, 0, 180, 2),
                 new FrogPosition(-55.875, -31.0, 137.6875, 180, 0, 180, 2),
                 new FrogPosition(-88.0, -31.25, 72.0, 0, -89.9, 0, 2),
                 new FrogPosition(-120.0, -32.8125, 56.0, 0, 0, 0, 2),
                 new FrogPosition(56.0625, -31.5625, 137.6875, 180, 0, 180, 3),
                 new FrogPosition(104.0, -28.3125, 88.0, 0, 0, 0, 3),
                 new FrogPosition(136.0, -30.75, 135.9375, 180, 0, 180, 3),
                 new FrogPosition(168.0, -31.1875, 88.0, 0, -89.9, 0, 3),
                 new FrogPosition(152.0, -30.1875, 40.0, 0, 0, 0, 3),
                 new FrogPosition(152.0, -27.0, -8.0, 180, 0, 180, 4),
                 new FrogPosition(55.875, -30.1875, -104.0, 0, 89.9, 0, 5),
                 new FrogPosition(120.0, -26.8125, -120.0, 0, 89.9, 0, 5),
                 new FrogPosition(168.0, -29.9375, -39.8125, 0, -89.9, 0, 5),
                 new FrogPosition(167.9375, -29.9375, -87.6875, 0, -89.9, 9, 5)
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
                 new FrogPosition(40.0, -7.125, -200.0, 0, 0, 0, 0),
                 new FrogPosition(-88.0, 0.0, -200.0, 0, 0, 0, 0),
                 new FrogPosition(-136.0, 0.0, -200.0, 0, 0, 0, 1),
                 new FrogPosition(-120.0, 0.0, -152.0, 180, 0, 180, 1),
                 new FrogPosition(-151.875, 0.0, -88.0, 180, 0, 180, 2),
                 new FrogPosition(-152.0, 0.0, 8.0, 180, 0, 180, 2),
                 new FrogPosition(-152.0, -18.6875, 56.0, 180, 0, 180, 3),
                 new FrogPosition(-151.9375, 2.4375, 119.0, 180, 0, 180, 3),
                 new FrogPosition(-87.8125, 2.4375, 119.0, 180, 0, 180, 4),
                 new FrogPosition(-23.8125, 2.125, 119.0, 180, 0, 180, 4),
                 new FrogPosition(-39.8125, 2.4375, 87.0, 180, 0, 180, 4),
                 new FrogPosition(8.0, -8.375, 88.0, 0, -89.9, 0, 4),
                 new FrogPosition(24.0, -4.1875, 72.0, 180, 0, 180, 4),
                 new FrogPosition(103.0, 1.25, 103.8125, 0, -89.9, 0, 5),
                 new FrogPosition(88.0, -4.1875, 24.0, 180, 0, 180, 5),
                 new FrogPosition(104.0, 0.0, -24.0, 180, 0, 180, 6),
                 new FrogPosition(88.0, -3.5625, -72.0, 0, 0, 0, 6),
                 new FrogPosition(72.0, -7.125, -200.0, 0, 0, 0, 7)
         )));
         FROG_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-104.0625, -819.6875, 24.0625, 180, 0, 180, 1),
                 new FrogPosition(-104.0, -695.0, 424.0, 180, 0, 180, 1),
                 new FrogPosition(87.75, -620.5625, 600.1875, 0, -89.9, 0, 1),
                 new FrogPosition(71.75, -576.75, 312.1875, 0, 0, 0, 1),
                 new FrogPosition(-8.4375, -568.5625, 266.0, 180, 0, 180, 1),
                 new FrogPosition(39.75, -518.4375, -23.75, 180, 0, 180, 1),
                 new FrogPosition(71.75, -480.25, -231.75, 0, 0, 0, 1),
                 new FrogPosition(40.0, -342.0625, -552.0, 180, 0, 180, 1),
                 new FrogPosition(71.75, -362.375, -503.75, 180, 0, 180, 1),
                 new FrogPosition(231.4375, -319.5625, -663.75, 0, -89.9, 0, 1),
                 new FrogPosition(248.0, -272.5625, -312.0, 180, 0, 180, 1),
                 new FrogPosition(151.4375, -260.9375, -247.5625, 180, 0, 180, 1),
                 new FrogPosition(231.4375, -219.3125, -7.5625, 180, 0, 180, 1),
                 new FrogPosition(183.4375, -66.0, 456.375, 180, 0, 180, 1),
                 new FrogPosition(216.0, -30.0625, 552.0, 180, 0, 180, 1),
                 new FrogPosition(199.875, -18.5, 628.6875, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-23.9375, -31.1875, -376.0, 180, 0, 180, 0),
                 new FrogPosition(-104.125, -31.1875, -440.1875, 0, 0, 0, 1),
                 new FrogPosition(-103.9375, -31.1875, -376.0, 0, 89.9, 0, 1),
                 new FrogPosition(-183.9375, -31.1875, -280.0, 180, 0, 180, 2),
                 new FrogPosition(-200.0, -32.0, -232.0, 0, 89.9, 0, 2),
                 new FrogPosition(-184.0625, -31.9375, -90.4375, 0, 0, 0, 3),
                 new FrogPosition(-56.0, -32.0, -88.0, 0, 0, 0, 3),
                 new FrogPosition(-40.0, -32.0, -232.0, 0, -89.9, 0, 4),
                 new FrogPosition(216.0, 0.125, -455.3125, 0, -89.9, 0, 5),
                 new FrogPosition(151.8125, -31.5, -407.625, 0, 0, 0, 5),
                 new FrogPosition(104.0, -31.4375, -424.0, 180, 0, 180, 5),
                 new FrogPosition(120.0, -31.4375, -376.0, 0, -89.9, 0, 5),
                 new FrogPosition(56.0, -31.4375, -296.0, 0, -89.9, 0, 5),
                 new FrogPosition(200.0, -31.4375, -280.0, 0, 0, 0, 5),
                 new FrogPosition(200.0, -47.9375, -216.0, 0, 0, 0, 6),
                 new FrogPosition(120.0, -47.9375, -152.0, 180, 0, 180, 6),
                 new FrogPosition(135.875, -47.9375, -106.4375, 0, 0, 0, 6),
                 new FrogPosition(216.0, -32.0, -56.0, 0, -89.9, 0, 6),
                 new FrogPosition(40.0, -47.9375, -88.0, 0, -89.9, 0, 6),
                 new FrogPosition(-136.0, 0.0, -40.0, 180, 0, 180, 7),
                 new FrogPosition(-152.0625, 2.125, 69.5, 0, 0, 0, 8),
                 new FrogPosition(-40.0, 0.0, -8.0, 180, 0, 180, 8),
                 new FrogPosition(40.0, 0.0, 88.0, 180, 0, 180, 8),
                 new FrogPosition(104.0, 0.0, 8.0, 0, -89.9, 0, 8)
         )));
         FROG_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(8.1875, -72.125, -120.3125, 0, -89.9, 0, 0),
                 new FrogPosition(-183.6875, -74.5, -151.75, 0, 0, 0, 0),
                 new FrogPosition(-215.875, -45.0625, -39.75, 0, 89.9, 0, 1),
                 new FrogPosition(-215.625, -75.3125, 136.125, 0, 89.9, 0, 2),
                 new FrogPosition(-55.625, -71.0, 88.125, 0, 89.9, 0, 3),
                 new FrogPosition(-24.125, -45.125, -23.625, 0, 0, 0, 3),
                 new FrogPosition(114.4375, -76.625, 49.875, 0, -89.9, 0, 4),
                 new FrogPosition(119.8125, -81.0, -119.625, 0, 0, 0, 4),
                 new FrogPosition(200.0, -43.9375, 120.0, 180, 0, 180, 5)
         )));
         FROG_LOCATIONS.put("SKY2.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-184.0, -173.0, -329.6875, 0, 0, 0, 1),
                 new FrogPosition(56.125, -78.0, -263.9375, 0, 0, 0, 1),
                 new FrogPosition(247.9375, -195.6875, -105.6875, 0, 0, 0, 1),
                 new FrogPosition(136.0625, -80.1875, -119.0, 0, -89.9, 0, 1),
                 new FrogPosition(-88.0625, -73.375, -183.9375, 0, 89.9, 0, 1),
                 new FrogPosition(136.25, -75.0, 25.625, 0, -89.9, 0, 1),
                 new FrogPosition(-55.8125, -88.25, 23.9375, 0, -89.9, 0, 1),
                 new FrogPosition(-328.0, -100.9375, 54.25, 0, 0, 0, 1),
                 new FrogPosition(-87.9375, -102.875, 168.8125, 0, 89.9, 0, 1),
                 new FrogPosition(8.0, -89.5625, 137.5625, 180, 0, 180, 1),
                 new FrogPosition(104.375, -80.125, 169.6875, 0, -89.9, 0, 1),
                 new FrogPosition(216.3125, -34.8125, 294.4375, 0, 0, 0, 1),
                 new FrogPosition(185.25, -32.6875, 232.25, 180, 0, 180, 1)
         )));
         FROG_LOCATIONS.put("SKY3.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(377.6875, -80.125, -152.0, 0, -89.9, 0, 1),
                 new FrogPosition(377.6875, -68.3125, -312.0, 0, -89.9, 0, 1),
                 new FrogPosition(328.125, -72.625, -311.6875, 0, 0, 0, 1),
                 new FrogPosition(104.9375, -75.1875, -151.8125, 0, 89.9, 0, 1),
                 new FrogPosition(184.0625, -80.9375, -168.1875, 180, 0, 180, 1),
                 new FrogPosition(120.9375, -80.0, -231.8125, 0, 89.9, 0, 1),
                 new FrogPosition(183.6875, -81.375, -311.75, 0, 0, 0, 1),
                 new FrogPosition(104.9375, -88.6875, -311.8125, 0, 89.9, 0, 1)
         )));
         FROG_LOCATIONS.put("SKY4.MAP", new ArrayList<>(Arrays.asList(
                 new FrogPosition(-231.6875, -36.5, 7.125, 0, 89.9, 0, 1),
                 new FrogPosition(-215.625, -65.0, 136.125, 0, 89.9, 0, 1),
                 new FrogPosition(-55.625, -64.625, 88.125, 0, 89.9, 0, 1),
                 new FrogPosition(-24.125, -38.6875, -23.625, 0, 0, 0, 1),
                 new FrogPosition(104.125, -70.0, 7.875, 0, -89.9, 0, 1),
                 new FrogPosition(119.8125, -74.75, -119.625, 0, 0, 0, 1),
                 new FrogPosition(168.125, -36.0, 119.625, 180, 0, 180, 1)
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
                 new FrogPosition(40.0, -47.875, -88.0, 0, -89.9, 0, 1),
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
                 new StartPosition(17, 21, StartRotation.NORTH, 0),
                 new StartPosition(23, 26, StartRotation.EAST, 1),
                 new StartPosition(16, 42, StartRotation.EAST, 2),
                 new StartPosition(19, 38, StartRotation.NORTH, 2),
                 new StartPosition(37, 42, StartRotation.SOUTH, 2),
                 new StartPosition(50, 42, StartRotation.WEST, 3),
                 new StartPosition(51, 29, StartRotation.EAST, 5),
                 new StartPosition(47, 22, StartRotation.NORTH, 5)
         )));
         START_LOCATIONS.put("SUB2.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(26, 6, StartRotation.NORTH, 0),
                 new StartPosition(19, 26, StartRotation.WEST, 1),
                 new StartPosition(21, 34, StartRotation.SOUTH, 2),
                 new StartPosition(31, 29, StartRotation.WEST, 3)
         )));
         START_LOCATIONS.put("SUB3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(21, 6, StartRotation.NORTH, 0),
                 new StartPosition(5, 11, StartRotation.EAST, 1),
                 new StartPosition(17, 17, StartRotation.EAST, 2),
                 new StartPosition(14, 24, StartRotation.SOUTH, 2),
                 new StartPosition(16, 38, StartRotation.SOUTH, 3),
                 new StartPosition(25, 31, StartRotation.EAST, 4),
                 new StartPosition(39, 24, StartRotation.NORTH, 4),
                 new StartPosition(29, 10, StartRotation.SOUTH, 5),
                 new StartPosition(35, 11, StartRotation.WEST, 5)
         )));
         START_LOCATIONS.put("SUB4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 24, StartRotation.NORTH, 0),
                 new StartPosition(23, 29, StartRotation.EAST, 0),
                 new StartPosition(19, 41, StartRotation.NORTH, 2),
                 new StartPosition(32, 39, StartRotation.EAST, 3),
                 new StartPosition(37, 45, StartRotation.SOUTH, 3),
                 new StartPosition(56, 41, StartRotation.NORTH, 4),
                 new StartPosition(47, 32, StartRotation.WEST, 5)
         )));
         START_LOCATIONS.put("SUB5.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(33, 7, StartRotation.NORTH, 0),
                 new StartPosition(20, 12, StartRotation.EAST, 0),
                 new StartPosition(20, 27, StartRotation.EAST, 1),
                 new StartPosition(36, 22, StartRotation.SOUTH, 2),
                 new StartPosition(38, 30, StartRotation.WEST, 3)
         )));
         START_LOCATIONS.put("FOR1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(9, 3, StartRotation.NORTH, 0,
                         new ArrayList<>(Arrays.asList(5))),
                 new StartPosition(3, 9, StartRotation.EAST, 1,
                         new ArrayList<>(Arrays.asList(0, 5))),
                 new StartPosition(3, 19, StartRotation.EAST, 2,
                         new ArrayList<>(Arrays.asList(3))),
                 new StartPosition(15, 20, StartRotation.SOUTH, 3,
                         new ArrayList<>(Arrays.asList(2))),
                 new StartPosition(24, 15, StartRotation.WEST, 3,
                         new ArrayList<>(Arrays.asList(4, 5))),
                 new StartPosition(24, 5, StartRotation.WEST, 5,
                         new ArrayList<>(Arrays.asList(0, 4))),
                 new StartPosition(19, 3, StartRotation.NORTH, 5,
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
                         new ArrayList<>(Arrays.asList(1, 7))),
                 new StartPosition(3, 7, StartRotation.EAST, 2,
                         new ArrayList<>(Arrays.asList(0, 1, 3))),
                 new StartPosition(5, 22, StartRotation.SOUTH, 4,
                         new ArrayList<>(Arrays.asList(3, 5))),
                 new StartPosition(15, 22, StartRotation.SOUTH, 4,
                         new ArrayList<>(Arrays.asList(3, 5))),
                 new StartPosition(19, 7, StartRotation.WEST, 6,
                         new ArrayList<>(Arrays.asList(0, 5, 7)))
         )));
         START_LOCATIONS.put("CAV3.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(13, 12, StartRotation.NORTH, 0)
         )));
         START_LOCATIONS.put("CAV4.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(17, 5, StartRotation.NORTH, 0),
                 new StartPosition(4, 16, StartRotation.EAST, 2),
                 new StartPosition(17, 17, StartRotation.NORTH, 4),
                 new StartPosition(6, 29, StartRotation.EAST, 7),
                 new StartPosition(23, 29, StartRotation.WEST, 7),
                 new StartPosition(16, 37, StartRotation.SOUTH, 8)
         )));
         START_LOCATIONS.put("SKY1.MAP", new ArrayList<>(Arrays.asList(
                 new StartPosition(20, 15, StartRotation.NORTH, 0,
                         new ArrayList<>(Arrays.asList(1))),
                 new StartPosition(10, 30, StartRotation.EAST, 2,
                         new ArrayList<>(Arrays.asList(1))),
                 new StartPosition(30, 13, StartRotation.NORTH, 4),
                 new StartPosition(32, 31, StartRotation.SOUTH, 5)
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
                 new StartPosition(13, 16, StartRotation.NORTH, 1),
                 new StartPosition(17, 16, StartRotation.NORTH, 3)
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


     }


}
