import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] numbers = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();
        String command = scan.readLine ();

        while (!"end".equals (command)) {
            switch (command) {
                case "add":
                    numbers = Arrays.stream (numbers).map (a -> a + 1).toArray ();
                    break;
                case "multiply":
                    numbers = Arrays.stream (numbers).map (a -> a * 2).toArray ();
                    break;
                case "subtract":
                    numbers = Arrays.stream (numbers).map (a -> a - 1).toArray ();
                    break;
                case "print":
                    getPrint (numbers);
                    break;
            }
            command = scan.readLine ();
        }
        scan.close ();

    }

    private static void getPrint(int[] numbers) {
        Consumer<Integer> printMe = x -> {
            System.out.print (x + " ");
        };
        for (int number : numbers) {
            printMe.accept (number);
        }
    }
}
