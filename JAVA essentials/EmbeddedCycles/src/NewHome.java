import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double Roses = 5;
        double Dahlias = 3.8;
        double Tulips = 2.8;
        double Narcissus = 3;
        double Gladiolus = 2.5;

        double price = 0;

        switch (flowerType) {
            case "Roses":
                if (count >= 80) {
                    price = count * Roses * 0.9;
                } else {
                    price = count * Roses;
                }
                break;
            case "Dahlias":
                if (count >= 90) {
                    price = count * Dahlias * 0.85;
                } else {
                    price = count * Dahlias;
                }
                break;
            case "Tulips":
                if (count >= 80) {
                    price = count * Tulips * 0.85;
                } else {
                    price = count * Tulips;
                }
                break;
            case "Narcissus":
                if (count < 120) {
                    price = count * Narcissus * 1.15;
                } else {
                    price = count * Narcissus;
                }
                break;
            case "Gladiolus":
                if (count < 80) {
                    price = count * Gladiolus * 1.2;
                } else {
                    price = count * Gladiolus;
                }
                break;
        }

        if (budget>=price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,flowerType,(budget-price)); //error - unable to print past "with"
        } else if (budget<price) {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-price));
        }
    }
}
