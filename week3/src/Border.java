import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {

    JButton buttonNorth = new JButton("North");
    JButton buttonSouth = new JButton("South");
    JButton buttonEast = new JButton("East");
    JButton buttonWest = new JButton("West");
    JButton buttonCentre = new JButton("Center");

    public Border() {

        getContentPane().add(buttonNorth, BorderLayout.NORTH);
        getContentPane().add(buttonSouth, BorderLayout.SOUTH);
        getContentPane().add(buttonEast, BorderLayout.EAST);
        getContentPane().add(buttonWest, BorderLayout.WEST);
        getContentPane().add(buttonCentre, BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}