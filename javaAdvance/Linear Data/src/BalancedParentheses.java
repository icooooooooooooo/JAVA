import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayDeque<String> queue = new ArrayDeque<> ();

        String[] input = scanner.nextLine ().split ("");
        boolean filler = Collections.addAll (queue, input);

        boolean isSimetrical = true;

        if (queue.size () % 2 == 0) {
            while (true) {
                if (queue.isEmpty ()) {
                    break;
                }
                String start = queue.removeFirst ();
                String end = queue.removeLast ();

                //logic error - rework, as this is not equal
                isSimetrical = isSimetricalValidation (start, end);
            }
        }

        if (isSimetrical = true) {
            System.out.printf ("YES");
        } else {
            System.out.printf ("NO");
        }
    }

    private static boolean isSimetricalValidation(String start, String end) {

        switch (start) {
            case "{":

                break;

        }
    }
}
