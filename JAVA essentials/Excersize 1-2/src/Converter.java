import java.io.PrintStream;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches*2.54;

       System.out.printf("%.2f", cm);
    }
}
