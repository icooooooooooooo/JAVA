import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String[] words = scanner.readLine ().split ("[\\s,?.!]+");


        Set<String> palindromes = new TreeSet<> ();

        for (String word : words) {
            boolean checker = isPalindrom (word);
            if (checker == true) {
                palindromes.add (word);
            }
        }
        for (String palindrome : palindromes) {
            System.out.println (palindrome);
        }

    }

    public static boolean isPalindrom(String word) {
        boolean state = false;

        StringBuilder wordIn = new StringBuilder (word);
        wordIn.reverse ();

        if (word.equals (wordIn.toString ())) {
            state = true;
        }
        // slow   int length = word.length ();
        // slow   int loopLength = length / 2;
        // slow
        // slow   for (int i = 0; i < loopLength; i++) {
        // slow       if (word.charAt (i) != word.charAt (loopLength - 1 - i)) {
        // slow           state = false;
        // slow           break;
        // slow       }
        // slow    }

        return state;
    }
}
