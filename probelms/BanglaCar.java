interface Product {
    public String getProductName();
    public void produce();
}
class CentralLocking implements Product{
    String productName;
    public String getProductName(){
        return productName;
    }
    public void produce(){
        System.out.println("Producing Central Locking System");
    }
    CentralLocking(String productName){
        this.productName=productName;
    }
}
class Gearlocking implements Product{
    String productName;
    public String getProductName(){
        return productName;
    }
    public void produce(){
        System.out.println("Producing Gear Locking System");
    }
    Gearlocking(String productName){
        this.productName=productName;
    }
}
abstract class car{
    protected Product product;
    protected String cartype;
    car(Product product, String cartype){
        this.product=product;
        this.cartype=cartype;
    }
    void printDetails(){
        System.out.println("Car: "+cartype+", "+"Product: "+product.getProductName());
    }
    abstract void assemble();
    abstract void produceProduct();
}
class BMW extends car{
    BMW(Product product, String cartype){
        super(product, cartype);
    }
    void assemble(){
        System.out.println("Assembling "+product.getProductName()+" for "+cartype);
    }
    void produceProduct(){
        product.produce();
        System.out.println("Modifying product "+product.getProductName()+" according to "+cartype);
    }
}
class Mercedes extends car{
    Mercedes(Product p, String c){
        super(p, c);
    }
    void assemble(){
        System.out.println("Assembling "+product.getProductName()+" for "+cartype);
    }
    void produceProduct(){
        product.produce();
        System.out.println("Modifying product " + product.getProductName()+" according to "+cartype);
    }
}
public class BanglaCar {
    public static void main(String[] args){
        Product p = new CentralLocking("Central Locking system");
        Product p2 = new Gearlocking("Gear Locking system");

        car car = new BMW(p, "BMW X5 Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BMW(p2, "BMW X5 Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Mercedes(p, "Mercedes GLS Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Mercedes(p2, "Mercedes GLS Model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}