import java.util.Scanner;

public class Projecttime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectcount = Integer.parseInt(scanner.nextLine());
        int hours = projectcount * 3;

        System.out.println(
                String.format(
                "The %s will need %d hours to complete %d projects."
                        , name, hours, projectcount));





    }
}
