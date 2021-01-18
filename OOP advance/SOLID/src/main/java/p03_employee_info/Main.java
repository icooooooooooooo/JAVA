package p03_employee_info;

import p03_employee_info.command_methods.EmployeeInfoProvider;
import p03_employee_info.database.EmployeeDatabase;
import p03_employee_info.database.EmployeeDatabaseImpl;
import p03_employee_info.engine.ConsoleClient;
import p03_employee_info.formatter.ConsoleFormatter;
import p03_employee_info.formatter.Formatter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        EmployeeDatabase database = new EmployeeDatabaseImpl();
        EmployeeInfoProvider employeeInfo = new EmployeeInfoProvider(database);
        Formatter formatter = new ConsoleFormatter();

        ConsoleClient engine = new ConsoleClient(database, employeeInfo, formatter);

        Scanner input = new Scanner(System.in);
        engine.output(input.nextLine());
    }
}
