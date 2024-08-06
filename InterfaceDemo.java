interface Computer {
    void code();
}

class Laptop implements Computer{

    @Override
    public void code(){
        System.out.println("Coding w laptop");
    }
}

class Desktop implements Computer{

    @Override
    public void code(){
        System.out.println("Coding w desktop");
    }
}

class Developer{
    public void developApp(Computer com){
        com.code();
    }
}


public class InterfaceDemo {

    public static void main(String a[]){

        Desktop desktop1 = new Desktop();
        Laptop laptop1 = new Laptop();

        Developer meow = new Developer();
        meow.developApp(desktop1);
        meow.developApp(laptop1);

        // Thus using this method, we can based on situation, use either desktop or laptop
        // Dev is dependent on Computer, not a desktop or laptop;
        // Can do the same with Abstract classes
    }
}


