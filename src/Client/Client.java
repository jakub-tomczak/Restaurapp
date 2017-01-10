package Client;

import Map.Map;

import java.io.Serializable;

/**
 * Created by Jakub on 04.12.2016.
 */
public abstract class Client implements Serializable {
    protected Address address;
    protected Map map = Map.getInstance();


}
