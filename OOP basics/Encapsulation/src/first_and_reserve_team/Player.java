package first_and_reserve_team;

public class Player {
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Player(String firstName, String lastName, int age, double salary) {
        setAge (age);
        setFirstName (firstName);
        setLastName (lastName);
        setSalary (salary);
    }
}
