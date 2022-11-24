import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClientController {
    //private ClientModel model;
    private final ClientView view;

    private ArrayList<ClientModel> clientList = new ArrayList<>();

    public ClientController() {

        Serialize serialize = new Serialize();

        clientList = serialize.getClientList();
        System.out.println(clientList.get(0).getOwnerName());

        this.view = new ClientView();

        view.init();
        addEventListenerDeleteToGUI();
        addEventListenerEditToGUI();

        setUpTable();
    }

    private void setUpTable() {
        view.updateTable(clientList);
    }

    public ArrayList<ClientModel> getClientList() {
        return clientList;
    }

    public void addEventListenerEditToGUI() {
        view.editEventButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientList.remove(view.getClickedIndex());
                setUpTable();
            }
        });
    }

    public void addEventListenerDeleteToGUI() {
        view.deleteEventButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientList.remove(view.getClickedIndex());
                setUpTable();
            }
        });
    }

    public void addEventListenerAddToGUI() {
        view.addEventButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public static void main(String[] args) {
        new ClientController();
    }
}
