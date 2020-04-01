import java.util.Scanner;

public class SamePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minPair = Integer.MAX_VALUE;
        int maxPair = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int sum = a + b;
            if (sum <= minPair) {
                minPair = sum;
            }
            if (sum >= maxPair) {
                maxPair = sum;
            }
        }
        int maxDiff = Math.abs(minPair - maxPair);
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", minPair);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }

    }
}
