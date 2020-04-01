import java.util.Scanner;

public class LeftOrRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //side size
        int left = 0;
        int right = 0;
        for (int i = 1; i <= n * 2; i++) {
            int amount = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                left +=amount;
            } else {
                right +=amount;
            }
        }
        if (right==left) {
            System.out.printf("Yes, sum=%d",(left+right)/2);
        } else {
            System.out.printf("No, diff=%d",Math.abs(left-right));
        }

    }
}
