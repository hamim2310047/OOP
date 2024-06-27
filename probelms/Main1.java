class Exam{
    int i = 10;
    public Exam(int j){
        j=j*2;
        this.i=j*10;
    }
}
class MTest extends Exam{
    public MTest(int j){
        super(j);
        System.out.println(i);
        this.i=j*20;
    }
}
public class Main1 {

    public static void main(String[] args) {
       MTest n = new MTest(4);
       System.out.println(n.i);
    }
}