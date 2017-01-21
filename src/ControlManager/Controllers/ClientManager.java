package ControlManager.Controllers;

import Client.Client;
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

/**
 * Created by Jakub on 10.01.2017.
 */

public class ClientManager {

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

        // clientsTable.setEditable(true);


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

        TableColumn secondNameTableColumn = new TableColumn("Nazwisko");
        secondNameTableColumn.setMinWidth(100);
        secondNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Client, String>("lastNameString")
        );


        clientsTable.setItems(currentClients);
        clientsTable.getColumns().addAll(firstNameTableColumn, secondNameTableColumn);

        MessagesHandler.showMessage("Dodano osoby do listy");

    }


    @FXML
    private void addClient(ActionEvent event) {


        System.out.println("Dodano klienta");
    }


    private void createRandomClient() {
        ;
    }

}
