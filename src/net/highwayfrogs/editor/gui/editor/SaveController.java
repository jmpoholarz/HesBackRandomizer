package net.highwayfrogs.editor.gui.editor;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.highwayfrogs.editor.Constants;
import net.highwayfrogs.editor.file.MWDFile;
import net.highwayfrogs.editor.file.config.FroggerEXEInfo;
import net.highwayfrogs.editor.file.writer.DataWriter;
import net.highwayfrogs.editor.file.writer.FileReceiver;
import net.highwayfrogs.editor.system.AbstractService;
import net.highwayfrogs.editor.utils.Utils;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Manages the screen which pops up while saving a MWD.
 * Created by Kneesnap on 9/25/2018.
 */
@Getter
public class SaveController implements Initializable {
    @FXML private Label progressLabel;
    @FXML private Label statusLabel;
    @FXML private ProgressBar progressBar;
    private Stage stage;

    public SaveController(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stage.setOnCloseRequest(Event::consume); // Prevent shutting the window.
    }

    /**
     * Start saving the MWD File.
     * @param mwdToSave  The loaded MWD file to save.
     * @param froggerEXE The executable to save data to.
     * @param folder     The folder to output the mwds.
     */
    public void startSaving(MWDFile mwdToSave, FroggerEXEInfo froggerEXE, File folder) {
        AbstractService.runAbstractTask(() -> new SaveTask(
                mwdToSave, froggerEXE,
                new File(folder, "FROGPSX.MWD"),
                new File(folder, "frogger.exe"),
                this));
    }

    /**
     * Start saving a MWD.
     * @param froggerEXE The executable config.
     * @param loadedMWD  The MWD to save.
     */
    public static void saveFiles(FroggerEXEInfo froggerEXE, MWDFile loadedMWD) {
        Utils.loadFXMLTemplate("save", "Saving MWD", SaveController::new,
                (stage, controller) -> controller.startSaving(loadedMWD, froggerEXE, froggerEXE.getFolder()));
    }

    @AllArgsConstructor
    private static final class SaveTask extends Task<Void> {
        private MWDFile mwdToSave;
        private FroggerEXEInfo inputConfig;
        private File outputMWD;
        private File outputEXE;
        private SaveController saveController;

        @Override
        protected Void call() {
            AtomicInteger currentFile = new AtomicInteger(0);
            AtomicBoolean alreadyScheduledUpdate = new AtomicBoolean();

            if (!outputMWD.getParentFile().canWrite()) {
                Platform.runLater(() -> {
                    saveController.getStage().close();
                    Utils.makePopUp("Can't write to the file." + Constants.NEWLINE + "Do you have permission to save in this folder?", AlertType.ERROR);
                });
                return null;
            }

            DataWriter mwdWriter = new DataWriter(new FileReceiver(outputMWD));

            mwdToSave.setSaveCallback((entry, file) -> {
                currentFile.incrementAndGet();
                if (alreadyScheduledUpdate.getAndSet(true))
                    return; // Return after incrementing currentFile. This check prevents us from

                Platform.runLater(() -> {
                    int saveCount = currentFile.get();
                    int fileCount = mwdToSave.getFiles().size();

                    double progress = (double) saveCount / (double) fileCount;
                    saveController.getProgressBar().setProgress(progress);
                    saveController.getProgressLabel().setText((int) (progress * 100) + "%");
                    saveController.getStatusLabel().setText("Saving " + entry.getDisplayName() + " (" + saveCount + "/" + fileCount + ")");
                    alreadyScheduledUpdate.set(false);
                });
            });

            try {
                mwdToSave.save(mwdWriter);
                mwdWriter.closeReceiver();
                mwdToSave.setSaveCallback(null);
            } catch (Exception ex) {
                Platform.runLater(() -> {
                    saveController.getStage().close();
                    throw new RuntimeException("Failed to save MWD!", ex);
                });
            }

            try {
                inputConfig.patchEXE();
                inputConfig.saveExecutable(outputEXE);
                Platform.runLater(saveController.getStage()::close);
            } catch (Exception ex) {
                Platform.runLater(() -> {
                    saveController.getStage().close();
                    throw new RuntimeException("Failed to patch EXE.", ex);
                });
            }
            return null;
        }
    }
}
