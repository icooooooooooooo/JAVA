package event_implementation;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<NameChangeListener>();
    }

    public void addNameChangeListener(NameChangeListener listener) {
        this.listeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.listeners.remove(listener);
    }

    public void fireNameChangeListener(EventNameChange event) {
        for (NameChangeListener listener : this.listeners) {
            listener.handleChangedName(event);
        }
    }

    public void setName(String name) {
        this.name = name;
        EventNameChange event = new EventNameChange(name);
        this.fireNameChangeListener(event);
    }


}
