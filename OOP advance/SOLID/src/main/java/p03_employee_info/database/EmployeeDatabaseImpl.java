package p03_employee_info.database;

import p03_employee_info.database.EmployeeDatabase;
import p03_employee_info.employee.BaseEmployee;
import p03_employee_info.employee.Employee;
import p03_employee_info.employee.EmployeeImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabaseImpl implements EmployeeDatabase {

    @Override
    public List<Employee> readEmployees() {
        List<Employee> baseEmployees = new ArrayList<>();
        Collections.addAll(baseEmployees,
                new EmployeeImpl("Pesho", 20),
                new EmployeeImpl("Gosho", 40));

        return baseEmployees;
    }
}
