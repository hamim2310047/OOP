import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] str= new String[4];
        for (int i = 0; i < 4; i++) {
            str[i]=sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(str.length-1)%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        sc.close();

    }
}
