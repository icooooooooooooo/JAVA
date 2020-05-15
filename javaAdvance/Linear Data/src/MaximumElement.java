import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int lines = Integer.parseInt (scanner.nextLine ());
        ArrayDeque<Integer> stack = new ArrayDeque<> ();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine ().split ("\\s+");
            int command = Integer.parseInt (input[0]);

            switch (command) {
                case 1:
                    int value = Integer.parseInt (input[1]);
                    stack.add (value);
                    break;
                case 2:
                    stack.pop ();
                    break;
                case 3:
                    System.out.println (maxElement (stack));
                    break;
            }
        }
    }

    private static int maxElement(ArrayDeque<Integer> stack) {

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < stack.size (); i++) {
            int value = stack.pop ();
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}
