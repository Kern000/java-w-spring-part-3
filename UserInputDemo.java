
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String a[]){

        // System.out.println("Enter a number: ");     // println is method of printstream
                                                    // out is object of printStream
                                                    // this object is created as static variable of System class (with the type PrintStream)
                                                    // ctrl click to see
    
        // In system, there is Input Stream object initialized under the static variable "in";
        try {

            // Method 1: not optimal
            // int num = System.in.read();     //checked exception: IO exception
            // System.out.println(num -48);    // This only works for 0-9, 0 starts at ASCII code of 48
                                            // System.in.read gives ASCII value for the number entered
                                            // read() only reads 1 character
            // =======================================            

            // Method 2: old method;
            // System.out.println("Enter Input: ");
            // InputStreamReader in = new InputStreamReader(System.in);    // problem is this obj also need input stream reader
            // BufferedReader br = new BufferedReader(in);                 // if want read, need to pass in the "in" object
            // int num1 = Integer.parseInt(br.readLine());                 // With buffered reader now can use ReadLine();
            // System.out.print(num1);
            // br.close(); // need to close the resource
            
            // Method 3 after Java 1.5:
            Scanner sc = new Scanner(System.in); //To specify where we getting the input from
            System.out.println("Enter first number: ");
            int num2 = sc.nextInt();
            sc.nextLine();              //consume newline leftover
            System.out.println(num2);

            System.out.println("Enter a string: ");
            String string1 = sc.nextLine();
            System.out.println(string1);

            sc.close();

        // } catch (IOException e) {
        //     e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    
    }
}

// When using BufferedReader, we are opening a resource
// when open a network, it is our resp to close it;
// when open a database connection, it is our resp to close it;
// if not we are leaking resources, file, data;


