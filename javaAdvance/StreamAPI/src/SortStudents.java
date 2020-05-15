import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<String> names = new ArrayList<> ();

        String input = scan.readLine ();
        while (!"END".equals (input)) {
            names.add (input);
            input = scan.readLine ();
        }

        names.stream ()
                .map (x -> x.split (" "))
                .sorted ((x, y) -> y[0].compareTo (x[0]))
                .sorted ((x, y) -> x[1].compareTo (y[1]))
                .forEach (x -> System.out.printf (String.join (" ", x[0], x[1]) + "\n"));


    }
}
