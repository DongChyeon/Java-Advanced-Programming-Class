package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling2 {

    JButton btn;
    int count = 0;

    public EventHandling2() {
        start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new BtnActionListener(this));

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}

class BtnActionListener implements ActionListener {
    EventHandling2 eh;

    public BtnActionListener(EventHandling2 o) {
        eh = o;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        eh.count++;
        eh.btn.setText("I have been clicked " + eh.count + " times.");
    }
}

