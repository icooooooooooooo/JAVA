import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double money = Double.parseDouble(scanner.nextLine());
        int beerBottlesToBuy = Integer.parseInt(scanner.nextLine());
        int chipsPacksToBuy = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.2;
        double beers = beerBottlesToBuy * beerPrice;

        double chipsPrice = beers * 0.45;
        double chips = Math.ceil(chipsPacksToBuy * chipsPrice);

        if (money >= beers + chips) {
            System.out.printf("%s bought a snack and has %.2f leva left.\n", name, money - beers - chips);

        } else {
            System.out.printf("%s needs %.2f more leva!", name, Math.abs(money - beers - chips));
        }

    }
}
