package listyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String input;
        ListyIterator listyIterator = null;

        while (!"END".equals(input = scan.readLine())) {


            String[] arg = input.split("\\s+");
            String command = arg[0];
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Create":
                    listyIterator = new ListyIterator(Arrays.stream(arg).skip(1).toArray(String[]::new));
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case  "PrintAll":
                    System.out.println(listyIterator.PrintAll());
                    break;
            }
        }

    }
}
