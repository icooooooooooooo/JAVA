import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fruit\nday\ncount");
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double count = Double.parseDouble(scanner.nextLine());

        if (day.equals("sunday") || day.equals("saturday")) {
            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", count * 2.7);
                    break;
                case "apple":
                    System.out.printf("%.2f", count * 1.25);
                    break;
                case "orange":
                    System.out.printf("%.2f", count * 0.90);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", count * 1.6);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", count * 3);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", count * 5.6);
                    break;
                case "grapes":
                    System.out.printf("%.2f", count * 4.2);
                    break;
                default:
                    System.out.println("wrong input");
            }
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    System.out.printf("%.2f", count * 2.5);
                    break;
                case "apple":
                    System.out.printf("%.2f", count * 1.2);
                    break;
                case "orange":
                    System.out.printf("%.2f", count * 0.85);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f", count * 1.45);
                    break;
                case "kiwi":
                    System.out.printf("%.2f", count * 2.7);
                    break;
                case "pineapple":
                    System.out.printf("%.2f", count * 5.5);
                    break;
                case "grapes":
                    System.out.printf("%.2f", count * 3.85);
                    break;
                default:
            }
                System.out.println("wrong input");
        } else {
            System.out.println("error");

        }
    }
}
