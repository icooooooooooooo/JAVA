import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String user = scanner.nextLine ();
        Pattern pattern = Pattern.compile ("^[a-zA-Z0-9-_*]{3,16}$");

        while (!"END".equals (user)) {

            Matcher matcher = pattern.matcher (user);
            if (matcher.find ()) {

                System.out.println ("valid");

            }else {
                System.out.println ("invalid");

            }
            user = scanner.nextLine ();
        }
    }
}
