package google;

public class Parent {
    private static final String DEFAULT_VALUE = "";

    private String parentName;
    private String parentBirthday;


    @Override
    public String toString() {
        return parentName + " " + parentBirthday;
    }

    public Parent() {
        this.parentName = DEFAULT_VALUE;
        this.parentBirthday = DEFAULT_VALUE;
    }

    public Parent(String name, String birthday) {
        this.parentName = name;
        this.parentBirthday = birthday;
    }
}
