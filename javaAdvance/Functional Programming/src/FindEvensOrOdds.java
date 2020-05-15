import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Integer> bounderies = Arrays.stream (scan.readLine ().split ("\\s+")).map (x -> Integer.parseInt (x)).collect (Collectors.toList ());

        int start = bounderies.get (0);
        int end = bounderies.get (1);

        String condition = scan.readLine ();

        Predicate<Integer> even = x -> x % 2 == 0;
        Predicate<Integer> odd = x -> x % 2 != 0;

        List<Integer> numbers = new LinkedList<> ();
        while (start <= end) {
            numbers.add (start);
            start++;
        }

        for (Integer number : numbers) {
            if ("odd".equals (condition) && odd.test (number)) {
                System.out.printf (number.toString () + " ");
            } else if ("even".equals (condition) && even.test (number)) {
                System.out.printf (number.toString () + " ");

            }
        }
    }
}

