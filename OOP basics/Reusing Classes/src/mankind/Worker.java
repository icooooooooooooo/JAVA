package mankind;

import java.text.DecimalFormat;

public class Worker extends Human {
    private final int MIN_LAST_NAME_LENGHT_WORKER = 4;
    private final double MIN_WEEK_SALARY = 10;
    private final double MIN_WORK_HOURS = 1;
    private final double MAX_WORK_HOURS = 12;
    //Every worker has a week salary (7days) and work hours per day

    private double weekSalary;
    private double workHoursPerDay;
    private double salaryPerHour;
    private DecimalFormat df = new DecimalFormat ("#.##");

    public double getWeekSalary() {
        return weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }


    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super (firstName);
        this.setLastName (lastName);
        this.setWeekSalary (weekSalary);
        this.setWorkHoursPerDay (workHoursPerDay);
        this.setSalaryPerHour ();
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length () < MIN_LAST_NAME_LENGHT_WORKER) {
            throw new IllegalArgumentException ("Expected length more than 3 symbols!Argument: lastName");
        } else {
            super.setLastName (lastName);
        }
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary > MIN_WEEK_SALARY) {
            this.weekSalary = weekSalary;
        } else {
            throw new IllegalArgumentException ("Expected value mismatch!Argument: weekSalary");
        }
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay >= MIN_WORK_HOURS && workHoursPerDay <= MAX_WORK_HOURS) {
            this.workHoursPerDay = workHoursPerDay;
        } else {
            throw new IllegalArgumentException ("Expected value mismatch!Argument: workHoursPerDay");
        }

    }

    private void setSalaryPerHour() {
        double totalHours = 7 * this.workHoursPerDay;
        double salaryPerWeek = this.weekSalary;
        double salaryPerHour = salaryPerWeek / totalHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        /*
        •	Print the worker info in the following format:
        o	First Name: {worker's first name}
        o	Last Name: {worker's second name}
        o	Week Salary: {worker's salary}
        o	Hours per day: {worker's working hours}
        o	Salary per hour: {worker's salary per hour}
         */
        sb.append ("First Name: ").append (super.getFirstName ()).append (System.lineSeparator ());
        sb.append ("Last Name: ").append (super.getLastName ()).append (System.lineSeparator ());
        sb.append ("Week Salary: ").append (df.format (this.getWeekSalary ())).append (System.lineSeparator ());
        sb.append ("Hours per day: ").append (df.format (this.getWorkHoursPerDay ())).append (System.lineSeparator ());
        sb.append ("Salary per hour: ").append (df.format (this.getSalaryPerHour ())).append (System.lineSeparator ());


        return sb.toString ();

    }
}
