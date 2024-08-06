// abstract method belong only to abstract class

abstract class Car{

    protected abstract void fly();
    protected abstract void drive();
    // Abstract tells us tt cars must have a drive method, but dunno what that method is yet;
    // The method will depend on the car model;
    // No compulsion that abstract class must hv abstract methods

    public void playMusic(){
        System.out.println("Play music");
    }

}

class WagonR extends Car {
    
    // if no fly and drive method here, will have error;
    @Override
    public void fly(){
        System.out.println("WagonR can fly!");
    }

    @Override
    public void drive(){
        System.out.println("WagonR 4 wheel drive");
    }

}

abstract class Toyoto extends Car {
    @Override
    public void drive(){
        System.out.println("Toyoto drive");
    }
}
// problem is that cannot create instance of Toyoto;

class ToyotaPrius extends Toyoto { //Known as concrete class (opposite of abstract class)

    @Override
    public void fly(){
        System.out.println("Prius can fly too");
    }
}

public class AbstractDemo {
    
    public static void main(String a[]){

        // cannot create instance of abstract class
        Car obj = new WagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
        System.out.println();

        Car obj1 = new ToyotaPrius();
        obj1.drive();
        obj1.fly();
    }

}
