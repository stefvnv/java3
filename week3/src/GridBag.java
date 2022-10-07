import javax.swing.*;
import java.awt.*;

public class GridBag extends JFrame {
    private JButton theButton1 = new JButton("Button 1");
    private JButton theButton2 = new JButton("Button 2");
    private JButton theButton3 = new JButton("Button 3");
    private JButton theButton4 = new JButton("Button 4");
    private JButton theButton5 = new JButton("Button 5");

    public GridBag() {
        super();

        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridBag);

        //natural height, max width
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        gridBag.setConstraints(theButton1, c);
        getContentPane().add(theButton1);

        c.gridx = 1;
        c.gridy = 0;
        gridBag.setConstraints(theButton2, c);
        getContentPane().add(theButton2);

        c.gridx = 2;
        c.gridy = 0;
        gridBag.setConstraints(theButton3, c);
        getContentPane().add(theButton3);

        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        gridBag.setConstraints(theButton4, c);
        getContentPane().add(theButton4);

        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 3;
        gridBag.setConstraints(theButton5, c);
        getContentPane().add(theButton5);

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new Grid();
    }
}
