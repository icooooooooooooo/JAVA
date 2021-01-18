package ol.P04_DetailPrinter;

public class DetailsPrinter {

    private Iterable<BaseEmpolyee> employees;

    public DetailsPrinter(Iterable<BaseEmpolyee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (BaseEmpolyee employee : employees) {
            System.out.println(employee.details());
        }
    }
}
