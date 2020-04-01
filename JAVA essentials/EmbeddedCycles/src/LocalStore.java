import java.util.Scanner;

public class LocalStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String beverage = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (city) {
            case "varna":
                if ("coffee".equals(beverage)) {
                    System.out.println(0.45 * count);
                } else if (beverage.equals("peanuts")) {
                    System.out.println(1.55 * count);
                } else if (beverage.equals("water")) {
                    System.out.println(1.55 * count);
                } else if (beverage.equals("beer")) {
                    System.out.println(1.55 * count);
                } else if (beverage.equals("sweets")) {
                    System.out.println(1.55 * count);
                }
                break;
            case "sofia":
                if ("coffee".equals(beverage)) {
                    System.out.println(0.5 * count);
                } else if (beverage.equals("peanuts")) {
                    System.out.println(1.6 * count);
                } else if (beverage.equals("water")) {
                    System.out.println(0.8 * count);
                } else if (beverage.equals("beer")) {
                    System.out.println(1.20 * count);
                } else if (beverage.equals("sweets")) {
                    System.out.println(1.45 * count);
                }
                break;

            case "plovdiv":
                if ("coffee".equals(beverage)) {
                    System.out.println(0.4 * count);
                } else if (beverage.equals("peanuts")) {
                    System.out.println(1.5 * count);
                } else if (beverage.equals("water")) {
                    System.out.println(0.7 * count);
                } else if (beverage.equals("beer")) {
                    System.out.println(1.15 * count);
                } else if (beverage.equals("sweets")) {
                    System.out.println(1.3 * count);
                }
                break;
        }
    }
}