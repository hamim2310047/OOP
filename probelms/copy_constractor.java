 class copy_constractor {
    public static void main(String[] args) {
        Inner P = new Inner(10, 20);
        System.out.println("1st:");
        System.out.println(P.geta());
        System.out.println(P.getb());

        Inner P2 = new Inner(P);
        System.out.println("new object:");
        System.out.println(P2.geta());
        System.out.println(P2.getb());
        
        System.out.println("After change:");
        P2.seta(30);
        System.out.println(P2.geta());
        P2.setb(40);
        System.out.println(P2.getb());
        System.out.println("1st constractor:");
        System.out.println(P.geta());
        System.out.println(P.getb());

    } 
}
/**
 * Innercopy_constractor
 */
 class Inner {
    private int a;
    private int b;
    public int geta(){
        return a;
    }
    public void seta(int w){
        a=w;
    }
    public void setb(int r){
        b=r;
    }
    public int getb(){
        return b;
    }
    public Inner(int a, int b){
        this.a= a;
        this.b= b;
    }
    public Inner(Inner X){
        this.a= X.geta();
        this.b= X.getb();
    }
}