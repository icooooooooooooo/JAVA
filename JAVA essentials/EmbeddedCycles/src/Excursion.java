import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        double price = 0;
        String accomodation = null;
        String location = null;

        if (budget <= 100) {
            location = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                accomodation = "camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                accomodation = "hotel";
            }
        } else if (budget <= 1000 && budget > 100) {
            location = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                accomodation = "camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                accomodation = "hotel";
            }
        } else if (budget > 1000) {
            location = "Europe";
            price = budget * 0.9;
            accomodation = "hotel";
        }
        System.out.printf("Somewhere in %s ,\n", location);
        System.out.printf("%s, %.2f", accomodation, price);
    }


}

