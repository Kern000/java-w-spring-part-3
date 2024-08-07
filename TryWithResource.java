import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    
    public static void main(String a[]){

        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // by putting the resource br in the try(); it will close by itself when block is completed
            // By looking at the chain of classes, can see that it is autocloseable;

            System.out.println("Give a number:");
            num = Integer.parseInt(br.readLine());

            // everything after here in this scope will be skipped as we go to catch block as this throws exception

        } catch (NumberFormatException e){

            System.out.println("Something went wrong. " + e);
            e.printStackTrace();

        } catch (IOException e){

            System.out.println("Something went wrong. " + e);
            e.printStackTrace();

        } finally {

            System.out.println("Attempt completed");
            System.out.println(num);
        } 

    }


}
