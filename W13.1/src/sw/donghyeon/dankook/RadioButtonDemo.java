package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonDemo extends JFrame {
    String lblString = "수강과목";
    JRadioButton radioB, radioB2;
    JLabel lbl;

    public RadioButtonDemo() {
        setTitle("라디오버튼 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl = new JLabel(lblString);
        lbl.setBounds(20, 20, 200, 20);

        ItemListener itemListener = new RadioButtonHandler();
        radioB = new JRadioButton("C++", false);
        radioB.setBounds(20, 50, 100, 20);
        radioB.addItemListener(itemListener);

        radioB2 = new JRadioButton("Java", false);
        radioB2.setBounds(20, 80, 100, 20);
        radioB2.addItemListener(itemListener);

        ButtonGroup group = new ButtonGroup();

        group.add(radioB);
        group.add(radioB2);

        Container c = getContentPane();
        c.setLayout(null);
        c.add(lbl);
        c.add(radioB);
        c.add(radioB2);

        setSize(300, 300);
        setVisible(true);
    }

    class RadioButtonHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String tempStr = "";
            if (radioB.isSelected())
                tempStr = tempStr + " " + radioB.getText();
            if (radioB2.isSelected())
                tempStr = tempStr + " " + radioB2.getText();
            lbl.setText(lblString + tempStr);
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
