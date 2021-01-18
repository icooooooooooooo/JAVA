package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Dispatcher dispatcher = new Dispatcher();


        while (!"HARVEST".equals(input = scan.readLine())) {
            try {
                dispatcher.engine(input);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
