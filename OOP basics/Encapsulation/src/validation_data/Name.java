package validation_data;

public class Name {
    private final int MIN_NAME_LENGTH = 3;
    private String name;

    public void setName(String name) {
        if (name.length () <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException ("Too short");
        }
        setName (name);
    }

    public String getName() {
        return this.name;
    }
}
