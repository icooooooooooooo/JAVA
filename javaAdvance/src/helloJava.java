import java.util.Scanner;

public class helloJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next("\\w+");
        String word2 = scanner.next("\\w+");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.nextLine();

        int sum = num1 + num2 + num3;

        String word3 = scanner.nextLine();

        System.out.printf("%s %s %s %d", word1, word2, word3, sum);


    }
}
