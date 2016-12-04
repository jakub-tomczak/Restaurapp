package Order;

import Client.Client;
import DeliveryMan.DeliveryMan;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Jakub on 05.12.2016.
 */
public class Order {
    private Calendar orderPlacementTimestamp;
    private Calendar orderPreparedTimestamp;
    private boolean isPrepared;

    private List<Meal> listOfMeals;
    private float price;
    private float discount;
    private Client clientOrdering;
    private DeliveryMan deliveryManDelivering;
    private OrderStatus statusOfOrder;

    public float CalculateDiscount() {
        return 0f;
    }

    public void PayForOrder() {

    }

    public void ChooseSupplier() {

    }

    public enum OrderStatus {
        Ordered,
        Preparing,
        Prepared,
        Delivering,
        Delivered,
        Paid,
        None
    }

}
