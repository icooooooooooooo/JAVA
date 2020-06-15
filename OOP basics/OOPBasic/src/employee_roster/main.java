package employee_roster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        //Your task is to write a program which takes N lines of employees from the console
        int N = Integer.parseInt (scan.readLine ());

        List<Employee> employees = new ArrayList<> ();

        String input = scan.readLine ();
        while (--N > 0) {
            String[] raw = input.split ("\\s+");
            String name = raw[0];
            double salary = Double.parseDouble (raw[1]);
            String position = raw[2];
            String department = raw[3];

            int sequenceLength = raw.length;

            Employee employee = null;
            switch (sequenceLength) {
                case (4):
                    employee = new Employee (name, salary, position, department);
                    employees.add (employee);
                    break;
                case (5):
                    if (raw[4].matches ("\\d+")) {
                        int age = Integer.parseInt (raw[4]);
                        employee = new Employee (name, salary, position, department, age);
                        employees.add (employee);
                    } else {
                        String email = raw[4];
                        employee = new Employee (name, salary, position, department, email);
                        employees.add (employee);
                    }
                    break;
                case (6):
                    String email = raw[4];
                    int age = Integer.parseInt (raw[5]);
                    employee = new Employee (name, salary, position, department, email, age);
                    employees.add (employee);
                    break;
            }
            input = scan.readLine ();
        }


        // and calculates the department with the highest average salary
        // and prints for each employee in that department his name, salary, email and age –
        // sorted by salary in descending order.

        employees.stream ()
                .collect (Collectors.groupingBy (Employee::getDepartment))
                .entrySet ()
                .stream ()
                .sorted ((e1, e2) -> {
                    Double salAv1 = e1.getValue ().stream ()
                            .mapToDouble (x -> x.getSalary ())
                            .average ().getAsDouble ();
                    Double salAv2 = e1.getValue ().stream ()
                            .mapToDouble (x -> x.getSalary ())
                            .average ().getAsDouble ();

                    return salAv2.compareTo (salAv1);
                })
                .limit (1)
                .forEach (dep -> {
                    StringBuilder result = new StringBuilder ();
                    result.append (String.format ("Highest Average Salary: %s", dep.getKey ())).append (System.lineSeparator ());
                    dep.getValue ().forEach (employee -> result.append (String.format ("%s %.2f %s %d", employee.getName (), employee.getSalary (), employee.getEmail (), employee.getAge ())).append (System.lineSeparator ()));

                    System.out.println (result.toString ());
                });




        // If an employee doesn’t have an email – in place of that field you should print “n/a” instead,
        // if he doesn’t have an age – print “-1” instead.
        // The salary should be printed to two decimal places after the seperator.


    }
}

