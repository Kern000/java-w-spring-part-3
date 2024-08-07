public class RunnableAnon {
    
    public static void main (String a[]){
        
        Runnable obj1 = () -> {

            for (int i=0; i < 5; i++){
                System.out.println("hi in A");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        // because Runnable only one method (run()) in interface, so is functional interface (SAM)

        Runnable obj2 = () -> {
            for (int i=0; i < 5; i++){
                System.out.println("hi in B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1); //constructor accepts a runnable object
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}

