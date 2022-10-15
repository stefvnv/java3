/**
 * Assignment 1 - Graphical User Interface Design
 * Part 2 - GUI_Part2
 * Stefana Chiritescu
 * A00282343
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Part2 extends JFrame implements ActionListener {

    //buttons
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();

    //checkbox and label
    JCheckBox checkBox = new JCheckBox("", false);
    JLabel label = new JLabel("give colours");

    public GUI_Part2() {
        //checkbox action listener
        checkBox.addActionListener(this);

        //new grid-bag layout
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridBag);

        //add each button to different sections in grid-bag
        c.gridx = 0;
        c.gridy = 0;
        getContentPane().add(buttonA, c);

        c.gridx = 1;
        c.gridy = 1;
        getContentPane().add(buttonB, c);

        c.gridx = 2;
        c.gridy = 0;
        getContentPane().add(buttonC, c);

        c.gridx = 3;
        c.gridy = 0;
        getContentPane().add(checkBox, c);

        c.gridx = 4;
        c.gridy = 0;
        getContentPane().add(label, c);

        //set JFrame size, title and visibility to true
        setSize(250, 250);
        setTitle("Part 2");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(checkBox)) {

            //set buttons to green, blue red when checkbox is selected
            if (checkBox.isSelected()) {
                buttonA.setBackground(Color.GREEN);
                buttonB.setBackground(Color.BLUE);
                buttonC.setBackground(Color.RED);
            } else {
                buttonA.setBackground(Color.LIGHT_GRAY);
                buttonB.setBackground(Color.LIGHT_GRAY);
                buttonC.setBackground(Color.LIGHT_GRAY);
            }
        }
    }

    public static void main(String[] args) {
        new GUI_Part2();
    }
}