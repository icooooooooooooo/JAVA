import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());

        int lv = Integer.parseInt(String.format("%.0f", Math.floor(amount)));
        int st = Integer.parseInt(String.format("%.0f", Math.abs(amount - lv) * 100));
        int coinCounter = 0;


        while (lv >0 || st > 0) {
            if (lv >= 2) {
                coinCounter++;
                lv -= 2;
            } else if (lv >= 1) {
                coinCounter++;
                lv--;
            }
            if (st >= 50) {
                coinCounter++;
                st -= 50;
            } else if (st >= 20) {
                coinCounter++;
                st -= 20;
            } else if (st >= 10) {
                coinCounter++;
                st -= 10;
            } else if (st >= 5) {
                coinCounter++;
                st -= 5;
            } else if (st >= 2) {
                coinCounter++;
                st -= 2;
            } else if (st >= 1) {
                coinCounter++;
                st -= 1;
            }
            if (amount == 0) {
                break;
            }
        }
        System.out.printf("%d", coinCounter);
    }


}
