package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("hello");

    public MouseListenerEx() {
        setTitle("Mouse 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                la.setLocation(x, y);
            }
        });

        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();

            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }

    public static class FocusDemo extends JFrame {
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

            text2.setFocusable(true);
            text2.requestFocus();

            setVisible(true);
        }

        public static void main(String[] args) {
            new FocusDemo();
        }
    }
}
