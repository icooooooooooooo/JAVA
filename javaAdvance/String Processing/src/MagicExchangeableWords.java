import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MagicExchangeableWords {
    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String[] words = scanner.readLine ().split ("\\s+");
        char[] word1 = words[0].toCharArray ();
        char[] word2 = words[1].toCharArray ();

        int length = Math.min (word1.length, word2.length);
        int lengthMax = Math.max (word1.length, word2.length);

        Map<Character, Character> map = new HashMap<> ();

        boolean reversable = true;

        for (int i = 0; i < length; i++) {

            char key = word1[i];
            char value = word2[i];

            if (!map.containsKey (key)) {
                if (map.containsValue (value)) {
                    reversable = false;
                    //break;
                }
                map.put (key, value);
            } else if (map.containsKey (key)) {
                char temp = map.get (key);
                if (temp != value) {
                    reversable = false;
                    //break;
                }
            }

        }


        if (reversable = true) {

            if (word1.length != word2.length) {

                String word;
                String symbols;

                if (word1.length > word2.length) {
                    word = word1.toString ();
                    symbols = word1.toString ();
                } else {
                    word = word2.toString ();
                    symbols = word2.toString ();
                }

                for (int i = length; i < lengthMax; i++) {

                    boolean interChecker = word.contains (symbols.substring (i,i));
                    if (interChecker == false) {
                        reversable = false;
                    }
                }
            }
        }

        System.out.println (reversable);

    }
}
