package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends JFrame {

    public MouseEventDemo() {
        setTitle("MouseEventDemo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("text");

        Container c = getContentPane();
        c.add(btn);

        btn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("x = " + getX());
                System.out.println("y = " + getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);
        btn.setFocusable(true);
        btn.requestFocus();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
