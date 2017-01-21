package ControlManager.Controllers;

import Restaurant.MessagesHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Jakub on 19.01.2017.
 */
public class IndividualClientController {

    public IndividualClientController() {
    }

    public void Initialize() {

    }

    public Stage openView() {
        Stage newStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../Controllers/IndividualClientController.fxml"));
        } catch (IOException exception) {
            MessagesHandler.showError("Nie udało się otworzyć widoku!");
            return null;
        }
        newStage.setTitle("Dodaj nowego klienta");
        newStage.setScene(new Scene(root, 500, 500));
        newStage.show();
        return newStage;
    }

}
