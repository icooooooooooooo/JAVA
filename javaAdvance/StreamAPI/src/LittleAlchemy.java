import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] input = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();

        Queue<Integer> queue = new ArrayDeque ();
        for (int i = 0; i < input.length; i++) {
            queue.add (input[i]);
        }

        queue.remove ()
    }
}
