import java.text.DecimalFormat;
import java.util.Scanner;

public class numFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        String aToHex = Integer.toHexString(a).toUpperCase() + "          ";
        String aToBin = "0000000000" + Integer.toBinaryString(a);

        DecimalFormat bToStr = new DecimalFormat("#0.00");
        DecimalFormat cToStr = new DecimalFormat("#0.000");

        String bToPrint = "          " + bToStr.format(b);
        String cToPrint = cToStr.format(c) + "          ";


        System.out.println("|" + aToHex.substring(0, 10) + "|" + aToBin.substring(aToBin.length() - 10) + "|" + bToPrint.substring(aToBin.length() - 10) + "|" + cToPrint.substring(0, 10) + "|");

    }
}
