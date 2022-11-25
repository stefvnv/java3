import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class ClientController {
    //private ClientModel model;
    private final Serialize serialize;
    private final ClientView view;

    private ArrayList<ClientModel> clientList = new ArrayList<>();

    public ClientController() {

        serialize = new Serialize();

        clientList = serialize.getClientList();
        if (clientList.size() > 0) {
            System.out.println(clientList.get(0).getOwnerName());
        } else {
            clientList.add(new ClientModel(null, null, null, null, null, null, null, null));
        }

        this.view = new ClientView();

        view.init();
        addEventListenerDeleteToGUI();
        addEventListenerEditToGUI();
        addEventListenerAddToGUI();

        setUpTable();
    }

    private void setUpTable() {
        view.updateTable(clientList);
    }

    public ArrayList<ClientModel> getClientList() {
        return clientList;
    }

    public void addEventListenerEditToGUI() {
        view.editEventButton(e -> {
            updateFromTableToFile();
            setUpTable();
        });
    }

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

    public void addEventListenerAddToGUI() {
        view.addEventButton(e -> {
            clientList.add(view.getNew());
            setUpTable();
            updateFile();
            view.clearAddFields();
        });
    }

    public void updateFile() {
        try {
            serialize.runner(clientList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateFromTableToFile() {
        clientList = view.updateData();
        updateFile();
    }


    public static void main(String[] args) {
        new ClientController();
    }
}
