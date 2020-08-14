package froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String input;
        List<Integer> numbers;
        Lake<Integer> lake = null;
        while (!"END".equals(input = scan.readLine())) {
            numbers = new ArrayList<>(Arrays.stream(input.split("(, |\\s)"))
                    .mapToInt(x -> Integer.parseInt(x))
                    .boxed()
                    .collect(Collectors.toList()));
            lake = new Lake(numbers);

        }
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        for (Integer n : lake) {
            if (n % 2 == 1) {
                sbOdd.append(n).append(", ");
            } else {
                sbEven.append(n).append(", ");
            }
            System.out.print(String.format("%d, ", n));
        }
        sbOdd.append(sbEven);
        System.out.println(sbOdd.toString().substring(0, sbOdd.length() - 2));

    }
}
