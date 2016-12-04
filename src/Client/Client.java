package Client;

import Map.Localizable;
import Map.Map;

/**
 * Created by Jakub on 04.12.2016.
 */
public abstract class Client implements Localizable {
    protected Address address;
    protected Map map = Map.getInstance();


}
