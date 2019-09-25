package task;

public class Task {
    private String description;
    private boolean isDone;
    private String taskType;

    public Task(String description){ //whenever user keys in a TASK
        this.description = description; //THIS: differentiate Instance var from Local var
        this.isDone = false; //cross
    }


    public String getStatusIcon() { //this is a METHOD for STATUS ICON
        return (isDone ? "\u2713" : "\u2718"); //tick or cross
    }

    public String getDescription(){
        return description;
    }

    public String getTaskType(){
        return taskType;
    }

    public void setTaskType(String input){
        this.taskType = input;
    }

    public void markAsDone(){
        this.isDone = true; //tick
    }

    @Override
    public String toString(){
        return "[" + this.getStatusIcon() + "] " + this.description;
    }


}



//Task t = new Task("read book"); // instantiate new task as 't', of type Task.
//
//t.markAsDone();
