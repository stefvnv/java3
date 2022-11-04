/**
 * Assignment 2 - Serialization
 * Part 2 - GUI_Phone
 * Stefana Chiritescu
 * A00282343
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;


public class GUI_Phone extends JFrame implements ActionListener {
    private static List<Phone> listOfPhones;
    JTextPane textBox = new JTextPane();
    JButton buttonShow = new JButton("Show");
    JButton buttonClear = new JButton("Clear");
    String listOutput;

    public GUI_Phone() {

        //exit gui when X is clicked
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //create gridbag layout
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridBag);

        //natural height, max width
        c.fill = GridBagConstraints.HORIZONTAL;

        //set position and size of variables on gridbag
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.ipadx = 300;
        this.add(textBox, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        this.add(buttonShow, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        this.add(buttonClear, c);

        //add action listener and background color for buttons
        buttonShow.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonShow.setBackground(Color.PINK);
        buttonClear.setBackground(Color.PINK);

        listOutput = "";

        //loop through list of phones and print out all information
        for (Phone phone : listOfPhones) {
            listOutput += phone.toString() + "\n";
        }

        //set size, title and visibility to true
        this.setSize(800, 500);
        this.setTitle("Phone GUI");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //set to list text when 'show' button is clicked
        if (e.getSource().equals(buttonShow)) {
            textBox.setText(listOutput);
        }

        //set to null text when 'clear' button is clicked
        if (e.getSource().equals(buttonClear)) {
            textBox.setText(null);
        }
    }

    public static void main(String[] args) {
        Serializing serializing = new Serializing();
        listOfPhones = serializing.deserializedPhoneList;
        new GUI_Phone();
    }
}
