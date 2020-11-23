package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Adder extends JFrame {
    private JTextField txt;
    private JButton btn;
    private JLabel lbl;
    private int sum = 0;

    public Adder() {
        super("누적 더하기");
        setSize(250,70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        txt = new JTextField("", 10);
        btn = new JButton("Add");
        lbl = new JLabel("계산결과");

        c.add(txt);
        c.add(btn);
        c.add(lbl);

        txt.addKeyListener(new MyKeyListener());
        btn.addActionListener(new MyActionListener());
        setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n = Integer.parseInt(txt.getText());
            sum = sum + n;
            lbl.setText(Integer.toString(sum));
            txt.requestFocus();
        }
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
                e.consume();
            }
        }
    }

    public static void main(String[] args) {
        new Adder();
    }
}
