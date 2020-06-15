package salary_increase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1.Read person with their names, age and salary.

        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Person> people = new ArrayList<> ();

        int N = Integer.parseInt (scan.readLine ());
        String input = scan.readLine ();
        while (N-- > 0) {
            String[] raw = input.split ("\\s+");
            String firstName = raw[0];
            String lastName = raw[1];
            int age = Integer.parseInt (raw[2]);
            double salary = Double.parseDouble (raw[3]);

            Person person = new Person (firstName, lastName, age, salary);
            people.add (person);

            input = scan.readLine ();
        }

        //2.Read percent bonus to every person salary.
        double bonus = Double.parseDouble (input);

        //3.Persons younger than 30 get half bonus.
        for (Person person : people) {
            person.increaseSalary (bonus);
        }
        //4.Print
        people.stream ().forEach (p-> System.out.println (p.toString ()));

    }
}
