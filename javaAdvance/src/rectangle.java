import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();

        double result = sideA*sideB;
        System.out.printf("%.2f",result);
    }
}
