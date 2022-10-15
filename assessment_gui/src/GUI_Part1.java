/**
 * Assignment 1 - Graphical User Interface Design
 * Part 1 - GUI_Part1
 * Stefana Chiritescu
 * A00282343
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Part1 extends JFrame implements ActionListener {

    //buttons
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();

    public GUI_Part1() {

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

        //set JFrame size, title and visibility to true
        setSize(250, 250);
        setTitle("Part 1");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new GUI_Part1();
    }
}
