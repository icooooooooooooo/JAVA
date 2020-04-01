import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int achievedSteps = 0;
        int goal = 10000;
        int steps = 0;

        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            steps = Integer.parseInt(input);
            achievedSteps += steps;
            if (achievedSteps >= goal) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            steps = Integer.parseInt(scanner.nextLine());
            achievedSteps+=steps;
            System.out.println();
        }
        if (achievedSteps>=goal) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal",Math.abs(goal-achievedSteps));
        }
    }
}
