enum Laptop{

    MACBOOK(2000),
    XPS(2200),
    SURFACE(1800),
    THINKPAD(1500);

    private int price;

    private Laptop(int price){
        this.price = price;
    }
    // This constructor Laptop applies to all objects of Enum

    public int getPrice(){
        return price;
    }

}





public class EnumDemo2 {
    public static void main(String a[]){
        Laptop lap1 = Laptop.MACBOOK;
        System.out.println(lap1);
        System.out.println(lap1.getPrice());
    }
}
