import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUItest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(275,120);
        JTextField tx1= new JTextField(10);
        JTextField tx2= new JTextField(10);
        JButton jb = new JButton("SWAP");
        tx1.setBounds(10, 10, 100, 10);
        frame.add(tx1);
        tx2.setBounds(10, 10, 100, 10);
        frame.add(tx2);

        frame.setVisible(true);
    }
}
