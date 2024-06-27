import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Converter extends JFrame implements ActionListener {
    JFrame jf;
    JTextField tx1;
    JTextField tx2;
    JLabel jl1;
    JLabel jl2;
    JButton jb1;
    JButton jb2;
    public void actionPerformed(ActionEvent A){
        double inch=0.00;
        double foot=0.00;
        if (A.getSource()==jb1) {
            inch= Integer.parseInt(tx1.getText())*12.00;
            tx2.setText(String.valueOf(inch));
        }
        else if (A.getSource()==jb2) {
            foot= Double.parseDouble(tx2.getText())/12.00;
            tx1.setText(String.valueOf(foot));
        }
    }
    public Converter(){
        jf= new JFrame();
        setTitle("Converter");
        setSize(350, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jl1= new JLabel("FOOT");
        jl1.setBounds(30, 50, 60, 20);
        add(jl1);
        tx1= new JTextField();
        tx1.setBounds(80, 50, 150, 20);
        add(tx1);

        jb1= new JButton("Convert to inch");
        jb1.setBounds(30, 100, 150, 20);
        add(jb1);
        jb2= new JButton("Convert to Foot");
        jb2.setBounds(155, 100, 150, 20);
        add(jb2);

        jl2 = new JLabel("Inch");
        jl2.setBounds(30, 150, 60, 20);
        add(jl2);
        tx2= new JTextField();
        tx2.setBounds(80, 150, 150, 20);
        add(tx2);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Converter();
        
    }
}
