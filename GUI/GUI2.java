import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI2 extends JFrame implements ActionListener{
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    public void actionPerformed(ActionEvent A){
        if (A.getSource()==b4) {
          
        b2.setText("3");
        b3.setText("2");
                  
        }
        else if (A.getSource()==b1) {
           
            b2.setText("2");
            b3.setText("3");
        
        }
    }
    public GUI2(){
        JFrame frame = new JFrame("My app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        Container c= getContentPane();
        GridLayout gl= new GridLayout(2,2);
        c.setLayout(gl);

        b1= new JButton("1");
        add(b1);
        b1.addActionListener(this);
        b2= new JButton("2");
        add(b2);
        b3= new JButton("3");
        add(b3);
        b4= new JButton("4");
        add(b4);
        b4.addActionListener(this);

        
        setVisible(true);
    }
    public  static void main(String[] args) {
        new GUI2();
    }
}
