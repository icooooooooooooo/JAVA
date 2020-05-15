import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        String longNum = scanner.readLine ();
        String shortNum = scanner.readLine ();

        if (longNum.length () < shortNum.length ()) {
            String temp = shortNum;
            shortNum = longNum;
            longNum = temp;

        }
        if (longNum.length () != shortNum.length ()) {
            shortNum = equilize (shortNum, longNum.length ());
        }

        StringBuilder sumCalc = new StringBuilder ();
        int remain = 0;

        for (int i = shortNum.length () - 1; 0 <= i; i--) {
            int num1 = longNum.charAt (i) - '0';
            int num2 = shortNum.charAt (i) - '0';
            int sum = num1 + num2 + remain;

            int appendResult = sum % 10;
            sumCalc.append (appendResult);
            remain = sum / 10;

        }

        if (remain != 0) {
            sumCalc.append (remain);
        }
        String lenghtValidation = sumCalc.reverse ().toString ();
        lenghtValidation = validator (lenghtValidation);


        System.out.print (lenghtValidation);

    }

    private static String validator(String lenghtValidation) {

        while (lenghtValidation.charAt (0) == '0') {
            lenghtValidation = lenghtValidation.substring (1);
        }
        return lenghtValidation;
    }
    private static String equilize (String shortNum, int length) {
        StringBuilder append = new StringBuilder (shortNum);
        while (append.length () < length) {
            append = append.insert (0, "0");
        }
        shortNum = append.toString ();
        return shortNum;
    }
}
