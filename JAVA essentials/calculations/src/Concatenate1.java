import java.util.Scanner;

public class Concatenate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine();

        System.out.print("You are " + firstname + " " + lastname + " " + age + "-years old and from " + grad);
        // either works;

        System.out.printf("You are %s %s %d-years old and  from %s", firstname, lastname, age, grad);


    }
}
