import java.util.*;
public class For_loop {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(n + "X" + (i+1) + "=" + (n*(i+1)));
        }
        /*while (condition) {
            //statement
        }*/
        
        /*do {
            //statement
        } while (condition);*/
    }
}
