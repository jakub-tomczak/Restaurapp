package ControlManager;

import Client.Client;
import Client.IndividualClient;
import Client.RegularClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 10.01.2017.
 */

public class ClientManager {
    public static List<IndividualClient> clientsList = new ArrayList<IndividualClient>();
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;

    @FXML
    public void addClient(ActionEvent event) {
        clientsList.add(
                new RegularClient(firstName.getText(), lastName.getText())
        );
    }

    public void listClients(ActionEvent event) {
        if (clientsList.size() > 0) {
            for (Client a : clientsList) {
                System.out.println(a.toString());
            }

        }
    }
}
