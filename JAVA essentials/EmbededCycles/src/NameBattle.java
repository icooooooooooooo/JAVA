import java.util.Scanner;

public class NameBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String winnerName = "";
        int winnerScore = 0;

        while (!"STOP".equals(name)) {

            int lenght = name.length();
            int score = 0;

            for (int i = 0; i < lenght; i++) {
                score += name.charAt(i);
            }

            if (winnerScore < score) {
                winnerScore = score;
                winnerName = name;
            }

            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s, with score %d", winnerName, winnerScore);
    }

}
