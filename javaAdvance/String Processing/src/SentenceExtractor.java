import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String word  = scanner.readLine ();
        String text = scanner.readLine ();

        Set<String> sentances = new LinkedHashSet<> ();

        Pattern pattern = Pattern.compile ("(^| ){1}([a-zA-Z0-9 ]+)[is]{2,}([a-zA-Z0-9 ]+)([.]|[?]|[!]){1}");

        Matcher matcher = pattern.matcher (text);
        while (matcher.find ()){
            sentances.add (matcher.group (0).trim ());
        }

        for (String sentance : sentances) {
            System.out.println (sentance);
        }
    }
}
