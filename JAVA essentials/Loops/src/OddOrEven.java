import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int validation = num1 % 2;

        if (validation == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
