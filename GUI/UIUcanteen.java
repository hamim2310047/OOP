import javax.swing.*;
import java.awt.event.*;

public class UIUcanteen extends JFrame {

    JTextField tx1,tx2,tx3,tx4,tx5,tx6;
    JButton b1;

    public UIUcanteen(){
        JFrame f= new JFrame();
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl= new JLabel("First Name");
        jl.setBounds(10, 30, 80, 30);
        f.add(jl);
        tx1= new JTextField();
        tx1.setBounds(90, 30, 80, 30);
        f.add(tx1);

        

        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new UIUcanteen();
    }
}
