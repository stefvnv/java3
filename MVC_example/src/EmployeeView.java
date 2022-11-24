import javax.swing.*;

public class EmployeeView extends JFrame {

    JFrame window = new JFrame("Employee");

    public void showDetails(String name, String number) {
        JLabel nameLabel = new JLabel(name);
        JLabel numberLabel = new JLabel(number);

        JPanel detailsPanel = new JPanel();
        detailsPanel.add(nameLabel);
        detailsPanel.add(numberLabel);
        window.setSize(200, 200);
        window.pack();
        window.setVisible(true);
    }

    public void printEmployeeDetails(String name, String no) {
        System.out.println("Employee: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + no);
    }
}
