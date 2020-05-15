import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Arrays.stream (scan.readLine ().split (" "))
                .filter (x->!x.isEmpty ())
                .map (x -> x.toUpperCase ())
                .forEach (x -> System.out.print (x + " "));
    }
}
