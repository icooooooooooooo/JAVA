package person;

public class Person {
    private final int MIN_AGE = 1;
    private final int MIN_NAME_LENGTH = 3;

    private String name;
    private int age;

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }
/*
    •	Person – represents the base class by which all others are implemented
    o	People should not be able to have negative age
     */

    public Person(){

    }

    public Person(String name, int age){
        this.setName (name);
        this.setAge (age);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName () + ", Age:" + this.getAge ();
    }


    //•	If the age of a person is negative – exception’s message is: "Age must be positive!"
    protected void setAge(int age) throws IllegalArgumentException {
        if (age >= MIN_AGE) {
            this.age = age;
        } else {
            throw new IllegalArgumentException ("Age must be positive!");
        }
    }

    //•	If the name of a child or a person is less than 3 symbols – exception’s message is: "Name's length should not be less than 3 symbols!"
    private void setName(String name) throws IllegalArgumentException {
        if (name.length () >= MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            throw new IllegalArgumentException ("Name's length should not be less than 3 symbols!");
        }
    }
    /*
•	If the age of a child is bigger than 15 – exception’s message is: "Child's age must be lesser than 15!"
     */
}
