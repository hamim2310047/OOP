public class con_pub_private {
    public static void main(String[] args){
        InnerTest in = new InnerTest(10);
        System.out.println(in.geti());
        System.out.println(in.add());
    }
}
class InnerTest {

    private int i;
    public int geti(){
        return i;
    }
    public InnerTest(int i){
        this.i=i;
    }
    public int add(){
        return i*i;
    }
}