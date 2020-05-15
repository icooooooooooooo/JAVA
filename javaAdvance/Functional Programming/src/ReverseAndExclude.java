import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] array = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();

        BiPredicate<Integer, Integer> predicate = (n, e) -> n % e != 0;
        int exclude = Integer.parseInt (scan.readLine ());

        for (int i = array.length - 1; 0 <= i; i--) {
            if (predicate.test (array[i], exclude)) {
                System.out.print (array[i] + " ");
            }
        }
    }
}
