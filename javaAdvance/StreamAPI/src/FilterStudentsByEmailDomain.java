import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, String> students = new LinkedHashMap<> ();

        String input = scan.readLine ();
        while (!"END".equals (input)) {
            String[] raw = input.split ("\\s+");
            StringBuilder name = new StringBuilder ();
            name.append (raw[0]).append (" ").append (raw[1]);

            students.put (name.toString (), raw[2]);
            input = scan.readLine ();
        }

        scan.close ();
        students.entrySet ().stream ()
                .filter (x -> x.getValue ().trim ().endsWith ("@gmail.com"))
                .forEach (x -> System.out.println (x.getKey ()));

    }
}
