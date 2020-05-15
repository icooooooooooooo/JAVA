import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int length = Integer.parseInt (scanner.nextLine ());

        String[] names = new String[length];

        for (int i = 0; i < length; i++) {
            names[i] = scanner.nextLine ();
        }
        int[] encryptedValues = new int[length];
        int counter = 0;

        for (String name : names) {

            int nameSize = name.length ();
            char[] nameArr = name.toCharArray ();
            int calculate = 0;

            for (int i = 0; i < nameArr.length; i++) {

                if (isVowel (nameArr[i])) {
                    calculate += nameArr[i] * nameSize;
                } else {
                    calculate += nameArr[i] / nameSize;

                }
                //counter in foreach loop - yes it could be written with a conventional for cycle
                if (i == nameArr.length - 1) {
                    encryptedValues[counter] = calculate;
                    counter++;
                    calculate = 0;
                }
            }
        }
        Arrays.sort(encryptedValues);

        for (int encryptedValue : encryptedValues) {
            System.out.println (encryptedValue);
        }

    }

    private static boolean isVowel(char letter) {
        boolean isVowelChar = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (letter == vowel) {
                isVowelChar = true;
                break;
            }
        }
        return isVowelChar;
    }
}
