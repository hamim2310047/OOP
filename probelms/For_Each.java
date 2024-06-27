public class For_Each {
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("using for each loop");
        for (int X : a) {
            X=X*2;
            System.out.println(X);
        }
        System.out.println("unchanged");
        for (int X : a) {
            System.out.println(X);
        }
    }   
}
