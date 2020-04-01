import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num<100) {
            System.out.println("less than 100");
        } else if (num<=200) {
            System.out.println("between 100 and 200");
        } else {
            System.out.println("Larger than 200");
        }
    }
}
