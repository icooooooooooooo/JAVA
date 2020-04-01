import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine().toLowerCase();
        String outfit = null;
        String shoes = null;

        switch (time) {
            case "morning":
                if ((10 <= temp) && (temp <= 18)) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (18 < temp && temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Mocassins";
                } else if (temp >= 25) {
                    outfit = "T-shirt";
                    shoes = "Sandals";
                }
                break;
            case "afternoon":
                if ((10 <= temp) && (temp <= 18)) {
                    outfit = "Shirt";
                    shoes = "Mocassins";
                } else if (18 < temp && temp <= 24) {
                    outfit = "T-shirt";
                    shoes = "Sandals";
                } else if (temp >= 25) {
                    outfit = "Swin Suit";
                    shoes = "Barefoot";
                }
                break;
            case "evening":
                outfit = "Shirt";
                shoes = "Mocassins";
                break;
        }
        System.out.println("It's " +temp+ " degrees, get your " +outfit+" and "+ shoes+".");
    }
}
