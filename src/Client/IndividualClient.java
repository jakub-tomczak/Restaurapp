package Client;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Jakub on 04.12.2016.
 */
public abstract class IndividualClient extends Client {
    protected String firstName;
    protected String lastName;
    protected String emailAddress;
    protected String phoneNumber;

    private SimpleStringProperty firstNameString;
    private SimpleStringProperty lastNameString;


    public IndividualClient() {
        this.emailAddress = null;
        this.phoneNumber = null;

    }

    public IndividualClient(String firstName, String lastName) {
        this();
        //  this.firstName = firstName;
        //  this.lastName = lastName;
        this.firstNameString = new SimpleStringProperty(firstName);
        this.lastNameString = new SimpleStringProperty(lastName);
    }

    public IndividualClient(String firstName, String lastName, String emailAddress, String phoneNumber) {
        this(firstName, lastName);
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public static boolean VerifyEmailAddress(String emailNumberToVerify) {
        return false;
    }

    public static boolean VerifyPhoneNumber(String phoneNumberToVerify) {
        return false;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstNameString() {
        return firstNameString.get();
    }

    public void setFirstNameString(String firstNameString) {
        this.firstNameString.set(firstNameString);
    }

    public SimpleStringProperty firstNameStringProperty() {
        return firstNameString;
    }

    public String getLastNameString() {
        return lastNameString.get();
    }

    public void setLastNameString(String lastNameString) {
        this.lastNameString.set(lastNameString);
    }

    public SimpleStringProperty lastNameStringProperty() {
        return lastNameString;
    }
}
