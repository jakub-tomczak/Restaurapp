package ControlManager.Controllers;

import Client.Client;
import Client.IndividualClient;
import Client.PotentialClient;
import Client.RegularClient;
import Restaurant.MessagesHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 10.01.2017.
 */

public class ClientManager {

    public static List<IndividualClient> clientsList = new ArrayList<IndividualClient>();
    private static ClientManager Instance = null;
    ObservableList<Client> currentClients = FXCollections.observableArrayList(
            new RegularClient("Jan", "Kowalski"),
            new PotentialClient("Anna", "Jankowska")
    );
    @FXML
    TableView<Client> clientsTable;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;

    public ClientManager() {
        Instance = this;

        // clientsTable.setEditable(true);


    }

    public static ClientManager getInstance() {
        if (Instance == null) {
            Instance = new ClientManager();
        }
        return Instance;
    }

    @FXML
    private void initialize() {
        initializeTableView();

    }

    @FXML
    private void initializeTableView() {
        TableColumn firstNameTableColumn = new TableColumn("Imię");
        firstNameTableColumn.setMinWidth(100);
        firstNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Client, String>("firstNameString")
        );


        clientsTable.setItems(currentClients);
        clientsTable.getColumns().addAll(firstNameTableColumn);

        MessagesHandler.showMessage("Dodano osoby do listy");

    }

    @FXML
    private void addClient(ActionEvent event) {
       /* clientsList.add(
                new RegularClient(firstName.getText(), lastName.getText())
        );
        */
        clientsList.add(
                new RegularClient("Jan", "Kowalski")
        );
        System.out.println("Dodano klienta");
    }

    public void listClients(ActionEvent event) {
        if (clientsList.size() > 0) {
            for (Client a : clientsList) {
                System.out.println(a.toString());
            }

        }
    }


}
