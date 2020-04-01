import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            int minBudget = Integer.parseInt(scanner.nextLine());
            int saved = 0;
            while (minBudget > saved) {
                saved += Integer.parseInt(scanner.nextLine());
            }
            System.out.printf("You are going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}