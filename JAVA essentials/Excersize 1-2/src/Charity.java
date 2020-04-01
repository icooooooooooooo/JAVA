import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancekes = Integer.parseInt(scanner.nextLine());

        double totalperday = cakes*45+waffles*5.8+pancekes*3.2;
        double totalperchef = totalperday*days;
        double totalnet = (totalperchef * chefs) * 7.00/8;

        System.out.printf("%.2f",totalnet);
    }
}
