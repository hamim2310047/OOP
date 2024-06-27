import javax.swing.*;
public class Swing {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter Name :");
        JOptionPane.showMessageDialog(null, "Hello" + name);
    }
}
 