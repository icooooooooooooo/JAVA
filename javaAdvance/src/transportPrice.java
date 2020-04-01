import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine();

        String night = "night";
        double taxiInitialTax = 0.7;

        double expense = 0.0;
        if (night.equals(period)) {
            if (distance < 20) {
                //TAXI 0.9
                expense = distance * 0.9 + taxiInitialTax;
            } else if (distance >= 20 && distance < 100) {
                //BUS 0.09
                expense = 0.09 * distance;
            } else if (distance >= 100) {
                //Train 0.06
                expense = 0.06 * distance;
            }
        } else {
            if (distance < 20) {
                //TAXI 0.79
                expense = distance * 0.79 + taxiInitialTax;

            } else if (distance >= 20 && distance < 100) {
                //BUS 0.09
                expense = distance * 0.09;
            } else if (distance >= 100) {
                //Train 0.06
                expense = distance * 0.06;

            }

        }
        System.out.printf("%.2f", expense);

    }
}
