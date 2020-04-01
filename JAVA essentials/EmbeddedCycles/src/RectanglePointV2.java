import java.util.Scanner;

public class RectanglePointV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());


        boolean firstCondition = ((x == x1 || x == x2) && (y >= y1 || y <= y2));
        boolean secondCondition = ((y == y1 || y == y2) && (x >= x1 || x <= x2));

        if ( firstCondition || secondCondition) {
            System.out.println("Border");
        } else{
            System.out.println("Inside /\nOutside");
        }
    }
}
