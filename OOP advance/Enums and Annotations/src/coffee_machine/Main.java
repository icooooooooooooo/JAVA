package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        CoffeeMachine cm = new CoffeeMachine();

        String input;
        while (!"END".equals(input = scan.readLine())) {
            String[] arguments = input.split("\\s+");
            if (arguments.length == 2) {
                cm.buyCoffee(arguments[0], arguments[1]);
            } else {
                cm.insertCoin(arguments[0]);
            }
        }
        for (Coffee coffee : cm.coffeesSold()) {
            System.out.println(coffee.toString());
        }
    }
}
