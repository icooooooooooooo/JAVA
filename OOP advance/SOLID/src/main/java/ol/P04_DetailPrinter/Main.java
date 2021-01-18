package ol.P04_DetailPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseEmpolyee> employees = new ArrayList<BaseEmpolyee>();
        Manager manager = new Manager("Steve", new ArrayList<String>() {{
            add("daily manual");
            add("sick leave appeals");
            add("coaching manual");
            add("action plan manual");
        }});
        Employee employee = new Employee("Goshko");
        BaseEmpolyee employee2 = new Employee("Goshko");
        WarehousePersonel warehousePersonel = new WarehousePersonel("Stamat", "Crates");

        employees.add(employee);
        employees.add(employee2);
        employees.add(manager);
        employees.add(warehousePersonel);

        DetailsPrinter detailsPrinter = new DetailsPrinter(employees);

        detailsPrinter.printDetails();

    }

}
