import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, Integer> students = new LinkedHashMap<> ();

        String input = scan.readLine ();
        while (!"END".equals (input)) {
            String[] data = input.split ("\\s+");

            StringBuilder name = new StringBuilder ();
            name.append (data[0]).append (" ").append (data[1]);
            int group = Integer.parseInt (data[2]);

            if (students.containsKey (name.toString ())) {
                students.replace (name.toString (), Integer.parseInt (data[2]));
            } else {
                students.put (name.toString (), group);
            }
            input = scan.readLine ();
        }

        students.entrySet ().stream ().filter (x -> x.getValue () == 2).sorted ((x, y) -> x.getKey ().compareTo (y.getKey ())).forEach (x -> System.out.printf ("%s\n", x.getKey ()));
    }
}
