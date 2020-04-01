import java.util.Scanner;

public class Petstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Dogs = Integer.parseInt(scanner.nextLine());
        int Other = Integer.parseInt(scanner.nextLine());

        double dogfood = 2.5;
        double otherfood =4;

        double totalprice = (Dogs * dogfood) + (Other*otherfood);

        System.out.println(String.format("%.2f lv", totalprice));
    }
}
