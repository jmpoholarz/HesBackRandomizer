package net.highwayfrogs.editor.randomizer;

import java.util.Random;

/**
 * Global variable cache of relevant randomizer settings to avoid having to pass values all around FrogLord to get
 * things to behave nicely.
 */
public class RandomizerConfig {

    /**
     * The different versions of Frogger: He's Back supported by the randomizer.
     */
    public enum VERSION {
        PC,
        PSX
    }

    /**
     * Enum for how the timers should be set in the levels.  VANILLA will always use the default timer set in the
     * base game.  DYNAMIC will use adjust the time based on the start location in a level.  Typically, starts in
     * the middle of levels will be given less time, and starts on the edges of levels will be given more time.
     */
    public enum TIMER_MODE {
        VANILLA,
        DYNAMIC
    }

    /**
     * Singleton random number generator seeded with the seed value
     */
    private static Random random;

    /**
     * The seed value used to set up the random number generator.
     */
    public static long seed = -1;

    /**
     * Which version of Frogger: He's Back is being randomized.
     */
    public static VERSION version = VERSION.PC;

    /**
     * How timers should be set in the levels.
     */
    public static TIMER_MODE timerMode = TIMER_MODE.VANILLA;

    /**
     * A multiplier to be applied to the timers to make the game generally easier or harder.  The PC version has a
     * built-in 1.5x timer multiplier applied on top of this value.
     */
    public static double timerMultiplier = 1.0;

    /**
     * Whether the timer values can exceed a console's max time, 90s on PSX and 99s on PC.  Values above these limits
     * will overflow the bar graphically, and may look wonky.
     */
    public static boolean timerCanExceedMax = false;

    /**
     * Reads in and parses arguments from the CLI invocation of FrogLord and assigns them to their respective
     * config variables for use throughout the randomizer.
     * @param args Command line arguments passed to FrogLord.
     */
    public static void readArguments(String[] args) {
        for (String s : args) {
            // General Settings
            if (s.startsWith("--seed=") && s.length() > 7) {
                seed = Long.parseLong(s.substring(7));
            }
            if (s.startsWith("--version=") && s.length() > 10) {
                version = s.substring(10).equalsIgnoreCase("psx")
                        ? VERSION.PSX
                        : VERSION.PC;
            }

            // Timer Settings
            else if (s.startsWith("--timer_mode=") && s.length() > 13) {
                timerMode = s.substring(13).equalsIgnoreCase("dynamic")
                        ? TIMER_MODE.DYNAMIC
                        : TIMER_MODE.VANILLA;
            }
            else if (s.startsWith("--timer_multiplier=") && s.length() > 19) {
                timerMultiplier = Double.parseDouble(s.substring(19));
            }
            else if (s.startsWith("--timer_exceed_max=") && s.length() > 19) {
                timerCanExceedMax = s.substring(19).equalsIgnoreCase("true");
            }

        }
    }

    /**
     * Set up the random number generator for the randomizer using the provided seed, or pick a random seed and then
     * seed the randomizer with that value.
     * @return The Random object configured with the seed value.
     */
    public static Random loadRandomNumberGenerator() {
        Random random;
        if (seed != -1) {
            random = new Random(seed);
        }
        else {
            random = new Random();
            seed = random.nextInt(Integer.MAX_VALUE);
            random.setSeed(seed);
        }
        return random;
    }

    /**
     * Set up the random number generator if not yet configured, or fetch the existing one.
     * @return The seeded Random object to generate any random numbers.
     */
    public static Random getRandom() {
        if (random == null) {
            random = loadRandomNumberGenerator();
        }
        return random;
    }
}
