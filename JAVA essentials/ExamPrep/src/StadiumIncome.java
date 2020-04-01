import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sectors = Integer.parseInt(scanner.nextLine());
        int totalSeats = Integer.parseInt(scanner.nextLine());
        double ticket = Double.parseDouble(scanner.nextLine());

        System.out.printf("Total income - %.2f BGN\n", totalSeats * ticket);
        System.out.printf("Money for charity - %.2f BGN", 0.125 * ((totalSeats * ticket) - (0.75 * (totalSeats * ticket / sectors))));
    }
}
