import java.math.BigDecimal;
import java.util.Scanner;

public class euroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = scanner.nextDouble();

        BigDecimal priceInLv = new BigDecimal(quantity * 1.2);
        BigDecimal exchange = new BigDecimal(4210500000000.0);
        BigDecimal priceInDM = exchange.multiply(priceInLv);

        System.out.printf("%.2f marks",priceInDM);
    }
}
