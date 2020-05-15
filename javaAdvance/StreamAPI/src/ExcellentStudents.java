import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ExcellentStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<String> students = new ArrayList<> ();

        String input = scan.readLine ();
        while (!"END".equals (input)) {

            students.add (input);
            input = scan.readLine ();
        }

        scan.close ();

        students.stream ()
                .map (x -> x.split (" ", 3))
                .filter (x -> x[2].contains ("6"))
                .forEach (x -> System.out.println (String.join (" ", x[0], x[1])));


    }
}
