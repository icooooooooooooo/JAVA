import java.util.Scanner;

public class clipboardCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.isEmpty()) {
            name1 = "*****";
        }
        if (name2.isEmpty()) {
            name2 = "*****";
        }

        System.out.printf("Hello, %s %s!", name1, name2);
    }
}
