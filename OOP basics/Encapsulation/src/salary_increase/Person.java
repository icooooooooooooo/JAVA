package salary_increase;

import java.text.DecimalFormat;

public class Person {
    //Read person with their names, age and salary
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat df = new DecimalFormat ("#.0####################");

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return getFirstName () + " " + getLastName () + " gets " + df.format (getSalary ()) + " leva";
    }

    public Person() {
    }

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName (firstName);
        setLastName (lastName);
        this.age = age;
        setSalary (salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonusPercent) {

        if (this.age >= 30) {
            this.setSalary (this.getSalary () * (1.0 + (bonusPercent / 100)));
        } else if (this.age < 30) {
            this.setSalary (this.getSalary () * (1.0 + (bonusPercent / 200)));
        }
    }
}
