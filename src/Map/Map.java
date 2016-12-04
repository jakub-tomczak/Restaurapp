package Map;

import java.util.HashSet;

/**
 * Created by Jakub on 04.12.2016.
 */
public class Map implements Runnable {
    private static Map ourInstance = new Map();
    private HashSet<Localizable> objectsOnMap;

    private Map() {
    }

    public static Map getInstance() {
        return ourInstance;
    }

    public void UpdatePoints() {

    }

    public void Redraw() {

    }

    public void OpenMap() {

    }

    public void CloseMap() {

    }


    @Override
    public void run() {

    }
}
