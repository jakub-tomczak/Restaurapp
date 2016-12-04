package Client;

/**
 * Created by Jakub on 04.12.2016.
 */
public class Address {

    private String country;
    private String province;
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;
    private String apartment;

    public Address() {
        country = "Polska";
        province = "Wielkopolska";
        city = "Poznań";
    }

    public Address(String postalCode, String street, String houseNumber) {
        this();
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(String postalCode, String street, String houseNumber, String apartment) {
        this(postalCode, street, houseNumber);
        this.apartment = apartment;
    }


}
