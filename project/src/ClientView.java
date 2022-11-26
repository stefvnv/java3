/**
 * Research Project
 * MVC - ClientView
 * Stefana Chiritescu
 * A00282343
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ClientView extends JFrame implements ChangeListener, TableModelListener {


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
    }


    /**
     * Initializes the GUI, sets grid-bag layout in both panels and places table, buttons and text boxes in grid-bag
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

        table.setBackground(new Color(238, 220, 220));
        panelAll.setBackground(new Color(238, 220, 220));


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
        idText.setEditable(false);

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

        panelAdd.setBackground(new Color(238, 220, 220));

        //Add panels to tabbed pane and set visibility to true
        tabbedPane.add("All Clients", panelAll);
        tabbedPane.add("Add Client", panelAdd);

        add(tabbedPane, BorderLayout.CENTER);
        setVisible(true);

        //Stops editing tab in table when focus is lost
        table.putClientProperty("terminateEditOnFocusLost", true);

        insertRandomID();
    }


    /**
     *
     */
    public ArrayList<ClientModel> updateData() {
        ArrayList<ClientModel> cm = new ArrayList<>();

        for (int i = 0; i < table.getRowCount(); i++) {
            cm.add(new ClientModel(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(), table.getValueAt(i, 2).toString(), table.getValueAt(i, 3).toString(), table.getValueAt(i, 4).toString(), table.getValueAt(i, 5).toString(), table.getValueAt(i, 6).toString(), table.getValueAt(i, 7).toString()));
        }
        System.out.println(table.getValueAt(0, 0));
        return cm;
    }


    /**
     * Inserts random ID into ID text box
     */
    public void insertRandomID() {

        //Initializes a Random object
        Random random = new Random();

        //Generates a random int from 0 to 899, then adds 100
        int randomID = Integer.parseInt(Integer.toString(random.nextInt(900) + 100));

        //Sets text box to new random value
        idText.setText(String.valueOf(randomID));
    }


    /**
     * Returns new client model with data from entry boxes on add client panel
     */
    public ClientModel getNew() {
        return new ClientModel(idText.getText(), ownerNameText.getText(), petNameText.getText(), addressText.getText(), speciesText.getText(), breedText.getText(), dobText.getText(), neuteredText.getText());
    }


    /**
     * Clears all entry fields in add client panel
     */
    public void clearAddFields() {
        JOptionPane.showMessageDialog(null, "Added new record");
        idText.setText("");
        ownerNameText.setText("");
        petNameText.setText("");
        addressText.setText("");
        speciesText.setText("");
        breedText.setText("");
        dobText.setText("");
        neuteredText.setText("");

        insertRandomID();
    }


    /**
     * Repopulates table by re-reading arraylist
     */
    public void updateTable(ArrayList<ClientModel> clientList) {

        //Creates an array of columns/headings for table
        String[] columns = {"ID", "Owner Name", "Pet Name", "Address", "Species", "Breed", "Date of Birth", "Neutered"};

        //Creates table with number of columns from columns array
        DefaultTableModel dtm = new DefaultTableModel(columns, 0);

        //Populates table with rows from client list object
        for (ClientModel element : clientList) {
            dtm.addRow(new Object[]{element.getId(), element.getOwnerName(), element.getPetName(), element.getAddress(), element.getSpecies(), element.getBreed(), element.getDOB(), element.getNeutered()});
        }
        table.setModel(dtm);
    }


    @Override
    public void stateChanged(ChangeEvent e) {


    }


    /**
     * Adds action listener to edit button, sets colour
     */
    public void editEventButton(ActionListener alEdit) {
        editButton.addActionListener(alEdit);
        editButton.setBackground(Color.pink);
    }


    /**
     * Adds action listened to delete button, sets colour
     */
    public void deleteEventButton(ActionListener alDelete) {
        deleteButton.addActionListener(alDelete);
        deleteButton.setBackground(Color.pink);
    }


    /**
     * Adds action listened to add button, sets colour
     */
    public void addEventButton(ActionListener alAdd) {
        addButton.addActionListener(alAdd);
        addButton.setBackground(Color.pink);
    }


    /**
     * @return
     */
    public int getClickedIndex() {
        return Math.max(table.getSelectedRow(), -1);

    }


    /**
     *
     */
    public void successDeleteMessage() {
        JOptionPane.showMessageDialog(null, "Deleted record successfully.");
    }


    /**
     *
     */
    public void emptyMessage() {
        JOptionPane.showMessageDialog(null, "No records to delete.");
    }


    /**
     *
     */
    public void alertSelectRecord() {
        JOptionPane.showMessageDialog(null, "Please select a record to delete.");
    }


    /**
     * @param e
     */
    @Override
    public void tableChanged(TableModelEvent e) {
    }
}
