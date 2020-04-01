import java.util.Scanner;

public class AccountBallance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double amounth = 0;
        double total = 0;

        while (count-- > 0) {
            amounth = Double.parseDouble(scanner.nextLine());
            total += amounth;
            System.out.printf("Increase %.2f \n",amounth);
        }
        System.out.printf("Total is : %.2f",total);
    }
}


