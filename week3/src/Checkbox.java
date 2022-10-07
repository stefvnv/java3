import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox implements ActionListener {
    JCheckBox c = new JCheckBox("one", true);
    JCheckBox c1 = new JCheckBox("two", false);
    Panel p = new Panel();
    JFrame window = new JFrame("example");

     public Checkbox() {
         c.addActionListener(this);
         c1.addActionListener(this);

         p.add(c);
         p.add(c1);

         window.getContentPane().add(p);
         window.pack();
         window.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(c)){
             if(c1.isSelected()) {
                 c1.setSelected(false);
             }
         }

        if (e.getSource().equals(c1)){
            if(c.isSelected()) {
                c.setSelected(false);
            }
        }
    }

    public static void main(String[] args) {
        new Checkbox();
    }
}
