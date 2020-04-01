import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;

        double percentP1 = countP1 / n; //not useful at the moment;
        double percentP2 = countP2 / n;
        double percentP3 = countP3 / n;
        double percentP4 = countP4 / n;
        double percentP5 = countP5 / n;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                countP1++;
            } else if (number >= 200 && number <= 399) {
                countP2++;
            } else if (number >= 400 && number <= 599) {
                countP3++;
            } else if (number >= 600 && number <= 799) {
                countP4++;
            } else if (number >= 800) {
                countP5++;
            }

        }
        System.out.printf("%.2f%%\n",(countP1*1.00)/n*100);
        System.out.printf("%.2f%%\n",(countP2*1.00)/n*100);
        System.out.printf("%.2f%%\n",(countP3*1.00)/n*100);
        System.out.printf("%.2f%%\n",(countP4*1.00)/n*100);
        System.out.printf("%.2f%%",(countP5*1.00)/n*100);
    }
}
