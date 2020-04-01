import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int numThings = Integer.parseInt(scanner.nextLine());

        int spent = 0;
        for (int i = 1; i <= numThings; i++) {
            String item = scanner.nextLine();
            int price = 0; //define price

            switch (item) {
                case "hoodie":
                    price = 30;
                    budget-=price;
                    break;
                case "keychain":
                    price = 4;
                    budget-=price;
                    break;
                case "T-shirt":
                    price = 20;
                    budget-=price;
                    break;
                case "flag":
                    price = 15;
                    budget-=price;
                    break;
                case "sticker":
                    price = 1;
                    budget-=price;
                    break;
            }
        }
        if (budget >= spent) {
            System.out.printf("You bought %d items and left with %d lv.", numThings, budget - spent);
        } else {
            System.out.printf("Not enough money, you need %d more lv.",spent-budget);
        }
    }
}
