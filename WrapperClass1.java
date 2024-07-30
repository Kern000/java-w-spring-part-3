public class WrapperClass1 {
        // in java primitive data types are not objects, they do not extend java.lang.Object
    // array can store primitive data type
    // hashmap is like dictionary, can store primitive data types
    // collection can only store objects

    // The get around is have a Wrapper Class
    // int -> Integer
    // char -> Character
    // double -> Double
    // Wrapper classes extends the Object class
    // Autoboxing - boxing is storing primitive value and store in Wrapper Object
    // Auto-unboxing

    public static void main(String args[]){
        
        int num = 7;

        // This is boxing
        // Integer num1 = new Integer(8); //deprecated syntax
        // System.out.println(num1);

        // This is auto-boxing
        Integer num1 = num;
        System.out.println(num1 + " This has been wrapped in Integer class wrapper");

        // This is unboxing;
        int num2 = num1.intValue();
        System.out.println(num2 + " This has been unboxed");

        // Auto unboxing;
        int num3 = num1;
        System.out.println(num3 + " This has been auto-unboxed");

        String a = "5";
        Integer b = Integer.parseInt(a);
        System.out.println(b);
    }
}
