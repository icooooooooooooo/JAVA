import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] arr = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();
        int min = 0;

        BiConsumer<int[], Integer> consume = (a, m) -> {
            if (a.length == 1) {
                System.out.println (0);

            } else {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] < a[m]) {
                        m = i;
                    }
                }
                System.out.println (m);
            }
        };
        consume.accept (arr, min);

    }
}
