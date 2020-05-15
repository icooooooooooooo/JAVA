import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt (scanner.nextLine ());

        ArrayDeque<Integer> stack = new ArrayDeque<> ();
        while (num > 0) {
            int remain = num % 2;
            stack.push (remain);
            num /= 2;
        }

        while (!stack.isEmpty ()) {
            System.out.print (stack.pop());
        }

    }
}
