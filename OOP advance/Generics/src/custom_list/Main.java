package custom_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> list = new CustomList<>();
        String input = scan.readLine();

        while (!"END".equals(input)) {
            String[] commands = input.split("\\s+");

            Dispatcher dispatcher = new Dispatcher();

            dispatcher.dispatch(commands,list);

            input = scan.readLine();
        }

    }
}
