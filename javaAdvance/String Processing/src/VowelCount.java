import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String text = scanner.nextLine ();

        Pattern pattern = Pattern.compile ("[AaOoUuEeIiYy]");
        Matcher matcher = pattern.matcher (text);

        int count = 0;
        while (matcher.find ()) {
            count += 1;
        }

        System.out.print ("Vowel :" + count);

    }
}
