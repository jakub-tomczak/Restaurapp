package ControlManager;

import Client.Client;

/**
 * Created by Jakub on 04.12.2016.
 */
public class Manager {
    private static Manager instance = null;
    Client clientInstance;

    private Manager() {
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

}
