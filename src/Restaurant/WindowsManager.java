package Restaurant;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Jakub on 19.01.2017.
 */
public class WindowsManager {
    private static WindowsManager instance = null;
    private HashMap<RestaurantController.availableViews, ViewsDescription> viewsMap = new HashMap<RestaurantController.availableViews, ViewsDescription>(10) {{
        put(RestaurantController.availableViews.Restaurant, new ViewsDescription("Restauracja", "../Restaurant/RestaurantView.fxml"));
        put(RestaurantController.availableViews.ClientsManager, new ViewsDescription("Zarządzaj klientami", "../ControlManager/Views/ClientManagerView.fxml"));
        put(RestaurantController.availableViews.DeliveryManManager, new ViewsDescription("Zarządzaj dostawcami", "../ControlManager/Views/DeliveryMenManagerView.fxml"));
        put(RestaurantController.availableViews.OrdersManager, new ViewsDescription("Zarządzaj posiłkami", "../ControlManager/Views/OrderManager.fxml"));
        put(RestaurantController.availableViews.OrdersManager, new ViewsDescription("Dodaj klienta indywidualnego", "../ControlManager/Views/IndividualClientController.fxml"));
        put(RestaurantController.availableViews.OrdersManager, new ViewsDescription("Dodaj klienta korporacyjnego", "../ControlManager/Views/OrderManager.fxml"));

    }};

    private WindowsManager() {
    }

    public static WindowsManager getInstance() {
        if (instance == null) {
            instance = new WindowsManager();
        }
        return instance;
    }

    public void openWindownVerbose(RestaurantController.availableViews newView) {
        Stage minorStage = new Stage();
        Parent root = null;
        ViewsDescription newViewProperties = viewsMap.get(newView);
        try {
            //root = FXMLLoader.load(getClass().getResource(newViewProperties.getViewPath()));
            root = FXMLLoader.load(getClass().getResource("../ControlManager/Views/ClientManagerView.fxml"));
        } catch (IOException exception) {
            System.out.println("Problem z odnalezieniem widoku");
        }
        minorStage.setTitle(newViewProperties.getWindowTitle());
        minorStage.setScene(new Scene(root, 500, 500));
        minorStage.show();
    }

    /**
     * Method that opens in a new winwdow scene indicated by newView argument of the enum type.
     * To add new view to open:
     * - add new enum type to RestaurantController.availableViews
     * - add another one field in a hashMap viewsMap in this class.
     *
     * @param newView enum name of a view that is going to be opened.
     * @return nothing
     * @see Stage
     */
    private void openWindow(RestaurantController.availableViews newView) {
        Stage minorStage = new Stage();
        Parent root = null;


        try {
            if (newView == RestaurantController.availableViews.None)
                throw new NoViewFound("Podano nieistniejący widok");

            ViewsDescription newViewProperties = viewsMap.get(newView);

            if (newViewProperties == null) {
                return;
            }

            Stage newViewStage = newViewProperties.getReferenceToWindow();
            if (newViewStage != null) {
                newViewStage.toFront();

                return;
            }


            try {
                root = FXMLLoader.load(getClass().getResource(newViewProperties.getViewPath()));
            } catch (IOException exception) {
                throw new NoViewFound("Nie znaleziono pliku z widokiem");
            }
            minorStage.setTitle(newViewProperties.getWindowTitle());
            minorStage.setScene(new Scene(root, 500, 500));
            minorStage.show();

            //setting new created window as a reference to one of the view
            newViewProperties.setReferenceToWindow(minorStage);

            //when closing window set its reference to null
            minorStage.setOnCloseRequest(
                    event ->
                    {
                        viewsMap.get(newView).setReferenceToWindow(null);
                    }
            );

        } catch (NoViewFound exception) {
            MessagesHandler.showError(exception.getMessage());
            //System.out.println(exception.getMessage());
        }

    }

    ;

    public enum availableViews {
        Restaurant,
        OrdersManager,
        ClientsManager,
        DeliveryManManager,
        IndividualClientController,
        CorporateClientController,
        None
    }

}
