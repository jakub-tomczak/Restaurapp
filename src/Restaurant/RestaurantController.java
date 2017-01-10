package Restaurant;

import Generator.Generator;
import javafx.event.ActionEvent;

public class RestaurantController {

    public void closeApplication(ActionEvent actionEvent) {
        System.out.println("koniec aplikacji");
    }

    public void generuj(ActionEvent event) {
        Generator generator = Generator.getInstance();
        System.out.println(generator.generateName());
        // Generator.Instance.generate();
    }

    public void openClientManager(ActionEvent event) {
        System.out.println("otwieram nowe okno");
    }
}
