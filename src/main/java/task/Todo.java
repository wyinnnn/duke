package task;

public class Todo extends Task {

    protected String by;

    public Todo (String description){
        super (description); //super: refers to parent class
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
