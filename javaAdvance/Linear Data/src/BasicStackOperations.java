import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] commands = scanner.nextLine ().split ("\\s+");
        int inElements = Integer.parseInt (commands[0]);
        int outElements = Integer.parseInt (commands[1]);
        int wantedNumber = Integer.parseInt (commands[2]);
        String[] input = scanner.nextLine ().split ("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<Integer> ();

        for (int i = 0; i < inElements; i++) {
            // could be add - pop in this situation
            stack.push (Integer.parseInt (input[i]));
        }
        for (int i = 0; i < outElements; i++) {
            stack.pop ();
        }

        int minValue = Integer.MAX_VALUE;
        if (stack.contains (wantedNumber)) {
            System.out.printf ("true");
        } else {
            //method is an alternative, which will keep the stack integrity
            for (int i = 0; i < stack.size (); i++) {
                int value = stack.pop ();
                if (value<minValue){
                    minValue=value;
                }
            }
            System.out.println (minValue);
        }

    }
}
