package Restaurant;

/**
 * Created by Jakub on 11.01.2017.
 */
public class NoViewFound extends Exception {
    public NoViewFound() {
        super();
    }

    public NoViewFound(String message) {
        super(message);
    }

    public NoViewFound(String message, Throwable cause) {
        super(message, cause);
    }
}
