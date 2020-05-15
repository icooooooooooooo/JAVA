import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String[] input = scanner.readLine ().split (", ");


        if (input.length < 2) {
            System.out.printf ("Count = \n", input.length);
            System.out.printf ("Sum = \n", input[0]);

        } else {
            Function<String, Integer> function = x -> Integer.parseInt (x);

            int sum = 0;
            for (String s : input) {
                sum += function.apply (s);
            }
            System.out.printf ("Count =%d \n", input.length);
            System.out.printf ("Sum = %d \n", sum);
        }
    }
}
