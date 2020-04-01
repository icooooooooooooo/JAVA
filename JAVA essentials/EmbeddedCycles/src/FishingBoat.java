import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        switch (season) {
            case "spring":
                price = 3000;

                break;
            case "summer":
                price = 4200;
                break;
            case "autumn":
                price = 4200;
                break;
            case "winter":
                price = 2600;
                break;
        }
        if (fisherman >= 4 && fisherman <= 6) {
            discount = 0.9;
        } else if (7 < fisherman && fisherman <= 11) {
            discount = 0.85;
        } else if (fisherman > 11 && fisherman <= 18) {
            discount = 0.75;
        } else if (fisherman < 4 || fisherman > 18) {
            System.out.printf("Wrong size of a group - needs to be between 4 and 18");
        }

        if (fisherman % 2 == 0 && !season.equals("autumn")) {
            price = price* 0.95;
        }
        if (budget>(price*discount)) {
            System.out.printf("Yes! You have " + (budget-(price * discount)) + " leva left");
        } else if ((price*discount)>budget) {
            System.out.printf("Not enough money! You need " + (Math.abs(budget - (price*discount))) + " leva.");
        }
    }
}
