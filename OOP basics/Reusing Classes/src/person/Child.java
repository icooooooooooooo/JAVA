package person;

public class Child extends Person {
    private final int MAX_KID_AGE = 15;
    /*
    •	Child - represents a class which is derived by the class Person.
    o	Children should not be able to have age greater than 15
    */

    public Child(String name, int age) {
        super (name, age);
    }

    /*
    •	If the age of a child is bigger than 15 – exception’s message is: "Child's age must be lesser than 15!"
    */

    @Override
    protected void setAge(int age) throws IllegalArgumentException {
        super.setAge (age);
        if (age > MAX_KID_AGE) {
            throw new IllegalArgumentException ("Child's age must be lesser than 15!");
        } else {
            super.setAge (age);
        }

    }

}
