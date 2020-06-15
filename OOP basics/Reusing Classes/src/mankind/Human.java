package mankind;

public class Human {
    private final int MIN_FIRST_NAME_LENGHT = 4;
    private final int MIN_LAST_NAME_LENGHT = 3;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Human(String firstName) {
        setFirstName (firstName);
    }

    public Human(String firstName, String lastName) {
        setFirstName (firstName);
        setLastName (lastName);
    }

    public void setFirstName(String name) {
        if (name.length () >= MIN_FIRST_NAME_LENGHT) {
            if (Character.isUpperCase (name.charAt (0))) {
                this.firstName = name;
            } else {
                throw new IllegalArgumentException ("Expected upper case letter!Argument: firstName");
            }

        } else {
            throw new IllegalArgumentException ("Expected length at least 4 symbols!Argument: firstName");
        }
    }

    protected void setLastName(String name) {
        if (name.length () >= MIN_LAST_NAME_LENGHT) {
            if (Character.isUpperCase (name.charAt (0))) {
                this.lastName = name;
            } else {
                throw new IllegalArgumentException ("Expected upper case letter!Argument: lastName");
            }

        } else {
            throw new IllegalArgumentException ("Expected length at least 3 symbols!Argument: lastName");
        }

    }
}
