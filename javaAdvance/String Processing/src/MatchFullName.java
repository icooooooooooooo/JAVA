import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String pat = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        Pattern pattern = Pattern.compile (pat);

        String name = scanner.readLine ();
        while (!"end".equals (name)) {
            Matcher matcher = pattern.matcher (name);
            if (matcher.find ()){
                System.out.println (name);
            }
            name = scanner.readLine ();
        }

    }
}
