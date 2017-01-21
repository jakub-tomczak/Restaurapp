package Map;

/**
 * Created by Jakub on 04.12.2016.
 */
public interface Localizable {

    void DrawOnMap();

    void AddMapDescription();

    @Override
    boolean equals(Object obj);

    @Override
    int hashCode();


}
