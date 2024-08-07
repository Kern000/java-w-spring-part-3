// java cannot extend multi-class

class A implements Runnable {

    @Override
    public void run(){
        for (int i=0; i < 5; i++){
            System.out.println("hi in A");
            try {
                Thread.sleep(10); //asking the thread to wait then continue;
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

class B implements Runnable {

    @Override
    public void run(){
        for (int i=0; i < 5; i++){
            System.out.println("hi in B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

public class ThreadRunnableDemo {
    
    public static void main (String a[]){
        
        Runnable obj1 = new A(); //Type can be interface, object of a class
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1); //constructor accepts a runnable object
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}
