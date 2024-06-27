import java.util.Scanner;
public class Find_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] array= new float[8];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextFloat();
        }
        int index=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    array[j]= -5;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((int)array[i]);
        }
    }
}
