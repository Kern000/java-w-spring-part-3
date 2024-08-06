public class ThrowDemo {
    

    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (j ==0 ){
                throw new ArithmeticException("Result cannot be zero"); //this is the constructor
            }
        } catch (ArithmeticException e){

            // since we throw new error, the catch will catch it and handle it here         

            j = 18/1;
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("Something went wrong. " + e);
            // if cannot connect to primary DB, can try connect to 2ndary DB;
        }

        System.out.println(j);


    }
}
