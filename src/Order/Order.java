package Order;

import Client.Client;
import DeliveryMan.DeliveryMan;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Jakub on 05.12.2016.
 */
public class Order {
    private final float discountCoefficient = 0.12f;
    private Calendar orderPlacementTimestamp;
    private Calendar orderPreparedTimestamp;
    private boolean isPrepared;
    private boolean isPaid;
    private List<Meal> listOfMeals;
    private float price;
    private float discount;
    private Client clientOrdering;
    private DeliveryMan deliveryManDelivering;
    private OrderStatus statusOfOrder;

    public Order() {
        isPaid = false;
        isPrepared = false;
        price = 0.0f;
        discount = 0.0f;
    }

    private float calculateOrderPrice() {
        float totalOrderPrice = 0.0f;
        for (Meal meal : listOfMeals) {
            totalOrderPrice += meal.getMealPrice();
        }
        return totalOrderPrice;
    }

    private float calculateOrderPriceWithDiscount() {
        return calculateOrderPrice() * (1 - discountCoefficient);
    }


    public void PayForOrder() {

        isPaid = true;
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
