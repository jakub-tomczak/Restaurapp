package Generator;

import Client.Address;
import Order.Meal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Jakub on 07.01.2017.
 */
public class Generator {
    private static Generator Instance = null;
    private List<String> names = Arrays.asList(
            "Adam",
            "Jan",
            "Andrzej",
            "Krzysztof"
    );
    private List<Address> addresses = Arrays.asList(
            new Address(
                    "62-030",
                    "Głogowska",
                    "12a"
            ),
            new Address(
                    "60-480",
                    "Ogórkowa",
                    "33b"
            )
    );
    private HashMap<Meal.MealCategory, String> meals = new HashMap<Meal.MealCategory, String>();

    private Generator() {
    }

    public static Generator getInstance() {
        if (Instance == null) {
            Instance = new Generator();
        }
        return Instance;
    }

    public String generateName() {
        return (String) names.toArray()[(int) (Math.random() * 10 * names.size() % names.size())];
    }

    public void addName(String name) {
        names.add(name);
    }

    private enum TypeOfData {
        Client,
        DeliveryMan,
        Address
    }
}

