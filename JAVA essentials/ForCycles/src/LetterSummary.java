import java.util.Scanner;

public class LetterSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int sum = 0;

        for (int letterIndex = 0; letterIndex < word.length(); letterIndex++) {
            char currentLetter = word.charAt(letterIndex);

            switch (currentLetter) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }
        System.out.println(sum);
    }
}
