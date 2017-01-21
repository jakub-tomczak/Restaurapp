package Restaurant;

import Client.CorporateClient;
import Client.IndividualClient;
import Client.PotentialClient;
import Generator.Generator;
import Map.Map;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Restaurant extends Application {

    public static Map map = Map.getInstance();

    public static void main(String[] args) {
        launch(args);
    }

    //// TODO: 05.12.2016
    ////
    //// - finish restaurant
    //// - finish orders
    //// - rethink map
    //// - rethink manager
    //// - finish managers
    @Override
    public void start(Stage primaryStage) throws Exception {
        RestaurantController controller = new RestaurantController();
        PotentialClient newCl = new PotentialClient("Andrzej", "Kowalski");
        IndividualClient newClient = new PotentialClient();
        newClient = Generator.getInstance().generateClient();
        if (newClient instanceof PotentialClient) {
            System.out.println("potential client");
        } else {
            System.out.println("regular client");
        }
        CorporateClient newCorporateCLient = Generator.getInstance().generateCorporateClient();


        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("RestaurantView.fxml"));
        } catch (IOException exception) {
            System.out.println("Nie znaleziono pliku fxml restautacji");
        }
        primaryStage.setTitle("Restaurapp");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setMaximized(false);
        //  primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Wciśnij ESC, aby wyjść z trybu pełnoekranowego.");
        primaryStage.show();


    }
}
