import java.util.Scanner;

public class Faceofasquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int face = a*b;
        System.out.println(face);
    }
}
