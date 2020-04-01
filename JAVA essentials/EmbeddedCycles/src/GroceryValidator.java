import java.util.Scanner;

public class GroceryValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        if ((input.equals("banana")|| input.equals("apple") || input.equals("strawberry"))) {
            System.out.println("Fruit");
        } else if ((input.equals("tomato")||input.equals("carrot")||input.equals("cucumber"))) {
            System.out.println("Vegitable");
        } else {
            System.out.println("Unknown");
        }
    }
}
