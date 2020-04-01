import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int limit = n + 97;

        for (int i = 97; i < limit; i++) {
            for (int j = 97; j < limit; j++) {
                char l1 = (char) i;
                char l2 = (char) j;
                System.out.printf("%c%c\n", l1, l2);
            }

        }
    }
}
