package dependency_inversion;

import dependency_inversion.strategies.AdditionStrategy;
import dependency_inversion.strategies.CalculationStrategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        CalculationStrategy defaultStrategy = new AdditionStrategy();
        PrimitiveCalculator calculator = new PrimitiveCalculator(defaultStrategy);

        String input;
        while (true) {
            if ("End".equals(input = scan.readLine())) {
                break;
            }
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("mode")) {
                String mode = tokens[1];
                                calculator.changeStrategy(mode);

            } else {
                System.out.println(calculator.calculate(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
            }

        }
    }
}
