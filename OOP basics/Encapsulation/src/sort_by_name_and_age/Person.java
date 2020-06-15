package sort_by_name_and_age;

public class Person {
    //•	firstName: String
    //•	lastName: String
    //•	age: Integer
    //•	toString() - override
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return getFirstName () + " " + getLastName () + " is " + getAge () + " years old.";
    }

}
