import java.util.*;

public class arr_prblm19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int a = sc.nextInt();
        int[] arr2= new int[a];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.print(arr[i]+" ");
                }
            }  
        }
        sc.close();
    }
}
