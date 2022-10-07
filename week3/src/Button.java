import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button implements ActionListener {
    JFrame window = new JFrame("example");
    JPanel panel = new JPanel();

    JButton bmiddle = new JButton("middle button");
    JButton bright = new JButton("right button");
    JButton bleft = new JButton("left button");
    Label l = new Label("nothing clicked yet...");

    public Button() {

        bleft.addActionListener(this);
        bmiddle.addActionListener(this);
        bright.addActionListener(this);


        panel.add(bleft);
        panel.add(bmiddle);
        panel.add(bright);
        panel.add(l);
        window.getContentPane().add(panel);

        window.pack();
        window.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(bleft)) {
            panel.setBackground(Color.BLUE);
            l.setText("LEFT button clicked");
        }

        if (e.getSource().equals(bright)) {
            panel.setBackground(Color.RED);
            l.setText("RIGHT button clicked");
        }

        if (e.getSource().equals(bmiddle)) {
            panel.setBackground(Color.GREEN);
            l.setText("MIDDLE button clicked");
        }


    }

    public static void main(String[] args) {

        new Button();
    }

}