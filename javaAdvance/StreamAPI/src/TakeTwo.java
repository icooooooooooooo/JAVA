import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Arrays.stream (scan.readLine ().split (" "))
                .mapToInt (x -> Integer.parseInt (x))
                .filter (x -> x >= 10 && x <= 20)
                .distinct ()
                .limit (2)
                .forEach (x -> System.out.print (x + " "));
        scan.close ();
    }
}
