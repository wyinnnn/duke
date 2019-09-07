import java.util.Scanner; //Importthe scanner class

//class



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
        String[] myList = new String[100]; //declare an array of strings; allocate mmr for 100 objs of type myList
        String[] Status = new String [100];

        String Bye = "bye";
        String tick ="✓";
        String cross = "✗";
        int i = 0;
        int index;

        while (1 == 1) {
            String userInput;
            userInput = myObj.nextLine(); //Read user input
            String[] Action = userInput.split(" "); // Action[1] is done, Action[2] is number



            if (userInput.equals(Bye)) {
                System.out.println("Bye l0s3r c u again soon.");
                break;
            } else if (userInput.equals("list")) {
                System.out.println("Things in your list:");
                for (int j = 0; j < i; j++) {
                    System.out.println((j + 1) + ". " + "[" + Status[j] + "]" + myList[j]);
                }
            } else if (Action[0].equals("done")){
                int Number = Integer.parseInt(Action[1]); //PROBLEM
                Status[Number - 1] = tick;
                System.out.println("Nice! I've marked this task as done:");
                System.out.println("[" + Status[Number -1] + "] " + myList[Number -1]);
            } else {
                //add into array
                myList[i] = userInput;
                System.out.println("added:" + userInput);
                Status[i] = cross;
                i++;
            }
        }
    }
}
