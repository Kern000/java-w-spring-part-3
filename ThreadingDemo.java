
class A extends Thread {

    @Override
    public void run(){
        for (int i=0; i < 1000; i++){
            System.out.println("hi in A");
        }
    }

}

class B extends Thread {

    @Override
    public void run(){
        for (int i=0; i < 1000; i++){
            System.out.println("hi in B");
        }
    }

}

public class ThreadingDemo {
    
    public static void main (String a[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); //start thread (belong to thread class)
        obj2.start(); //start thread

        // Every thread must hv a run method;
        // pass to java Scheduler - allow a thread to execute (Timesharing)
    }

}
