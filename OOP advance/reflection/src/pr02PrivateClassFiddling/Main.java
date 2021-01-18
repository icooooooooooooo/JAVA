package pr02PrivateClassFiddling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher = null;
        try {
            dispatcher = new Dispatcher();
        } catch (InvocationTargetException | InstantiationException | NoSuchMethodException | ClassNotFoundException | NullPointerException msg) {
            System.out.println(msg.getMessage());
        }

        String input;
        while (!"END".equals(input = scan.readLine())) {
            String[] arguments = input.split("_");
            try {
                dispatcher.engine(arguments);
            } catch (InvocationTargetException |
                    NullPointerException |
                    IllegalAccessException |
                    IllegalArgumentException
                    exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}