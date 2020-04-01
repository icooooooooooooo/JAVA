import java.util.Scanner;

public class DivideWithoutLeftover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int div2 = 0;
        int div3 = 0;
        int div4 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number%2==0) {
                div2++;
            }
            if (number%3==0) {
                div3++;
            }
            if (number%4==0) {
                div4++;
            }
        }
        System.out.printf("%.2f%%\n",(div2*1.00)/n*100);
        System.out.printf("%.2f%%\n",(div3*1.00)/n*100);
        System.out.printf("%.2f%%",(div4*1.00)/n*100);
    }
}
