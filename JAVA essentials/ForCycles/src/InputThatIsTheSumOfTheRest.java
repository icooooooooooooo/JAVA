import java.util.Scanner;

public class InputThatIsTheSumOfTheRest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int biggest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if (input > biggest) {
                biggest = input;
            }
        }
        if (biggest == (sum / 2)) {
            System.out.printf("Yes,\nSum = %d",biggest);
        } else {
            System.out.printf("No,\nDiff = %d",Math.abs(biggest-(sum-biggest)));
        }
    }
}