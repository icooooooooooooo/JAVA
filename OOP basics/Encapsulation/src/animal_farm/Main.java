package animal_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        String name = scan.readLine ();
        int age = Integer.parseInt (scan.readLine ());

        Chicken chicken = null;
        try {
            chicken = new Chicken (name, age);
        } catch (IllegalArgumentException ex) {
            System.out.println (ex.getMessage ());
        }
        if (chicken != null) {
            System.out.println (chicken.toString ());
        }
    }
}
