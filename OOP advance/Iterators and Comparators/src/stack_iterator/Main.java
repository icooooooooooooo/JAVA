package stack_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String input;
        MyStack<Integer> myStack = new MyStack();

        while (!"END".equals(input = scan.readLine())) {
            String[] inputArgs = input.split("\\s+", 2);
            String command = inputArgs[0];

            switch (command) {
                case "Pop":
                    try {
                        myStack.pop();
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Push":
                    int[] numbers =
                            Arrays.stream(inputArgs[1].split(", "))
                                    .map(x -> x.replace(" ", ""))
                                    .map(x -> x.replace(",", ""))
                                    .mapToInt(x -> Integer.parseInt(x))
                                    .toArray();

                    for (int n : numbers) {
                        myStack.push((Integer) n);
                    }
                    break;
            }
        }

        print(myStack);

        print(myStack);

    }

    private static void print(MyStack<Integer> myStack) {
        for (Integer o : myStack) {
            System.out.println(o);
        }
    }
}

