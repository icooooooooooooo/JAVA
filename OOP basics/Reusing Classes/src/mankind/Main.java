package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));


        String[] studentRaw = scan.readLine ().split ("\\s+");

        String fName = studentRaw[0];
        String lName = studentRaw[1];
        String fNum = studentRaw[2];
        Student student = null;
        try {
            student = new Student (fName, lName, fNum);
            System.out.printf (student.toString ());

        } catch (IllegalArgumentException ex) {
            System.out.println (ex.getMessage ());
        }

        String[] workerRaw = scan.readLine ().split ("\\s+");
        fName = workerRaw[0];
        lName = workerRaw[1];
        double weekSalary = Double.parseDouble (workerRaw[2]);
        double hoursPerDay = Double.parseDouble (workerRaw[3]);

        Worker worker = null;

        try {
            worker = new Worker (fName, lName, weekSalary, hoursPerDay);
            System.out.printf (worker.toString ());

        } catch (IllegalArgumentException ex) {
            System.out.println (ex.getMessage ());
        }


    }
}
