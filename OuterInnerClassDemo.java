class A {

    public void show(){
        System.out.println("Showing from A");
    }

    class B{
        public void config(){
            System.out.println("inner class here");
        }
    }

    static class C{
        public void config(){
            System.out.println("static inner class here");
        }
    }
    // static only can be used for inner class

}

abstract class D {

    public abstract void show();
    public abstract void config();

}

interface E {

    int serviceLevel = 55; // this is static and final, need assign value;
    String area = "United Kingdom";

    void show();
    void config();
}
// methods and interfaces are by default public abstract;
// interface A is a type (though not a class);
// Interface is just a design of something (abstract class is like blueprint structure)
// variables in interface are by default final and static;
// You only get the methods in implements, not the variables;

class F implements E {
    @Override
    public void show(){
        System.out.println("F implement E show");
    }

    @Override
    public void config(){
        System.out.println("F implement E config");
    }
}


public class OuterInnerClassDemo {
    public static void main(String a[]){
        
        A obj = new A();
        obj.show();
        // non static method

        A.B obj1 = obj.new B();

        // first needs an object A to call instance of B as it is non-static Class
        obj1.config();

        A.C obj2 = new A.C();
        obj2.config();

        A obj3 = new A(){

            @Override
            public void show(){
                System.out.println("New show in instance");
            }
            //This is anonymous inner class, compiles a new class file Demo$1
        };
        obj3.show();

        D obj4 = new D(){
            @Override
            public void show(){
                System.out.println("in new D");
            }

            @Override
            public void config(){
                System.out.println("in D config");
            }
        };
        obj4.show();
        obj4.config();
        // can use anonymous inner class to create abstract class instance

        E obj5; //interface can put as type, but cannot instantiate, a class must implement it

        F obj6 = new F();
        obj6.show();
        obj6.config();
        
        System.out.println(E.area); //because static variable, can use directly without instantializing
        System.out.println(E.serviceLevel);
    }
}



