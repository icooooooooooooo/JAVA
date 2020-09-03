package warning_levels;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger  {
    private List<Message> logger;

    public Logger() {
        this.logger = new ArrayList<>();
    }

    public void addMessage(String importance, Message message) {
        if (Enum.valueOf(Importance.class, importance.toUpperCase()).ordinal() <= message.getImportance().ordinal()) {
            logger.add(message);
        }

    }

    public Iterable<Message> getMessages() {
        return this.logger;
    }
}
