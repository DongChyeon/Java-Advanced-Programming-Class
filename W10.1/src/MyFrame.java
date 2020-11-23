import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("hello");
        setSize(200, 300);
        setVisible(true);
    }
    public static void main(String [] args) {
        MyFrame frame = new MyFrame();
    }
}
