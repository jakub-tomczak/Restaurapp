package Map;

/**
 * Created by Jakub on 04.12.2016.
 */
public interface Localizable {
    Position position = new Position();
    //display it on a map to recognize object that has been drawn
    String typeOfObject = new String();
    String objectDescription = new String();
    int positionX = 0;
    int positionY = 0;

    void DrawOnMap();

    void AddMapDescription();

    @Override
    boolean equals(Object obj);

    @Override
    int hashCode();


}
