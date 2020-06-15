package Person;

public class Person {
    private static String DEFAULT_NAME = "No name";
    private static int DEFAULT_AGE = 1;

    private String name;
    private int age;

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


    public Person(String name) {
        this ();
        this.name = name;
    }
    //•	The third one should accept a string for the name and an integer for the age and should produce a person with the given name and age.


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }
}