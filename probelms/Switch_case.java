import java.util.*;
public class Switch_case{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();

       switch (x) {
        case 1:
            System.out.println("Hi");
            break;
        case 2:
            System.out.println("Hello");
            break;
        case 3:
            System.out.println("Bye");
            break;    
        default:
            System.out.println("Invalid");
            break;
       }
    }
}