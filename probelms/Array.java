import java.util.Random;

public class Array {
    public static void main(String[] args){
        int[] a ;
        a = new int[6];
        Random n = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]= n.nextInt(a.length);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
}
