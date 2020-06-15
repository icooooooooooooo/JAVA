import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascend {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Pattern pattern = Pattern.compile ("([,|_])([A-Za-z]+)([0-9]{1})");
        String input = scan.readLine ();
        while (!"Ascend".equals (input)) {
            String text = input;
            Matcher matcher = pattern.matcher (text);
            while (matcher.find ()) {
                String raw = matcher.group (0);
                String encrypted = matcher.group (2);
                String decrypted = decrypt (raw, encrypted);
                text = text.replaceFirst (raw, decrypted);
                matcher = pattern.matcher (text);
            }

            System.out.println (text);
            input = scan.readLine ();
        }
    }


    private static String decrypt(String raw, String encrypted) {
        StringBuilder word = new StringBuilder ();

        int size = encrypted.length ();

        String stepTrans = raw.charAt (raw.length () - 1) + "";
        int step = Integer.parseInt (stepTrans);

        char direction = raw.charAt (0);

        switch (direction) {
            case ',':
                for (int i = 0; i < size; i++) {
                    int element = encrypted.charAt (i) + step;
                    char symbol = (char) element;
                    word.append (symbol);
                }
                break;
            case '_':
                for (int i = 0; i < size; i++) {
                    int element = encrypted.charAt (i) - step;
                    char symbol = (char) element;
                    word.append (symbol);
                }
                break;
        }
        String output = word.toString ();
        return output;
    }
}
