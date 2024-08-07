
//check exceptions in Java must be caught - rep conditions outside prog control - like calling SQL
//ClassNotFoundException is a checked exception

class CustomException extends RuntimeException{
    public CustomException(String string){
        super(string);
    }
}

class A {
    public void show(){
        try{
            Class.forName("Meow"); // this exception is compulsory to handle
        } catch (ClassNotFoundException e){
            System.out.println("Not able to find class for A's show method " + e);
        }
    }
}

class B {
    public void show() throws ClassNotFoundException {
        Class.forName("moo");
    }
}

class C {
    public void show() throws ClassNotFoundException {
        Class.forName("meh");
    }
}


public class DuckException {

    static {
        System.out.println("Class loaded");
    }
    // static block is set of instr run once when class is loaded into memory
    // static initialization block

    // never put main throw exception (because is calling JVM to handle the exception)
    public static void main (String a[]){

        A obj = new A();
        obj.show();

        try {
            B obj1 = new B();
            obj1.show();
            
            C obj2 = new C();
            obj2.show();

        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find class " + e);

            e.printStackTrace(); //prints entire error stack
        }

    }


}
