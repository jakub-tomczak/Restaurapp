package Restaurant;

import Map.Map;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        Parent root = FXMLLoader.load(getClass().getResource("RestaurantView.fxml"));
        primaryStage.setTitle("Restaurapp");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.show();

    }

}
