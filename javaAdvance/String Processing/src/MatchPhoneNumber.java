import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String pat = "^\\+359([ -])\\d{1}\\1\\d{3}\\1\\d{4}$";
        Pattern pattern = Pattern.compile (pat);
        String input = scanner.readLine ();

        while (!"end".equals (input)) {
            Matcher matcher = pattern.matcher (input);
            if (matcher.find ()) {
                System.out.println (input);
            }
            input = scanner.readLine ();
        }
    }
}
