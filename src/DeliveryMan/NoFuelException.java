package DeliveryMan;

/**
 * Created by Jakub on 10.01.2017.
 */
public class NoFuelException extends Exception {
    public NoFuelException() {
        super();
    }

    public NoFuelException(String message) {
        super(message);
    }

    public NoFuelException(String message, Throwable cause) {
        super(message, cause);
    }
}
