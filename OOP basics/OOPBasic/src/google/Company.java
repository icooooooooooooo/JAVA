package google;

public class Company {
    private static final String DEFAULT_STRING_VALUE = "";
    private static final double DEFAULT_DOUBLE_VALUE = -1;

    private String companyName;
    private String department;
    private double salary;

    public String getCompanyName(){
        return this.companyName;
    }

    @Override
    public String toString() {
        return companyName + " " + department + " " + salary;
    }

    public Company() {
        this.companyName = DEFAULT_STRING_VALUE;
        this.department = DEFAULT_STRING_VALUE;
        this.salary = DEFAULT_DOUBLE_VALUE;
    }

    public Company(String name, String department, Double salary) {
        this.companyName = name;
        this.department = department;
        this.salary = Double.parseDouble (String.format ("%.2f", salary));
    }
}
