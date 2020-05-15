import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));
        String text = scanner.readLine ();
        String key = scanner.readLine ();
        int keyLength = key.length ();

        int counter = 0;

        text = text.toLowerCase ();


        while (text.contains (key)) {

            StringBuilder textEdit = new StringBuilder (text);
            counter++;
            int location = text.indexOf (key);

            text = textEdit.deleteCharAt (location).toString ();

        }

        System.out.println (counter);
    }
}
