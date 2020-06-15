package Person3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        //Using the Person class, write a program that reads from the console N linesof personal information and
        int n = Integer.parseInt (scan.readLine ());
        List<Person> people = new ArrayList<> ();
        String input = scan.readLine ();
        while (n > 1) {
            String[] raw = input.split ("\\s+");
            String name = raw[0];
            int age = Integer.parseInt (raw[1]);
            Person person = new Person (name, age);

            people.add (person);

            n--;
            input = scan.readLine ();
        }

        // then prints all people whose age is more than 30 years, sorted in alphabetical order.
        people.stream ()
                .filter (x -> x.getAge () > 30)
                .sorted ((x, y) -> x.getName ().compareTo (y.getName ()))
                .forEach (x -> System.out.println (String.format ("%s - %d", x.getName (), x.getAge ())));

    }

}
