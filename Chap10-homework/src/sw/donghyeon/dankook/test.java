package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class test extends JFrame {
    public test() {
        setTitle("test");
        setSize(500, 500);
        JButton btn = new JButton("Hello");
        btn.addActionListener(new MyActionListener("1"));
        btn.addActionListener(new MyActionListener("2"));
        btn.addActionListener(new MyActionListener("3"));
        add(btn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}

class MyActionListener implements ActionListener {
    private String msg;
    public MyActionListener(String msg) { this.msg = msg; }
    public void actionPerformed(ActionEvent e) {
        System.out.println(msg);
    }
}

class MyKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ALT) {
            System.exit(0);
        }
    }
}
