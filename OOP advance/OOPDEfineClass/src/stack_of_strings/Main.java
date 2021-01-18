package stack_of_strings;

public class Main {
    public static void main(String[] args) throws Exception {
        StackOfStrings stack = new StackOfStrings();
        stack.push("Petio");
        stack.push("Gogo");
        stack.push("Dino");
        stack.push("Zizo");
        stack.push("Gesh");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
