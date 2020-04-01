import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double USD = Double.parseDouble(scanner.nextLine());
        Double BGN = USD * 1.79549;

        System.out.printf("%.2f", BGN);
    }
}
