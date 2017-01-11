package Restaurant;

import javafx.scene.control.Alert;

/**
 * Created by Jakub on 11.01.2017.
 */
public class MessagesHandler {
    public static void showMessage(String message) {
        showMessage(message, "Wiadomość");
    }

    public static void showMessage(String message, String title) {
        showAlert(message, title, Alert.AlertType.INFORMATION);
    }

    public static void showError(String message) {
        showError(message, "Ostrzeżenie");
    }

    public static void showError(String message, String title) {
        showAlert(message, title, Alert.AlertType.WARNING);
    }

    private static void showAlert(String message, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
}
