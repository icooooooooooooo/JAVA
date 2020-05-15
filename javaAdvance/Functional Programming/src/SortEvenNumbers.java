import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        List<Integer> numbers = Arrays.stream (scanner.readLine ().split (", "))
                .map (x -> Integer.parseInt (x))
                .collect (Collectors.toList ());

        numbers.removeIf (x -> x % 2 != 0);

        String output = "";

        for (Integer number : numbers) {
            output += (number.toString ().replaceAll ("[\\[\\]]", "") + ", ");
        }
        System.out.println (output.substring (0, output.length () - 2));

        numbers.sort ((a, b) -> a.compareTo (b));
        StringBuilder sb = new StringBuilder ();
        for (Integer number : numbers) {
            sb.append (number);
            sb.append (", ");
        }
        String sortedOutput = sb.toString ();
        System.out.println (sortedOutput.substring (0, sortedOutput.length () - 2));

    }
}
