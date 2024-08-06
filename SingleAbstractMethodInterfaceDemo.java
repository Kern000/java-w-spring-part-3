
// also known as functional interface
// has extra methods if only have one method (normal interface >2 methods, marker interface has no methods)
// all methods are public abstract in interface;

@FunctionalInterface //ensures only one method here
interface A {

    void show();

}
// Lamdda expression can only be used with functional interface

class B implements A {
    @Override
    public void show(){
        System.out.println("B's show");
    }
}

@FunctionalInterface
interface C {
    void show();
}
// showing usage of lambda expression

@FunctionalInterface
interface D {
    void show(int i);
}

@FunctionalInterface
interface E {
    int add(int i, int j);
}

public class SingleAbstractMethodInterfaceDemo {

    public static void main(String a[]){

        A obj1 = new B();
        obj1.show();
        // using class that implements A interface

        A obj2 = new A(){
            @Override
            public void show(){
                System.out.println("Functional interface show");
            }
        };
        obj2.show();
        // anonymous inner class

        C obj3 = ()-> System.out.println("C's show");
        obj3.show();

        // Lambda expression
        // Compiler noes we creating anon class to override and implement interface w only one method
        // it will override the only method in the interface
        // and becaues only 1 line, it doesn't need {}; if multiple lines will need {} for the method;
        // C obj3 = ()-> {System.out.println("C's show")};

        D obj4 = new D(){
            public void show(int i){
                System.out.println("in show D inner anon class" + " : " + i);
            }
        };
        obj4.show(5);

        D obj5 = i -> System.out.println("in show D inner anon class" + " : " + i);
        // Don't even need type
        // Don't even need (i) if one arg
        // Don't even need {} if one line of method

        obj5.show(10);

        E obj6 = new E(){
            public int add (int i, int j){
                return i+j;
            }
        };
        int result = obj6.add(5,10);
        System.out.println(result);

        E obj7 = (i, j) -> i + j; 
        int result2 = obj7.add(5,25);
        System.out.println(result2);
        //when only one line and want to return, don't need to write return

        E obj8 = (i, j) -> {
            return i + j; //same thing
        };
        int result3 = obj8.add(100, 100);
        System.out.println(result3);

    }
}
