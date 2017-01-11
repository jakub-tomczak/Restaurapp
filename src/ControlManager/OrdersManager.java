package ControlManager;

import Order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 04.12.2016.
 */
public class OrdersManager extends Manager {
    private static OrdersManager ordersManagerInstance = null;
    List<Order> currentOrders = new ArrayList<Order>();

    private OrdersManager() {
    }

    public static OrdersManager getOrdersManager() {
        if (ordersManagerInstance == null)
            ordersManagerInstance = new OrdersManager();
        return ordersManagerInstance;
    }

}
