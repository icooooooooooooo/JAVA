import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String[] text = scanner.readLine ().split (" ");

        Predicate<String> isUpCase = x -> x.charAt (0) >= 60 && x.charAt (0) <= 90;
        ArrayDeque<String> deque = new ArrayDeque<> ();
        for (String word : text) {
            if (isUpCase.test (word)) {
                deque.add (word);
            }
        }
        System.out.println (deque.size ());
        while (!deque.isEmpty ()) {
            System.out.println (deque.poll ());
        }

    }
}
