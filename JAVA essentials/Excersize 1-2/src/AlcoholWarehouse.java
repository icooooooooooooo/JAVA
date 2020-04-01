import java.util.Scanner;

public class AlcoholWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyinLV = Double.parseDouble(scanner.nextLine());
        double beerL = Double.parseDouble(scanner.nextLine());
        double wineL = Double.parseDouble(scanner.nextLine());
        double rakiaL = Double.parseDouble(scanner.nextLine());
        double whiskeyL = Double.parseDouble(scanner.nextLine());

        double rakiaLv = whiskeyinLV/2;
        double wineLv = rakiaLv*0.60;
        double beerLv = rakiaLv*0.20;

        double totalsum = beerL*beerLv + wineL*wineLv+rakiaL*rakiaLv+whiskeyL*whiskeyinLV;

        System.out.println(String.format("%.2f",totalsum));
    }
}
