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

    private HashMap<availableViews, ViewsDescription> viewsMap = new HashMap<availableViews, ViewsDescription>(10) {{
        put(availableViews.Restaurant, new ViewsDescription("Restauracja", "../Restaurant/RestaurantView.fxml"));
        put(availableViews.ClientsManager, new ViewsDescription("Zarządzaj klientami", "../ControlManager/Views/ClientManagerView.fxml"));
        put(availableViews.DeliveryManManager, new ViewsDescription("Zarządzaj dostawcami", "../ControlManager/Views/DeliveryMenManagerView.fxml"));
        put(availableViews.OrdersManager, new ViewsDescription("Zarządzaj posiłkami", "../ControlManager/Views/OrderManager.fxml"));
    }};

    public void closeApplication(ActionEvent actionEvent) {
        System.out.println("koniec aplikacji");
    }

    public void generuj(ActionEvent event) {
        Generator generator = Generator.getInstance();
        System.out.println(generator.generateName());
    }

    public void openClientManager(ActionEvent event) {
        openWindow(availableViews.ClientsManager);
    }

    public void openOrdersManager(ActionEvent event) {
        //openWindow(availableViews.OrdersManager);
        openWindownVerbose(availableViews.ClientsManager);
    }

    public void openWindownVerbose(availableViews newView) {
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
    private void openWindow(availableViews newView) {
        Stage minorStage = new Stage();
        Parent root = null;


        try {
            if (newView == availableViews.None)
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
        None
    }

}
