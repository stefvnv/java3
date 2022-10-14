import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame window = new JFrame("GUI");
    JPanel panel = new JPanel();

    JButton buttonA = new JButton();
    JButton buttonB = new JButton();

    JCheckBox checkBox = new JCheckBox();

    public GUI(){
        checkBox.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);

        buttonA.setBackground(Color.GREEN);
        buttonB.setBackground(Color.ORANGE);


        panel.add(checkBox);
        panel.add(buttonA);
        panel.add(buttonB);

        window.getContentPane().add(panel);
        window.pack();
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(checkBox)) {
            if (checkBox.isSelected()){
                buttonA.setBackground(Color.ORANGE);
                buttonB.setBackground(Color.GREEN);
            }else {
                buttonA.setBackground(Color.GREEN);
                buttonB.setBackground(Color.ORANGE);

            }
        }

    }

    public static void main(String[] args) {
        new GUI();
    }
}
