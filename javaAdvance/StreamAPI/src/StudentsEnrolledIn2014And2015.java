import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsEnrolledIn2014And2015 {
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
                .map (x -> x.split (" ", 2))
                .filter (x -> x[0].substring (4,6).equals ("14")||x[0].substring (4,6).equals ("15"))
                .forEach (x -> System.out.println (x[1]));

    }
}
