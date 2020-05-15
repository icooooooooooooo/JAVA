import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<String> names = new ArrayList<> ();

        String input = scan.readLine ();

        while (!"END".equals (input)) {
            String[] data = input.split ("\\s+");

            String name = data[0];
            String surName = data[1];

            names.add (name + " " + surName);
            input = scan.readLine ();
        }

        names.stream ()
                .filter (x -> {
                   String[] n =  x.split (" ");
                    char nameFirst = n[0].charAt (0);
                    char surNameFirst = n[1].charAt (0);
                    if (nameFirst <= surNameFirst) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .forEach (x -> System.out.printf ("%s\n", x));
    }
}
