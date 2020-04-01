import java.math.BigInteger;
import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        BigInteger result = new BigInteger("1");

        for (int i = start; i <= end; i++) {

            BigInteger multiplier = BigInteger.valueOf(i);
            result = result.multiply(multiplier);
        }
        System.out.println(result);
    }
}
