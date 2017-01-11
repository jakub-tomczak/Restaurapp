package Restaurant;

import Generator.Generator;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RestaurantController {

    public void closeApplication(ActionEvent actionEvent) {
        System.out.println("koniec aplikacji");
    }

    public void generuj(ActionEvent event) {
        Generator generator = Generator.getInstance();
        System.out.println(generator.generateName());
        // Generator.Instance.generate();
    }

    public void openClientManager(ActionEvent event) {
        Stage minorStage = new Stage();


        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../ControlManager/ClientManager.fxml"));
        } catch (IOException exception) {
            System.out.println("Nie znaleziono pliku fxml klienta");
        }
        minorStage.setTitle("Dodaj klienta");
        minorStage.setScene(new Scene(root, 500, 500));
        minorStage.show();

    }
}
