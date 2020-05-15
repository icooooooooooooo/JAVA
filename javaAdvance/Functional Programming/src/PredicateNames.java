import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;

public class PredicateNames {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        int length = Integer.parseInt (scan.readLine ());

        String[] names = scan.readLine ().split ("\\s+");


        BiPredicate<String, Integer> checker = (n, l) -> n.toCharArray ().length <= l;

        for (String name : names) {
            if (checker.test (name,length)){
                System.out.println (name);
            }

        }
    }
}
