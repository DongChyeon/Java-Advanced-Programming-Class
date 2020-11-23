package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling4 {

    JButton btn;
    int count = 0;

    public EventHandling4() {
        start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                btn.setText("I have been clicked " + count + " times.");
            }
        });

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}
