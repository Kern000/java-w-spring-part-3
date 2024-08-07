// Race Condition
// Multiple threads shld avoid using the same mutable data
// Work w data tt is immutable
// Thread safe - one thread can work tt at one point;

class Counter {

    int count;
    public synchronized void increment(){
        // synchronized means only one thread can work with this at a time
        count++;
    }
}


public class ThreadSafety {
    
    public static void main (String a[]){
        
        Counter c = new Counter();

        Runnable obj1 = () -> {

            for (int i=0; i < 1000; i++){                
                c.increment();
            }
        };
        // because Runnable only one method (run()) in interface, so is functional interface (SAM)

        Runnable obj2 = () -> {
            for (int i=0; i < 1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();

        try {
            // join() is sequencing of threads
            t1.join();  // join() allows one thread to wait until another thread completes its execution
            t2.join();  // t2 only runs after t1 completes
                        // main thread waits for t2 to complete before doing the System.out.println
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // With join, we wait for the two threads to finish
        // B4 join implementation, while t1 and t2 are incrementing, main prints count
        System.out.println(c.count);

        // But this is not enough to handle race condition
        // in count++, we are doing count=count+1; (E.g. they use the same count value at the same time);

    }

}

// Thread state
// 1. new state - created a new state (new Thread())
// 2. Runnable state - when do start(); - waiting for scheduler
// 3. Running state - only when thread running on CPU
// 4. Waiting / block state - sleep(); wait() ---> comeback with notify() which return it from wait to runnable (not running);
// 5. Dead state - stop() - Don't stop threads.















