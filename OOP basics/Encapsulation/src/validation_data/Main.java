package validation_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int N = Integer.parseInt (scan.readLine ());
        List<Person> people = new ArrayList<> ();
        while (N-- > 0) {
            String[] input = scan.readLine ().split ("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt (input[2]);
            double salary = Double.parseDouble (input[3]);
            Person person = null;
            try {
                person = new Person (firstName, lastName, age, salary);
            } catch (Exception ex) {
                System.out.println (ex.getMessage ());
            }
            if (person != null) {
                people.add (person);
            }
        }

        int bonus = Integer.parseInt (scan.readLine ());

        for (Person person : people) {
            person.salaryIncrease (bonus);
            System.out.println (person.toString ());
        }

    }
}
