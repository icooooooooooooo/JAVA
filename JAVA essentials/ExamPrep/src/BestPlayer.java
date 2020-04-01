import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();

        int maxgoals = 0;
        String bestPlayer = "notKnown";

        while (!"END".equals(player)) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxgoals) {
                maxgoals = goals;
                bestPlayer = player;
            }
            player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!", bestPlayer);

        if (maxgoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxgoals);
        } else {
            System.out.printf("He has scored %d goals.", maxgoals);

        }
    }
}
