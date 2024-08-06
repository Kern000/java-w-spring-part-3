// handling exceptions (runtime error)
// When encounter runtime error, program shld not stop

public class ExceptionDemo {

    public static void main(String a[]){

        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        } catch (Exception e) {
            //throws an Exception class obj once hv error
            System.out.println("Something went wrong. " + e.getMessage());
            if (e.getMessage().equals("/ by zero")){
                j = 18/1;
                System.out.println("j is now: " + j);
            }
        }

    }


}
