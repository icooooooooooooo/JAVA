package warning_levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String importanceLevel = scan.readLine();
        Logger logger = new Logger();
        String input;
        while (!"END".equals(input = scan.readLine())) {
            String[] inputArgs = input.split(": ");
            logger.addMessage(importanceLevel,new Message(inputArgs[0], inputArgs[1]));
        }
        for (Message message : logger.getMessages()) {
            System.out.println(message.toString());
        }
    }
}
