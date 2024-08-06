class MyCustomException extends Exception {

    public MyCustomException(String string){
        super(string);
    }
    // need to pass to the parent Exception constructor who accepts a string to create the exception msg

}

public class CustomException {
    public static void main (String a[]){
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j==0){
                throw new MyCustomException("This is custom exception message");
            }
        } catch (MyCustomException e){
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }

    }
    
}
