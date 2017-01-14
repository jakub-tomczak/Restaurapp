package IOManager;

/**
 * Created by Jakub on 14.01.2017.
 */
public class SerializationManager {

    //singleton things
    private static SerializationManager instance = null;

    private SerializationManager() {
    }

    public static SerializationManager getInstance() {
        if (instance == null) {
            instance = new SerializationManager();
        }

        return instance;
    }

    /*
    things to save:
        - client list
        - delivery men list
        - map properties (layout)
        - order list
        - orders possible
     */
}
