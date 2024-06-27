import java.util.*;
public class If_else{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int num2 = sc.nextInt();
         if (num == num2) {
            System.out.printf("%d is Equal to %d",num,num2);
         }
         else if (num>num2) {
            System.out.printf("%d is greater than %d",num,num2);
         }
         else if (num<num2) {
            System.out.printf("%d is less than %d",num,num2);
         }
         else{
            System.out.printf("%d is Not equal to %d",num,num2);
         }
    }
}