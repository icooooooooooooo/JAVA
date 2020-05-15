import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        OptionalDouble numbers = Arrays.stream (scan.readLine ().split ("\\s+"))
                .filter (x -> !x.isEmpty ())
                .mapToDouble (x -> Double.parseDouble (x))
                .average ();

        if (numbers.isPresent ()) {
            System.out.printf ("%.2f", numbers.getAsDouble ());
        } else {
            System.out.printf ("No match");
        }

        //System.out.println (numbers.isPresent () ? numbers.getAsDouble () : "No match");
    }
}
