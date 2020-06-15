package employee_roster;

public class Employee {
    // If an employee doesn’t have an email – in place of that field you should print “n/a” instead,
    // if he doesn’t have an age – print “-1” instead.

    private static final String DEFAULT_EMAIL = "n/a";
    private static final int DEFAULT_AGE = -1;

    //Define a class Employee that holds the following information: name, salary, position, department, email and age.
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
// The name, salary, position and department are mandatory while the rest are optional.

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = DEFAULT_EMAIL;
        this.age = DEFAULT_AGE;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this (name, salary, position, department);
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this (name, salary, position, department);
        this.email = DEFAULT_EMAIL;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this (name, salary, position, department);
        this.email = email;
        this.age = DEFAULT_AGE;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

}
