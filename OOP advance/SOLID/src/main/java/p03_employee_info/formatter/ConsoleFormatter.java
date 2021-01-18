package p03_employee_info.formatter;

import p03_employee_info.employee.BaseEmployee;
import p03_employee_info.employee.Employee;

public class ConsoleFormatter implements Formatter {

    @Override
    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();

        for (Employee baseEmployee : employees) {
            sb.append(baseEmployee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
