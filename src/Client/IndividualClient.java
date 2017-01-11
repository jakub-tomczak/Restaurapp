package Client;

/**
 * Created by Jakub on 04.12.2016.
 */
public abstract class IndividualClient extends Client {
    protected String firstName;
    protected String lastName;
    protected String emailAddress;
    protected String phoneNumber;

    public IndividualClient() {
        this.emailAddress = null;
        this.phoneNumber = null;
    }

    public IndividualClient(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
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
}
