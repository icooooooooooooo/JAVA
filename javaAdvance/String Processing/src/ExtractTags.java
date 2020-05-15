import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Pattern pattern = Pattern.compile ("<.*?>");

        String input = scanner.nextLine ();
        while (!"END".equals (input)) {

            Matcher matcher = pattern.matcher (input);
            while (matcher.find ()) {
                String match = matcher.group ();
                System.out.println (match);
                input = matcher.replaceFirst (" ");
                matcher = pattern.matcher (input);
            }

            input = scanner.nextLine ();
        }

    }
}
