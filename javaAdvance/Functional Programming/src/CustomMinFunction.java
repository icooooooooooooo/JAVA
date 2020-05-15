import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Integer> numbers = Arrays.stream (scan.readLine ().split (" "))
                .map (x -> Integer.parseInt (x))
                .collect (Collectors.toList ());

        Function<List<Integer>, Integer> function = array -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.size () - 1; i++) {
                if (array.get (i) < min) {
                    min = array.get (i);
                }
            }
            return min;
        };

        System.out.println (function.apply (numbers));
    }
}
