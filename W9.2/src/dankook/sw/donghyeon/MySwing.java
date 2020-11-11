package dankook.sw.donghyeon;

import javax.swing.*;
import java.awt.*;

public class MySwing extends JFrame {
    public MySwing() {
        super("연습");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 3, 5, 5));
        c.setBackground(Color.BLUE);

        for (int i = 0; i < 10; i++) {
            c.add(new JButton(Integer.toString(i)));
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new MySwing();
    }
}
