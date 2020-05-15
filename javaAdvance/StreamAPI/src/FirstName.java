import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        String[] names = scan.readLine ().split (" ");
        Set<String> sequence = Arrays.stream (scan.readLine ().split (" ")).collect (Collectors.toSet ());

        Optional<String> result = Arrays.stream (names)
                .filter (x -> sequence.contains (x.toLowerCase ().charAt (0)+""))
                .sorted ()
                .findFirst ();

        System.out.println (result.isPresent () ? result.get () : "No match");

    }
}
