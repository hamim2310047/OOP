class Point {
 int x;
 int y;
}
class funtions{
  void swapPoint1(Point a, Point b){
    Point t=a;
    a=b;
    b=t;
  }

 void swapPoint2(Point a, Point b) {
 int x= a.x;
 int y= a.y;
 a.x=b.x;
 a.y=b.y;
 b.x=x;
 b.y=y;
 }}
 public class PointDemo{
 public static void main(String[] args) {
  funtions  fn= new funtions();
 Point p1 = new Point();
 p1.x=10;
 p1.y=15;
 Point p2= new Point();
 p2.x=20;
 p2.y=25;
fn.swapPoint1(p1, p2);
 System.out.println("(" + p1.x + ", " + p1.y + ")"); 
fn.swapPoint2(p1, p2);
 System.out.println("(" + p1.x + ", " + p1.y + ")"); // Question (i)

 }
}