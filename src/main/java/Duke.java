import java.util.Scanner; //Importthe scanner class

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("What can I do for you :^DD");

        //do the thing
        Scanner myObj = new Scanner(System.in); //create a scanner object

        String Bye = "bye";
        while(1 == 1){
            String userInput;
            userInput = myObj.nextLine(); //Read user input
            if (userInput.equals(Bye)) {
                System.out.println("Bye l0s3r c u again soon.");
                break;
            } else {
                System.out.println(userInput);
            }
    }
}}
