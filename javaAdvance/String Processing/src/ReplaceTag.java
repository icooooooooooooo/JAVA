import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTag {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        StringBuilder sb = new StringBuilder ();
        String input = scanner.readLine ();

        while (!"END".equals (input)) {
            sb.append (input).append (System.lineSeparator ());
            input = scanner.readLine ();
        }

        Pattern pattern = Pattern.compile ("(<a)(\\s*href=.[^>]+)(>)(\\s*.*?)(<\\/a>)");
        String one = "[URL";
        String three = "]";
        String five = "[/URL]";
        Matcher matcher = pattern.matcher (sb);
        while (matcher.find ()) {
            String original = matcher.group (0);

            String modified = original.replaceFirst (matcher.group (1), one).replaceFirst (matcher.group (3), three).replaceFirst (matcher.group (5), five);

            String result = sb.toString ().replaceFirst (original, modified);
            System.out.println (result);
        }

    }
}
