enum Status {
    
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS;

    // enum can define variables, methods, constructors, but cannot extend enum
    // By default enum obj extends enum class hence you get all those default methods
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
        // enhanced for Loop

        Status currentStatus = Status.PENDING;
        // if (currentStatus == Status.RUNNING){
        //     System.out.println("All is good");
        // } else if (currentStatus == Status.PENDING){
        //     System.out.println("Pending, may need to check");
        // } else if (currentStatus == Status.SUCCESS){
        //     System.out.println("Task completed");
        // } else {
        //     System.out.println("Failed to complete");
        // }

        // switch(currentStatus){
        //     case RUNNING:
        //         System.out.println("All is good");
        //         break;
        //     case PENDING:
        //         System.out.println("Pending, check back in a while");
        //         break;
        //     case SUCCESS:
        //         System.out.println("Done");
        //         break;
        //     case FAILED:
        //         System.out.println("Task failed");
        //         break;
        //     default:
        //         System.out.println("Uncaught exception");
        //         break;
        // }

        // rule switch
        switch(currentStatus){
            case RUNNING -> System.out.println("All is good");
            case PENDING -> System.out.println("Pending, check back in a while");
            case SUCCESS -> System.out.println("Done");
            case FAILED -> System.out.println("Task failed");
            default -> System.out.println("Uncaught exception");
        }

        System.out.println(currentStatus.getClass());
        System.out.println(currentStatus.getClass().getSimpleName());
        System.out.println(currentStatus.getClass().getSuperclass());
        System.out.println(currentStatus.getClass().getSuperclass().getSimpleName());
        
    
    
    
    }

}




