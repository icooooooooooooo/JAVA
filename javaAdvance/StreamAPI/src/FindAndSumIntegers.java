import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Optional<Integer> numbers = Arrays.stream (scan.readLine ().split ("\\s+"))
                .filter (x -> !x.isEmpty ())
                .filter (x -> {
                    try {
                        Integer.parseInt (x);
                        return true;
                    } catch (Exception e) {
                       // System.out.printf ("Invalid input ");
                        return false;
                    }
                })
                .map (x -> Integer.parseInt (x))
                .reduce ((x, y) -> x + y);

        if (numbers.isPresent ()){
            System.out.print (numbers.get ());
        } else{
            System.out.print ("No match");
        }

    }
}
