import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        Pattern pattern = Pattern.compile ("(\\s|^){1}([a-zA-Z0-9]{1,}[-._]*)+(@)([a-zA-Z0-9]+[-.]*){1,}([.][a-zA-z]+)+(,|[.]| |$){1}");

        Set<String> set = new LinkedHashSet<> ();
        String input = scanner.readLine ();

        while ("end".equals (input) == false) {

            Matcher matcher = pattern.matcher (input);
            while (matcher.find ()) {
                StringBuilder sb = new StringBuilder ();

                sb.append (matcher.group (0));
                String address = sb.toString ();

                address = address.trim ();
                int size = address.length ();
                if (address.charAt (size - 1) == '.' || address.charAt (size - 1) == ',') {
                    address = address.substring (0, size - 1);
                }
                set.add (address);
            }
            input = scanner.readLine ();
        }

        for (String mail : set) {
            System.out.println (mail);
        }
    }
}
