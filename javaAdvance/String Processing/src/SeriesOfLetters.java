import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        char[] word = scanner.nextLine ().toCharArray ();

        StringBuilder wordNew = new StringBuilder ();
        int index = 0;
        int stage = 0;
        char current = 0;
        char previous = 0;

        while (index < word.length) {

            switch (stage) {
                case 0:
                    previous = word[index];
                    stage = 1;
                    break;
                case 1:
                    current = word[index];
                    wordNew.append (previous);
                    if (previous == current) {
                        stage = 2;
                    }
                    previous = current;
                    break;
                case 2:
                    current = word[index];
                    if (previous != current) {
                        stage = 1;
                    }
                    previous = current;
                    break;
            }
            index++;

        }
        System.out.print (wordNew.toString ());
    }
}
