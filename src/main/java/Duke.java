import java.util.Scanner; //Importthe scanner class
import task.Task;


//JavaDoc should be in present tense


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

        Task[] myTasks = new Task[100]; //declare an array of Tasks; allocate mmr for 100 objs of type Task

        int i = 0;
        int index;

        while (1 == 1) {
            String userInput;
            userInput = myObj.nextLine(); //Read user input
            String[] Action = userInput.split(" "); // Action[1] is done, Action[2] is number



            if (userInput.equals("bye")) {
                System.out.println("Bye l0s3r c u again soon.");
                break;
            } else if (userInput.equals("list")) {
                System.out.println("Things in your list:");
                for (int j = 0; j < i; j++) {
                    System.out.println((j + 1) + ". " + "[" + myTasks[j].getStatusIcon() + "]" + myTasks[j].getDescription());
                }
            } else if (Action[0].equals("done")){
                int Number = Integer.parseInt(Action[1]); //change string to INT

                myTasks[Number - 1].markAsDone();
                System.out.println("Nice! I've marked this task as done:");
                System.out.println("[" + myTasks[Number -1].getStatusIcon() + "] " + myTasks[Number -1].getDescription());
            } else {
                //add into array

                myTasks[i] = new Task(userInput);
                System.out.println("added:" + userInput);

                i++;
            }
        }
    }
}
