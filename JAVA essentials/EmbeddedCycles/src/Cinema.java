import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String projection = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        switch (projection) {
            case "premiere":
                profit = rows * columns * 12;
                break;
            case "normal":
                profit = rows * columns * 7.5;
                break;
            case "discount":
                profit = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", profit);
    }
}
