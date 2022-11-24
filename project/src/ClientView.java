import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClientView extends JFrame implements ChangeListener {


    //Declaring tabbed pane
    private final JTabbedPane tabbedPane = new JTabbedPane();

    //Declaring table
    private final JTable table = new JTable();

    //Declaring panels
    private final JPanel panelAll = new JPanel();
    private final JPanel panelAdd = new JPanel();

    //Declaring buttons
    private final JButton deleteButton = new JButton("Delete");
    private final JButton editButton = new JButton("Edit");
    private final JButton addButton = new JButton("Add");

    //Declaring labels
    private final JLabel idLabel = new JLabel("Client ID: ");
    private final JLabel ownerNameLabel = new JLabel("Owner Name: ");
    private final JLabel petNameLabel = new JLabel("Pet Name: ");
    private final JLabel addressLabel = new JLabel("Address: ");
    private final JLabel speciesLabel = new JLabel("Species: ");
    private final JLabel breedLabel = new JLabel("Breed: ");
    private final JLabel dobLabel = new JLabel("Date of Birth: ");
    private final JLabel neuteredLabel = new JLabel("Neutered: ");

    //Declaring text fields
    private final JTextField idText = new JTextField(4);
    private final JTextField ownerNameText = new JTextField(12);
    private final JTextField petNameText = new JTextField(12);
    private final JTextField addressText = new JTextField(12);
    private final JTextField speciesText = new JTextField(12);
    private final JTextField breedText = new JTextField(12);
    private final JTextField dobText = new JTextField(12);


    private final JTextField neuteredText = new JTextField(12);

    private int clickedIndex = 0;


    /**
     * Set GUI title, size, layout and sets resizeable to false
     * Sets colours
     */
    public ClientView() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Veterinary Clinic Management System");
        this.setSize(750, 500);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        //Colours
    }


    /**
     * Initializes the GUI
     */
    public void init() {

        //======Panel all======
        panelAll.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JScrollPane scrollPane = new JScrollPane(table);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 0.9;
        c.gridwidth = 2;
        panelAll.add(scrollPane, c);
        c.fill = GridBagConstraints.NONE;

        c.gridx = 0;
        c.gridy = 1;
        c.weighty = .1;
        c.gridwidth = 1;
        panelAll.add(editButton, c);


        c.gridx = 1;
        c.gridy = 1;
        c.weighty = .1;
        c.gridwidth = 1;
        panelAll.add(deleteButton, c);


        //======Panel add======
        panelAdd.setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        panelAdd.add(idLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panelAdd.add(idText, c);

        c.gridx = 0;
        c.gridy = 1;
        panelAdd.add(ownerNameLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panelAdd.add(ownerNameText, c);

        c.gridx = 0;
        c.gridy = 2;
        panelAdd.add(petNameLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        panelAdd.add(petNameText, c);

        c.gridx = 0;
        c.gridy = 3;
        panelAdd.add(addressLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        panelAdd.add(addressText, c);

        c.gridx = 0;
        c.gridy = 4;
        panelAdd.add(speciesLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        panelAdd.add(speciesText, c);

        c.gridx = 0;
        c.gridy = 5;
        panelAdd.add(breedLabel, c);

        c.gridx = 1;
        c.gridy = 5;
        panelAdd.add(breedText, c);

        c.gridx = 0;
        c.gridy = 6;
        panelAdd.add(dobLabel, c);

        c.gridx = 1;
        c.gridy = 6;
        panelAdd.add(dobText, c);

        c.gridx = 0;
        c.gridy = 7;
        panelAdd.add(neuteredLabel, c);

        c.gridx = 1;
        c.gridy = 7;
        panelAdd.add(neuteredText, c);

        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        panelAdd.add(addButton, c);


        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        //Add panels to tabbed pane and set visibility to true
        tabbedPane.add("All Clients", panelAll);
        tabbedPane.add("Add Client", panelAdd);
        // tabbedPane.addChangeListener(this);

        this.add(tabbedPane, BorderLayout.CENTER);
        this.setVisible(true);

    }

    /**
     * Repopulates table by re-reading arraylist
     */
    public void updateTable(ArrayList<ClientModel> clientList) {

        String[] columns = {"ID", "Owner Name", "Pet Name", "Address", "Species", "Breed", "Date of Birth", "Neutered"};

        DefaultTableModel dtm = new DefaultTableModel(columns, 0);
        for (ClientModel element : clientList) {

            dtm.addRow(new Object[]{
                    element.getId(),
                    element.getOwnerName(),
                    element.getPetName(),
                    element.getAddress(),
                    element.getSpecies(),
                    element.getBreed(),
                    element.getDOB(),
                    element.getNeutered()
            });
        }
        table.setModel(dtm);
    }


    @Override
    public void stateChanged(ChangeEvent e) {


    }

    public void editEventButton(ActionListener alEdit) {
        editButton.addActionListener(alEdit);
    }

    public void deleteEventButton(ActionListener alDelete) {
        deleteButton.addActionListener(alDelete);
    }

    public void addEventButton(ActionListener alAdd) {
        addButton.addActionListener(alAdd);
    }


    public int getClickedIndex() {
        return table.getSelectedRow();
    }
}
