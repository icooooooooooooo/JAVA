package event_implementation;

public class EventNameChange  {
    private String changedName;

    public EventNameChange(String changedName) {
        this.changedName = changedName;
    }

    public String getChangedName() {
        return this.changedName;
    }

}
