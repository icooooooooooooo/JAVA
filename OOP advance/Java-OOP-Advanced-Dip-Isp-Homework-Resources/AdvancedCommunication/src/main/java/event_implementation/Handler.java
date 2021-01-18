package event_implementation;

public class Handler implements NameChangeListener {


    public void handleChangedName(EventNameChange event) {
        System.out.println(String.format("Dispatcher’s name changed to %s", event.getChangedName()));
    }
}
