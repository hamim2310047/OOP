import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    private JLabel jl;
    private JLabel jl2;
    private JButton jb;
    private JButton jb2;
    public void actionPerformed(ActionEvent A){
        if (A.getSource()==jb) {
            System.out.println("Done");
        }
        else if (A.getSource()==jb2) {
            System.out.println("Cancel");
        }
    }
    public GUI(){
        super("My Information");
        setSize(300,300);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl= new FlowLayout();
        Container cn= getContentPane();
        cn.setLayout(fl);
        JPanel jp = new JPanel();    
        jl= new JLabel("Name: ");
        add(jl);
        JTextArea jt= new JTextArea();
        add(jt);
        System.out.println();
        jl2= new JLabel("Address: ");
        add(jl2);
        JTextArea jt2= new JTextArea();
        add(jt2);
        
        jb= new JButton("Done");
        add(jb);
        jb.addActionListener(this);
        jb2= new JButton("Cancel");
        add(jb2);
        jb2.addActionListener(this);

        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}