@Deprecated
enum Laptop{

    MACBOOK(2000,1),
    XPS(2200,2),
    SURFACE(1800,3),
    THINKPAD(1500,1),
    DELL;

    private int price;
    private int warranty;

    private Laptop(){
        price = 1200;
        warranty = 1;
    }

    private Laptop(int price, int warranty){
        this.price = price;
        this.warranty = warranty;
        System.out.println(this.name());    // This will print out by default, the object name of the enum
    }
    // This constructor Laptop applies to all objects of Enum

    public int getPrice(){
        return price;
    }

    public int getWarranty(){
        return warranty;
    }

}





public class EnumDemo2 {
    public static void main(String a[]){

        // in enum ea is an object of the enum;
        for(Laptop lap : Laptop.values()){  //Laptop.values returns an Array
            System.out.println(lap + " : " + lap.getPrice() + " warranty: " + lap.getWarranty());
        }

        
    }
}
