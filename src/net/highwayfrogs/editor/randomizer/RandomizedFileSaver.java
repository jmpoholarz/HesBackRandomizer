package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.games.sony.frogger.FroggerGameInstance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Utility class to save output of the randomizer to files on the user's machine.
 */
public class RandomizedFileSaver {

    /**
     * Save the current status of any randomization back to the original files by hooking into the FrogLord
     * menu's Save functionality.  Additionally, save the seed used to a text file.
     * @param gameInstance The instance of Frogger He's Back that has been randomized.
     * @param exitAppAfterSave Whether to quit FrogLord once the save is completed or leave the window open to analyze
     *                         the results of the randomization.
     */
    public void saveEndResult(FroggerGameInstance gameInstance, boolean exitAppAfterSave) {
        if (!RandomizerFeatureFlags.ENABLE_SAVING) {
            return;
        }

        /*
         * This only works after the Main Menu has been created.  It might be nice to do this without having to wait
         * for the UI to load completely.
         */
        gameInstance.getMainMenuController().saveMainGameData();

        writeSeedToFile(gameInstance.getMainGameFolder());

        if (exitAppAfterSave) {
            System.exit(0);
        }
    }

    /**
     * Write the seed value to a file.  If the user did not pick a seed, this gives them a way to know what value
     * was chosen.  The seed is also helpful for reporting bugs since it gives a way to reproduce what they
     * ended up with.
     * @param outputFolder The folder to save the seed file to.
     */
    private void writeSeedToFile(File outputFolder) {
        if (RandomizerConfig.version == RandomizerConfig.VERSION.PSX) {
            outputFolder = outputFolder.getParentFile();
        }

        try {
            FileWriter writer = new FileWriter(new File(outputFolder, "seed.txt"));
            writer.write("Seed: " + RandomizerConfig.seed);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to write seed to file. Error: ");
            e.printStackTrace();
        }
    }
}
