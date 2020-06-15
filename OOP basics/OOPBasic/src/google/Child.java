package google;

public class Child {
    private static final String DEFAULT_VALUE = "";

    private String childName;
    private String childBirthday;

    @Override
    public String toString() {
        return childName + " " + childBirthday;
    }

    public Child() {
        this.childName = DEFAULT_VALUE;
        this.childBirthday = DEFAULT_VALUE;
    }

    public Child(String name, String birthday) {
        this.childName = name;
        this.childBirthday = birthday;
    }


}
