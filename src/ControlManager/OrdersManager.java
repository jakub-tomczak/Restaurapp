package ControlManager;

import Order.Order;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 04.12.2016.
 */
public class OrdersManager extends Manager {
    private static OrdersManager ordersManagerInstance = null;
    List<Order> currentOrders = new ArrayList<Order>();
    @FXML
    TabPane tabPane;

    private OrdersManager() {
        tabPane.getSelectionModel().select(2);
    }

    public static OrdersManager getOrdersManager() {
        if (ordersManagerInstance == null)
            ordersManagerInstance = new OrdersManager();
        return ordersManagerInstance;
    }

}
