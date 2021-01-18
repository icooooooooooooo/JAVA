package event_implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        Dispatcher dispatcher = new Dispatcher();
        NameChangeListener handler = new Handler();
        NameChangeListener handler2 = new Handler();
        NameChangeListener handler3 = new Handler();

        dispatcher.addNameChangeListener(handler);
        dispatcher.addNameChangeListener(handler2);
        dispatcher.addNameChangeListener(handler3);

        String input;

        while (!"End".equals(input = scan.readLine())) {
            dispatcher.setName(input);
        }
    }
}
