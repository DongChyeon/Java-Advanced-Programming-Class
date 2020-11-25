package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo extends JFrame {
    String lblString = "수강과목: ";
    JCheckBox chkBox, chkBox2;
    JLabel lbl;

    public CheckBoxDemo() {
        setTitle("체크박스 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ItemListener listener = new CheckBoxHandler();
        lbl = new JLabel(lblString);
        lbl.setBounds(20, 20, 200, 20);

        chkBox = new JCheckBox("C++", false);
        chkBox.setBounds(20, 50, 100, 20);
        chkBox.addItemListener(listener);

        chkBox2 = new JCheckBox("JAVA", false);
        chkBox2.setBounds(20, 80, 100, 20);
        chkBox2.addItemListener(listener);

        Container c = getContentPane();
        c.setLayout(null);
        c.add(lbl);
        c.add(chkBox);
        c.add(chkBox2);

        setSize(300, 300);
        setVisible(true);
    }

    class CheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String tempStr = "";
            if (chkBox.isSelected())
                tempStr = tempStr + " " + chkBox.getText();
            if (chkBox2.isSelected())
                tempStr = tempStr + " " + chkBox2.getText();
            lbl.setText(lblString + tempStr);
        }
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
        System.out.println("Test");
    }
}
