package warning_levels;

public class Message {
    private Importance importance;
    private String message;

    public Message(String importance, String message) {
        this.importance = Enum.valueOf(Importance.class, importance.toUpperCase());
        this.message = message;
    }

    public Importance getImportance() {
        return importance;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", importance.name(), this.message);
    }

}
