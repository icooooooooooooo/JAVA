import java.util.Scanner;

public class TextAndNumbers

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surename = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("Hello %s %s, who is %d-years old and from %s.",name ,surename ,age ,town);
    }
}
