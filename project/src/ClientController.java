/**
 * Research Project
 * MVC - ClientController
 * Stefana Chiritescu
 * A00282343
 */

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ClientController extends UnicastRemoteObject implements RmiInterface {

    //Stores Serialize and ClientView objects as variables
    private final Serialize serialize;
    private final ClientView view;

    private ArrayList<ClientModel> clientList;

    public ClientController() throws RemoteException {
        super();

        serialize = new Serialize();

        //Serializes client list
        clientList = serialize.getClientList();

        //Adds an empty client to client list if list is empty
        if (clientList.size() == 0) {
            clientList.add(new ClientModel(null, null, null, null, null, null, null, null));
        }

        this.view = new ClientView();

        //Calls methods
        view.init();
        addEventListenerDeleteToGUI();
        addEventListenerUpdateToGUI();
        addEventListenerAddToGUI();
        rmi();
        setUpTable();
    }


    /**
     * Updates table by calling updateTable method from ClientView
     */
    private void setUpTable() {
        view.updateTable(clientList);
    }


    /**
     *
     */
    public void addEventListenerUpdateToGUI() {
        view.updateEventButton(e -> {
            updateFromTableToFile();
            setUpTable();
            view.successUpdateMessage();
        });
    }


    /**
     *
     */
    public void addEventListenerDeleteToGUI() {
        view.deleteEventButton(e -> {
            if (clientList.size() > 0) {
                System.out.println("size = " + clientList.size());
                if (view.getClickedIndex() > -1) {
                    clientList.remove(view.getClickedIndex());
                    view.successDeleteMessage();
                    setUpTable();
                    updateFile();
                } else {
                    view.alertSelectRecord();
                }
            } else {
                view.emptyMessage();
            }
        });
    }


    /**
     *
     */
    public void addEventListenerAddToGUI() {
        view.addEventButton(e -> {
            clientList.add(view.getNew());
            setUpTable();
            updateFile();
            view.clearAddFields();
        });
    }


    /**
     *
     */
    public void updateFile() {
        try {
            serialize.runner(clientList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     *
     */
    public void updateFromTableToFile() {
        clientList = view.updateData();
        updateFile();
    }

    /**
     *
     */
    @Override
    public void rmi() {
        System.out.println("RMI server initiated...");
        try {
            LocateRegistry.createRegistry(6600);

            // binds the object "clientList" to the rmi URI
            Naming.rebind("rmi://localhost:6600/controllerObject", this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     *
     */
    public ArrayList<ClientModel> getClientList() {
        System.out.println("Client has received data...");
        return clientList;
    }


    /**
     * Starts the application
     */
    public static void main(String[] args) {
        try {
            new ClientController();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

}
