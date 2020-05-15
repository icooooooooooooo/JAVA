import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));
        String input = scanner.readLine ();
        StringBuilder word = new StringBuilder (input);

        for (int i = 0; i < word.length (); i++) {

            String hex = String.format ("%04x", word.codePointAt (i));

            System.out.print ("\\u" + hex);
        }


    }
}
