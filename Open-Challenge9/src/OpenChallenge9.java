import javax.swing.*;
import java.awt.*;

public class OpenChallenge9 extends JFrame {

    public OpenChallenge9() {
        setTitle("Open Challenge 9");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new NorthPanel(), BorderLayout.NORTH);
        add(new CenterPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    class NorthPanel extends JPanel {
        public NorthPanel() {
            setBackground(Color.LIGHT_GRAY);
            setLayout(new FlowLayout());

            add(new Button("Open"));
            add(new Button("Read"));
            add(new Button("Close"));
        }
    }

    class CenterPanel extends JPanel {
        public CenterPanel() {
            setLayout(null);

            add(new JLabel("Hello")).setBounds(100, 10, 50, 30);
            add(new JLabel("Java")).setBounds(30, 150, 50, 30);
            add(new JLabel("Love")).setBounds(200, 70, 50, 30);
        }
    }

    public static void main(String[] args) {
        OpenChallenge9 openChallenge9 = new OpenChallenge9();
    }
}
