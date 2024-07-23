import javax.swing.*;
import java.awt.event.*;

public class MoneyConverter {
    public static void converter() {
        JFrame f = new JFrame("CONVERTER");
        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;

        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);

        t1 = new JTextField("0");
        t1.setBounds(80, 40, 100, 30);

        l2 = new JLabel("Dollars:");
        l2.setBounds(200, 40, 60, 30);

        t2 = new JTextField("0");
        t2.setBounds(260, 40, 100, 30);

        b1 = new JButton("INR -> USD");
        b1.setBounds(50, 80, 120, 30);

        b2 = new JButton("Close");
        b2.setBounds(150, 150, 100, 30);

        b3 = new JButton("Reset");
        b3.setBounds(250, 150, 100, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rupees = Double.parseDouble(t1.getText());
                    double dollars = rupees / 83.59;
                    t2.setText(String.format("%.2f", dollars));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("0");
                t2.setText("0");
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}
