import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int N = Integer.parseInt (scan.readLine ());

        Deque<Deque<Integer>> waves = new ArrayDeque<> ();
        for (int i = 0; i < N; i++) {
            int[] waveRaw = Arrays
                    .stream (scan.readLine ().split ("\\s+"))
                    .mapToInt (Integer::parseInt)
                    .toArray ();

            Deque<Integer> wave = new ArrayDeque<> ();

            for (int j = 0; j < waveRaw.length; j++) {
                wave.add (waveRaw[j]);
            }
            waves.add (wave);
        }


        List<Integer> result = new ArrayList<> ();

        while (!waves.isEmpty ()) {
            Deque deque = waves.poll ();
            if (!deque.isEmpty ()) {
                int element = (int) deque.poll ();
                if (!deque.isEmpty ()) {
                    int compare = (int) deque.peek ();
                    while (element >= compare) {
                        deque.removeFirst ();
                        compare = (int) deque.peek ();
                    }
                }
                result.add (element);
            }

            if (!deque.isEmpty ()) {
                waves.add (deque);
            }

        }

        System.out.println (result.size ());
        result.stream ().forEach (x -> System.out.print (x + " "));
        System.out.println ("");
        System.out.println (String.join (" ",result.toString ().replaceAll ("[\\[\\],]","")));
    }
}
