import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, Integer> students = new LinkedHashMap<> ();
        String input = scan.readLine ();
        while (!"END".equals (input)) {
            String[] raw = input.split ("\\s+");
            StringBuilder name = new StringBuilder ();
            name.append (raw[0]).append (" ").append (raw[1]);
            int age = Integer.parseInt (raw[2]);

            students.put (name.toString (), age);
            input = scan.readLine ();
        }

        students.entrySet ()
                .stream ()
                .filter (x->x.getValue ()>=18&&x.getValue ()<=24)
                .forEach (x-> System.out.printf ("%s %d\n",x.getKey (),x.getValue ()));


    }
}
