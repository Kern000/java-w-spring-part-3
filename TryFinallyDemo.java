import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinallyDemo {
    
    public static void main(String a[]){

        int num = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try {

            System.out.println("Give a number:");
            num = Integer.parseInt(br.readLine());

            // everything after here in this scope will be skipped as we go to catch block as this throws exception

        } catch (NumberFormatException e){

            System.out.println("Something went wrong. " + e);
            e.printStackTrace();

        } catch (IOException e){

            System.out.println("Something went wrong. " + e);
            e.printStackTrace();

        } finally { //want something to run regardless - if go catch block, some code may be skipped

            try {
                br.close();
            } catch (IOException e){
                System.out.println("Buffered Reader error " + e);
            }
            System.out.println("Attempt completed");
            System.out.println(num);
            //whenever want to close the resource, that is where we will be using finally
        } 

    }


}
