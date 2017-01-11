package Restaurant;

import Generator.Generator;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class RestaurantController {

    private HashMap<availableViews, ViewsManager> viewsMap = new HashMap<availableViews, ViewsManager>() {{
        put(availableViews.Restaurant, new ViewsManager("Restauracja", "../Restaurant/RestaurantView.fxml"));
        put(availableViews.ClientsManager, new ViewsManager("Zarządzaj klientami", "../ControlManager/ClientManagerView.fxml"));
        put(availableViews.DeliveryManManager, new ViewsManager("Zarządzaj dostawcami", "../ControlManager/DeliveryMenManagerView.fxml"));
        put(availableViews.OrdersManager, new ViewsManager("Zarządzaj posiłkami", "../ControlManager/OrderManager.fxml"));
    }};
    ;

    public void switchToOrderManager(ActionEvent event) {

    }

    private void openWindow(availableViews newView) {
        if (newView == availableViews.None) return;

        Stage minorStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../ControlManager/ClientManagerView.fxml"));
        } catch (IOException exception) {
            System.out.println("Nie znaleziono pliku fxml klienta");
        }
        minorStage.setTitle("Dodaj klienta");
        minorStage.setScene(new Scene(root, 500, 500));
        minorStage.show();
    }

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
            root = FXMLLoader.load(getClass().getResource("../ControlManager/ClientManagerView.fxml"));
        } catch (IOException exception) {
            System.out.println("Nie znaleziono pliku fxml klienta");
        }
        minorStage.setTitle("Dodaj klienta");
        minorStage.setScene(new Scene(root, 500, 500));
        minorStage.show();

    }

    public enum availableViews {
        Restaurant,
        OrdersManager,
        ClientsManager,
        DeliveryManManager,
        None
    }
}
