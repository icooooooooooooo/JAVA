import java.util.Scanner;

public class Greeting
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner ( System.in);

            String name = scanner.nextLine();
            String name1 = scanner.nextLine();

            System.out.printf("Hello, %s !", name);
            System.out.println(" ");
            System.out.printf("Hello "+ name1 + " !");


        }
}
