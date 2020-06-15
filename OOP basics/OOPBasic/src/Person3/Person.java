package Person3;

public class Person {
    private static String DEFAULT_NAME = "No name";
    private static int DEFAULT_AGE = 1;

    //Define a class Person with private fields for name and age
    private String name;
    private int age;

    //Add 3 constructors to the Person class from the last task, use constructor chaining to reuse code:
    //•	The first should take no arguments and produce a person with name “No name” and age = 1.
    public Person() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }

    //•	The second should accept only an integer number for the age and produce a person with name “No name” and age equal to the passed parameter.
    public Person(int age) {
        this ();
        this.age = age;
    }

    //•	The third one should accept a string for the name and an integer for the age and should produce a person with the given name and age.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //•	Create getters and setters.
    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

}
