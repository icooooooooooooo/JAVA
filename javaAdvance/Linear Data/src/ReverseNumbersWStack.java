import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine ().split (" ");
        ArrayDeque stack = new ArrayDeque ();

        int length = input.length;

        for (int i = 0; i < length; i++) {
            stack.push (input[i]);
        }
        for (int i = 0; i < length; i++) {
            System.out.print (stack.pop () + " ");
        }

    }
}
