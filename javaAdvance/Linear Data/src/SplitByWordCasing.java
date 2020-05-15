import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text = scanner.nextLine ();

        String[] words = text.split ("[ \\[\\],;\\\\:.!/()\"']+");


        List<String> lower = new ArrayList<> ();
        List<String> upper = new ArrayList<> ();
        List<String> mixed = new ArrayList<> ();

        for (String word : words) {
            boolean isMixed = false;
            for (int i = 0; i < word.length (); i++) {
                if (!Character.isLetter (word.charAt (i))) {
                    mixed.add (word);
                    isMixed = true;
                    break;
                }
            }

            if (!isMixed) {
                if (word.equals (word.toLowerCase ())) {
                    lower.add (word);
                } else if (word.equals (word.toUpperCase ())) {
                    upper.add (word);
                } else {
                    mixed.add (word);
                }
            }
        }

        System.out.printf ("Lower-case: %s \n", String.join (", ", lower));
        System.out.printf ("Mixed-case: %s \n", String.join (", ", mixed));
        System.out.printf ("Upper-case: %s \n", String.join (", ", upper));

    }
}
