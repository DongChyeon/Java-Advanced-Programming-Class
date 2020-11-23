package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends JFrame {
    public KeyEventTest() {
        super("KeyEvent");

        Container c = getContentPane();
        c.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode()); // KeyTyped 메소드에서 유니코드 값인 경우 undefined값으로 반환
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("KeyPressed");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("KeyReleased");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new KeyEventTest();
    }
}
