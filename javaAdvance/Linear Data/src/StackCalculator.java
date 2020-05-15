import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StackCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine ().split ("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<> ();
        Collections.addAll (stack, input);

        while (stack.size () > 1) {
            int first = Integer.parseInt (stack.pop ());
            String operand = stack.pop ();
            int second = Integer.parseInt (stack.pop ());

            if ("+".equals (operand)) {
                int result = first + second;
                stack.push(result+"");
            } else {
                int result = first - second;
                stack.push(result+"");
            }
        }
        System.out.println (stack.peek ());
    }
}
