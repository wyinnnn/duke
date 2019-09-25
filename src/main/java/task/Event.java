package task;

public class Event extends Task {

    protected String at;

    public Event (String description, String at){
        super (description); //super: refers to parent class
        this.at = at;//taking in date as a string
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}