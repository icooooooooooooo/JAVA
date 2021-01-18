package p03_employee_info.engine;

import p03_employee_info.command_methods.EmployeeInfoProvider;
import p03_employee_info.command_methods.InfoProvider;
import p03_employee_info.database.EmployeeDatabase;
import p03_employee_info.formatter.Formatter;

public class ConsoleClient {
    private static final String commandPath = "p03_employee_info\\command_methods.";

    private EmployeeDatabase database;
    private InfoProvider info;
    private Formatter formatter;

    public ConsoleClient(EmployeeDatabase database, EmployeeInfoProvider employeeInfo, Formatter formatter) {
        this.database = database;
        this.info = employeeInfo;
        this.formatter = formatter;
    }

    public void output(String command) throws NoSuchMethodException {

        // TODO: 19/10/2020 set to work with reflection

        switch (command) {
            case "getEmployeesByName":
                System.out.println(this.info.getEmployeesByName());
                break;
            case "getEmployeesBySalary":
                System.out.println(this.info.getEmployeesBySalary());
                break;
            default:
                throw new NoSuchMethodException();
        }
    }
}
