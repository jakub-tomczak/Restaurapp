package Order;

/**
 * Created by Jakub on 04.12.2016.
 */
public class Meal {
    private String mealName;
    private String mealDescription;
    private float pricePerUnit;
    private float unit;
    private MealCategory category;
    private MealUnit unitType;
    private float discountInGroup;
    private float timeOfCooking; //in seconds

    public float getMealPrice() {
        return pricePerUnit * unit;
    }

    public enum MealCategory {
        Soup,
        Beverage,
        MainMeal,
        Dessert,
        None
    }

    private enum MealUnit {
        Litres,
        Kilograms,
        Portion,
        None
    }
}
