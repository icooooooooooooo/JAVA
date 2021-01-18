package p03_employee_info.command_methods;

import java.util.List;

public interface InfoProvider<T> {
    List<T> getEmployeesByName();

    List<T> getEmployeesBySalary();
}
