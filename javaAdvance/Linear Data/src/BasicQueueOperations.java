import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] commands = scanner.nextLine ().split ("\\s+");
        int pushes = Integer.parseInt (commands[0]);
        int polls = Integer.parseInt (commands[1]);
        int wantedNum = Integer.parseInt (commands[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<> ();
        String[] input = scanner.nextLine ().split ("\\s+");
        for (int i = 0; i < pushes; i++) {
            queue.add (Integer.parseInt (input[i]));
        }
        for (int i = 0; i < polls; i++) {
            queue.poll ();
        }
        if (queue.contains (wantedNum)) {
            System.out.println ("true");
        } else {
            System.out.println (smallest (queue));

        }

    }

    private static int smallest(ArrayDeque<Integer> queue) {
        int minNum = Integer.MAX_VALUE;

        if (queue.size () == 0) {
            minNum = 0;
        } else {
            for (int i = 0; i < queue.size (); i++) {
                int value = queue.poll ();
                if (value < minNum) {
                    minNum = value;
                }
            }
        }
        return minNum;
    }
}
