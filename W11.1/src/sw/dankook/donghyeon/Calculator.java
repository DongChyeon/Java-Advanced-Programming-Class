package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Calculator extends JFrame {
    private JTextField text1, text2;
    private JButton btn;

    public Calculator() {
        super("Focus Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        text1 = new JTextField("Num1", 10);
        text2 = new JTextField("Num2", 10);
        btn = new JButton("Add");
        c.add(text1);
        c.add(text2);
        c.add(btn);

        setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(text1.getText());
                int n2 = Integer.parseInt(text2.getText());
                int result = n1 + n2;
                setTitle("" + result);
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
