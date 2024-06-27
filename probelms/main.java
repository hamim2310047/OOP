 class Parent {
 public static int count = 0;
 public static void printDetails(){
 count++;
 System.out.println("I am in Parent Class: " + count);
 }
}
 class Child extends Parent{
 public static void printDetails()
 {
 count++;
 System.out.println("I am in a Child Class: " + count);
 }
}
public class main {
 public static void main(String[] args) {
 Child x = new Child();
 x.printDetails();
 x.printDetails();
 Parent y = new Parent();
 y.printDetails();
 Child.printDetails();
 Parent.printDetails();
 x.printDetails();
 }
}