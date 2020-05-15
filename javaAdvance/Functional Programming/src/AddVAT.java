import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        List<Double> input = Arrays.stream (scanner.readLine ().split (", "))
                .map (x -> Double.parseDouble (x))
                .collect (Collectors.toList ());
        UnaryOperator<Double> addVAT = x -> x * 1.2;


        System.out.println ("Prices with VAT:");
        for (Double amount : input) {
            System.out.println (String.format ("%.2f", addVAT.apply (amount)));
        }
    }
}
