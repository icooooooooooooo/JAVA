package p03_employee_info.formatter;

import p03_employee_info.employee.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
