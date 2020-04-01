import java.util.Scanner;

public class targetHit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int start = 1;
        int end = 20;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {

                if (i + j == input) {
                    System.out.printf("%d + %d = %d %n", i, j, input);
                }
            }
        }
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {

                if (i - j == input) {
                    System.out.printf("%d - %d = %d %n", i, j, input);
                }
            }
        }


    }
}
