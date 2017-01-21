package Generator;

import Client.*;
import DeliveryMan.DeliveryMan;
import Order.Meal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Jakub on 07.01.2017.
 */
public class Generator {
    private static Generator instance = null;
    private List<String> lastNames = Arrays.asList(
            "Nowak",
            "Kowalski",
            "Wiśniewski",
            "Dąbrowski",
            "Lewandowski",
            "Wójcik",
            "Kamiński",
            "Kowalczyk",
            "Zieliński",
            "Szymański",
            "Woźniak",
            "Kozłowski",
            "Jankowski",
            "Wojciechowski",
            "Kwiatkowski",
            "Kaczmarek",
            "Mazur",
            "Krawczyk",
            "Piotrowski",
            "Grabowski",
            "Nowakowski",
            "Pawłowski",
            "Michalski",
            "Nowicki",
            "Adamczyk",
            "Dudek",
            "Zając",
            "Wieczorek",
            "Jabłoński",
            "Król",
            "Majewski",
            "Olszewski",
            "Jaworski",
            "Wróbel",
            "Malinowski",
            "Pawlak",
            "Witkowski",
            "Walczak",
            "Stępień",
            "Górski",
            "Rutkowski",
            "Michalak",
            "Sikora",
            "Ostrowski",
            "Baran",
            "Duda"
    );
    private List<String> firstNames = Arrays.asList(
            "Nowak",
            "Kowalski",
            "Wiśniewski",
            "Dąbrowski",
            "Lewandowski",
            "Wójcik",
            "Kamiński",
            "Kowalczyk",
            "Zieliński",
            "Szymański",
            "Woźniak",
            "Kozłowski",
            "Jankowski",
            "Wojciechowski",
            "Kwiatkowski",
            "Kaczmarek",
            "Mazur",
            "Krawczyk",
            "Piotrowski",
            "Grabowski",
            "Nowakowski",
            "Pawłowski",
            "Michalski",
            "Nowicki",
            "Adamczyk",
            "Dudek",
            "Zając",
            "Wieczorek",
            "Jabłoński",
            "Król",
            "Majewski",
            "Olszewski",
            "Jaworski",
            "Wróbel",
            "Malinowski",
            "Pawlak",
            "Witkowski",
            "Walczak",
            "Stępień",
            "Górski",
            "Rutkowski",
            "Michalak",
            "Sikora",
            "Ostrowski",
            "Baran",
            "Duda",
            "Luca",
            "Marcus",
            "Marko",
            "Maxym",
            "Medard",
            "Mohamed",
            "Oktawiusz",
            "Paskal",
            "Robin",
            "Sajmon",
            "Valentino",
            "DB",
            "Debora",
            "Elif",
            "Emilie",
            "Erika",
            "Iwa",
            "Kira",
            "Latika",
            "Latoya",
            "Leokadia",
            "Leonia",
            "Ligia",
            "Lorena",
            "Luna",
            "Marieta"
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
        if (instance == null) {
            instance = new Generator();
        }
        return instance;
    }

    private String generateFirstName() {
        return (String) firstNames.get((int) (Math.random() * 10 * firstNames.size() % firstNames.size()));
    }

    private String generateLastName() {
        return (String) lastNames.get((int) (Math.random() * 10 * lastNames.size() % lastNames.size()));
    }


    private String generateEmail(String firstName, String lastName) {
        return firstName + "." + lastName + "@pudelek.pl";
    }

    public String generateName() {
        return generateFirstName();
    }

    private String generateNumber(int digits) {
        String accountNumber = "";
        accountNumber += (int) (Math.random() * 8) + 1;
        for (int i = 0; i < digits - 1; i++) {
            accountNumber += (int) (Math.random() * 9);
        }
        return accountNumber;
    }


    //individual Client
    public IndividualClient generateClient() {
        IndividualClient newClient;

        if ((int) (Math.random()) == 0) {
            newClient = new RegularClient();
        } else {
            newClient = new PotentialClient();
        }

        newClient.setFirstNameString(generateFirstName());
        newClient.setLastNameString(generateLastName());
        String email = generateEmail(newClient.getFirstNameString(), newClient.getLastNameString());
        newClient.setEmailAddress(email);
        newClient.setPhoneNumber(generateNumber(9));

        return newClient;
    }

    //corporate Client
    public CorporateClient generateCorporateClient() {
        CorporateClient newCorporateClient = new CorporateClient();
        newCorporateClient.setBankAccountNumber(generateNumber(28));
        newCorporateClient.setREGON(generateNumber(9));

        return newCorporateClient;
    }

    public DeliveryMan generateDeliveryMan() {
        DeliveryMan newDeliveryMan = new DeliveryMan();
        newDeliveryMan.setFirstName(generateFirstName());
        newDeliveryMan.setLastName(generateLastName());
        return newDeliveryMan;
    }


    private void addFirstName(String name) {
        firstNames.add(name);
    }

    private void addLastName(String name) {
        lastNames.add(name);
    }

    enum TypeOfData {
        Client,
        DeliveryMan,
        Address
    }


    enum ClientType {
        RegularClient,
        IndividualClient,
        CorporateClient,
        None
    }
}

