
class A extends Thread {

    @Override
    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println("hi in A");
            try {
                Thread.sleep(10); //asking the thread to wait then continue;
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

class B extends Thread {

    @Override
    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println("hi in B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

public class ThreadPriorityDemo {
    
    public static void main (String a[]){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        // priority goes 1 to 10 (10 is highest); 5 is default;

        obj2.setPriority(Thread.MAX_PRIORITY); //not like will execute all of the obj2 first - only suggest when there is congestion
        obj1.setPriority(6);

        obj1.start();
        obj2.start();

    }

}
