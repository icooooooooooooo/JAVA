import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] stoneInput = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();

        Queue<Integer> stones = new ArrayDeque ();
        for (int i = 0; i < stoneInput.length; i++) {
            stones.add (stoneInput[i]);
        }

        int goldQuantity = 0;
        String command = scan.readLine ();
        while (true) {
            if ("Revision".equals (command)) {
                break;
            }
            String[] raw = command.split ("\\s+");
            StringBuilder operationBuilder = new StringBuilder ();

            int acid = Integer.parseInt (raw[2]);
            String operation = operationBuilder.append (raw[0]).append (" ").append (raw[1]).toString ().trim ();

            switch (operation) {
                case "Apply acid":
                    while (acid != 0) {
                        int rockSize = stones.poll () - 1;
                        if (rockSize == 0) {
                            goldQuantity += 1;
                        } else {
                            stones.add (rockSize);
                        }
                        acid -= 1;
                    }
                    break;
                case "Air leak":
                    if (goldQuantity != 0) {
                        stones.add (acid);
                        goldQuantity -= 1;
                    }
                    break;
            }
            command = scan.readLine ();
        }
        scan.close ();

        stones.stream ().map (x -> x.toString ()).forEach (x -> System.out.print (x + " "));
        System.out.print ("\n" + goldQuantity);
    }
}
