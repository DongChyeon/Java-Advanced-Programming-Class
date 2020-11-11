package sw.dankook.donghyeon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling3 {

    JButton btn;
    int count = 0;

    public EventHandling3() {
        start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new BtnActionListener());

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    class BtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            btn.setText("I have been clicked " + count + " times.");
        }
    }


    public static void main(String[] args) {
        new EventHandling();
    }
}
