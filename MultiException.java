// many -able are actually interfaces
// Runnable, Serializable, Cloneable
// Throwable however, is a class, it is the only exception;
// Throwable hv 2 sub-class - Exception and Error
// Exceptions are sth we can handle
// Errors cannot be handled; It will stop execution;
// e.g. ThreadDeath, IOError, virtual machine error (outofmemmory error);
// Exception -> runtime exception (Arithmetic, ArrayIndexOutOfBounds, NullPointer), SQLException, IOException
// All runtime exceptions are unchecked exception - SQLException and IOException are checked Exception which are compulsory to handle exception

public class MultiException {

    public static void main(String a[]){
        int i = 1;
        int j = 0;
        int[] nums = new int[5];
        String str = null;

        try {

            j = 18/i;
            System.out.println(nums[4]);
            System.out.println(str.length());

        } catch (ArithmeticException e) {

            System.out.println("Math error, cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Stay in array bounds.");

        } catch (NullPointerException e){

            System.out.println("Input cannot be null");

        } catch (Exception e){

            System.out.println("Something went wrong" + e);

        } 
        //Exception parent class should be at btm to handle other cases;

        System.out.println(j);  
        //notice this code runs, the exception was handled
    }

}
