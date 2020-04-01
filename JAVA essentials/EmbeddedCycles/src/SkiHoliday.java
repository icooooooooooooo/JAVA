import java.util.Scanner;

public class SkiHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stay = Integer.parseInt(scanner.nextLine());
        int nights = stay - 1;
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        double price = 0; //defining price
        double discount = 0; //define discount type

        if (roomType.equals("room for one person")) {
            price = nights * 18;
        } else if (roomType.equals("apartment")) {
            price = nights * 25;
        } else if (roomType.equals("president apartment")) {
            price = nights * 35;
        }

        if (0 < nights && nights < 10) {
            if (roomType.equals("room for one person")) {
                discount = 0;
            } else if (roomType.equals("apartment")) {
                discount = 0.3;
            } else if (roomType.equals("president apartment")) {
                discount = 0.1;
            }
        } else if (10 <= nights && nights < 15) {
            if (roomType.equals("room for one person")) {
                discount = 0;
            } else if (roomType.equals("apartment")) {
                discount = 0.35;
            } else if (roomType.equals("president apartment")) {
                discount = 0.15;
            }
        } else if (15 <= nights) {
            if (roomType.equals("room for one person")) {
                discount = 0;
            } else if (roomType.equals("apartment")) {
                discount = 0.5;
            } else if (roomType.equals("president apartment")) {
                discount = 0.2;
            }
        }
        if (grade.equals("positive")) {
            System.out.printf("%.2f", (1 - discount) * price * 1.25);
        } else if (grade.equals("negative")) {
            System.out.printf("%.2f", (1 - discount) * price * 0.9);
        }
    }
}
