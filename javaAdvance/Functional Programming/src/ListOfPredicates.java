import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int top = Integer.parseInt (scan.readLine ());
        int[] dividors = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();

        BiPredicate<Integer, int[]> predicate = (n, a) -> {
            boolean result = true;
            for (int e : a) {
                if (n % e == 0) {
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        };

        for (int i = 1; i <= top; i++) {
            if (predicate.test (i, dividors) == true) {
                System.out.print (i + " ");
            }
        }
    }
}
