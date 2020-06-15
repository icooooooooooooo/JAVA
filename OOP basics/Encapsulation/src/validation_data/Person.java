package validation_data;

import java.text.DecimalFormat;

public class Person {
    private final int MIN_NAME_LENGTH = 3;
    private final int LOWEST_AGE_ALLOWED = 1;
    private final int BONUS_BORDER_LINE = 30;
    private final double LOWEST_SALARY_ALLOWED = 460;

    //•	Names must be at least 3 symbols
    //•	Age must not be zero or negative
    //•	Salary can't be less than 460.0

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat df = new DecimalFormat ("#.0#########################");

    public Person() {

    }


    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName (firstName);
        setLastName (lastName);
        setAge (age);
        setSalary (salary);
    }

    public void salaryIncrease(int bonus) {
        if (this.age < BONUS_BORDER_LINE) {
            this.setSalary (this.getSalary () * (1.0 + ((double) bonus / 200)));
        } else if (this.age >= BONUS_BORDER_LINE) {
            this.setSalary (this.getSalary () * (1.0 + ((double) bonus / 100)));
        }
    }

    @Override
    public String toString() {
        return getFirstName () + " " + getLastName () + " gets " + df.format (getSalary ()) + " leva";
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String name) {
        if (name.length () <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException ("First name cannot be less than 3 symbols");
        }
        this.firstName = name;
    }

    public void setLastName(String name) {
        if (name.length () <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException ("Last name cannot be less than 3 symbols");
        }
        this.lastName = name;
    }

    public void setAge(int age) {
        if (age < LOWEST_AGE_ALLOWED) {
            throw new IllegalArgumentException ("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < LOWEST_SALARY_ALLOWED) {
            throw new IllegalArgumentException ("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }
}
