import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        String[] names = scan.readLine ().split ("\\s+");
        for (String name : names) {
            Consumer<String> printer = getPrint (name);
            getPrint (name).accept (name);
        }
    }

    public static Consumer<String> getPrint(String name) {
        return x -> System.out.println ("Sir " + x);
    }
}
