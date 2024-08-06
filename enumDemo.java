enum Status {
    
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS;

}

// Enums provide constants - Enum is a class
// ea constant are objects of "Status" Enum here;
// Thus ea object can be used

public class enumDemo{
    
    public static void main(String a[]){

        Status s = Status.RUNNING;
        System.out.println(s); //prints RUNNING

        System.out.println(s.ordinal()); //This prints out its index in the Enum, returns 0 here as it is the first

        Status[] t = Status.values(); // gives all the constants
        // because it returns array, so need the array in typing
        for (Status item : t){
            System.out.println(item + " : " + item.ordinal());          
        }
        // enhanced for Loop, same as the below;

        System.out.println(t[0]);
        System.out.println(t[1]);
        System.out.println(t[2]);
        System.out.println(t[3]);
        

    }

}




