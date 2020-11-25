package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {

    public CheckBoxEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon kotlinIcon = new ImageIcon("images/kotlin.jpg");
        ImageIcon pythonIcon = new ImageIcon("images/python.png");

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox kotlin = new JCheckBox("코틀린", kotlinIcon);

        kotlin.setSelectedIcon(pythonIcon);

        c.add(apple);
        c.add(pear);
        c.add(kotlin);

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
