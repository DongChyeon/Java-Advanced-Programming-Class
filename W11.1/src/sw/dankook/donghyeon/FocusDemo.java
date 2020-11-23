package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;

public class FocusDemo extends JFrame {
    private JTextField text1, text2;

    public FocusDemo() {
        super("Focus Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        text1 = new JTextField("Num1", 10);
        text2 = new JTextField("Num2", 10);
        c.add(text1);
        c.add(text2);

        setVisible(true);

        text2.setFocusable(true);
        text2.requestFocus();
    }

    public static void main(String[] args) {
        new FocusDemo();
    }
}