package Restaurant;

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
