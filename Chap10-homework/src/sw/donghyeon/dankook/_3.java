package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _3 extends JFrame {
    JLabel jLabel = new JLabel("Love java");

    public _3() {
        setTitle("마우스 올리기 내리기 이벤트");
        setSize(250, 150);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jLabel);
        jLabel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    StringBuffer stringBuffer = new StringBuffer(jLabel.getText());
                    jLabel.setText(stringBuffer.reverse().toString());
                }
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel.setFocusable(true);
        jLabel.requestFocus();
    }

    public static void main(String[] args) {
        new _3();
    }
}

