package ol.P04_DetailPrinter;

public class Employee extends BaseEmpolyee {
    private String name;

    public Employee(String name) {
        super(name);
    }

    public String details() {
        return toString();

    }
}
