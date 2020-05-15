import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String[] banned = scanner.readLine ().split (", ");
        String text = scanner.readLine ();

        for (int i = 0; i < banned.length; i++) {
            String word = banned[i];
            String censorship = replacer(word);
            while (text.contains (word)){
                text=text.replaceFirst (word,censorship);
            }
        }

        System.out.print (text);
    }

    public static String replacer (String word){

        int length = word.length ();
        StringBuilder censured = new StringBuilder ();
        for (int i = 0; i < length ; i++) {
            censured.append ("*");
        }

        return censured.toString ();
    }
}
