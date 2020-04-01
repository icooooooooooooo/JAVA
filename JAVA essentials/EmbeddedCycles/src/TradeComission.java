import java.util.Scanner;

public class TradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "sofia":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.05);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.07);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.12);
                }
                break;
            case "varna":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.045);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.075);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.1);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.13);
                }
                break;
            case "plovdiv":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.2f", sales * 0.055);
                } else if (500 < sales && sales <= 1000) {
                    System.out.printf("%.2f", sales * 0.08);
                } else if (1000 < sales && sales <= 10000) {
                    System.out.printf("%.2f", sales * 0.12);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", sales * 0.145);
                }
                break;
            default:
                System.out.println("Invalid city.");
        }
        if (sales < 0) {
            System.out.printf("Error.");
        }

    }
}
