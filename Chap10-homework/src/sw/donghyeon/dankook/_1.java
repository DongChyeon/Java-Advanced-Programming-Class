package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class _1 extends JFrame {
    JLabel jLabel = new JLabel("Love java");

    public _1() {
        setTitle("마우스 올리기 내리기 이벤트");
        setSize(250, 150);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jLabel);
        jLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabel.setText("Love java");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jLabel.setText("사랑해");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new _1();
    }
}
