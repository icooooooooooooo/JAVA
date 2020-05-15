import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Integer[] numbers = Arrays.stream (scan.readLine ().split ("\\s+")).map (a -> Integer.parseInt (a)).toArray (Integer[]::new);


        //List<Integer> numbers = Arrays.stream (scan.readLine ().split ("\\s+")).map (a -> Integer.parseInt (a)).collect(Collectors.toList());


        Comparator<Integer> intComparator = (first, second) -> {

            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo (second);
            }
        };

        Arrays.sort (numbers, intComparator);

        for (Integer number : numbers) {
            System.out.print (number + " ");
        }
    }
}
