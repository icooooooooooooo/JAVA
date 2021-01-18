package p03_employee_info.database;

import p03_employee_info.employee.BaseEmployee;
import p03_employee_info.employee.Employee;

import java.util.List;

public interface EmployeeDatabase {

    public List<Employee> readEmployees();
}
