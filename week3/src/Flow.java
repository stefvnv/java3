import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
    private JButton theButton1 = new JButton("Button 1");
    private JButton theButton2 = new JButton("2");
    private JButton theButton3 = new JButton("Button 3");
    private JButton theButton4 = new JButton("Long-Named Button 4");
    private JButton theButton5 = new JButton("Button 5");

    public Flow() {
        getContentPane().setLayout(new FlowLayout());

        getContentPane().add(theButton1);
        getContentPane().add(theButton2);
        getContentPane().add(theButton3);
        getContentPane().add(theButton4);
        getContentPane().add(theButton5);

        setSize(500, 75);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Flow();
    }
}