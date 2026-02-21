import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Arithmetic extends JApplet implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    public void init() {
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter First number:");
        l2 = new JLabel("Enter Second number:");
        l3 = new JLabel("Enter Result:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("multiply");
        b4 = new JButton("Divide");

        add(l1); add(t1);
        add(l2); add(t2);
        add(b1); add(b2);
        add(b3); add(b4);
        add(l3); add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;

        if (e.getSource() == b1) {
            result = num1 + num2;
        } else if (e.getSource() == b2) {
            result = num1 - num2;
        } else if (e.getSource() == b3) {
            result = num1 * num2;
        } else if (e.getSource() == b4) {
            result = num1 / num2;
        }
        t3.setText(String.valueOf(result));
    }
}
