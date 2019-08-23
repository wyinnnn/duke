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

        //add to array
        String[] myList = new String[100]; //declare an array of strings
        //arr = new myList[100]; //allocate mmr for 100 objs of type myList


        String Bye = "bye";
        int i = 0;

        while (1 == 1) {
            String userInput;
            userInput = myObj.nextLine(); //Read user input
            if (userInput.equals(Bye)) {
                System.out.println("Bye l0s3r c u again soon.");
                break;
            } else if (userInput.equals("list")) {
                for (int j = 0; j < i; j++) {
                    System.out.println((j + 1) + ". " + myList[j]);
                }
            } else {
                //add into array
                myList[i] = userInput;
                System.out.println("added:" + userInput);
                i++;
            }
        }
    }
}
