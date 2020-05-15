import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Integer> boundaries = Arrays.stream (scan.readLine ().split ("\\s+")).map (Integer::parseInt).sorted ().collect (Collectors.toList ());
        int[] numbers = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();
        scan.close ();

        int lower = boundaries.get (0);
        int upper = boundaries.get (1);

        Arrays.stream (numbers).filter (x -> x >= lower && x <= upper).forEach (x -> System.out.printf ("%d ", x));
    }
}
