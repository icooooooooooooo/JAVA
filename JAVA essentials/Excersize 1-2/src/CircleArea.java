import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radius = Double.parseDouble(scanner.nextLine());
        Double pi = Math.PI;

        Double area = pi*radius*radius;
        Double perimeter = 2*Math.PI*radius;

        System.out.printf("A circle with radius %.2f has an area of %.2f and a perimeter of %.2f",radius,area,perimeter);
    }
}
