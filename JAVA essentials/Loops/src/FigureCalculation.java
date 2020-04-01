import java.util.Scanner;

public class FigureCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double area; //define area

        switch (shape) {
            case "square": {
                int side = Integer.parseInt(scanner.nextLine());
                area = side*side;
                System.out.println(area);
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println(a*b);
                break;
            }
            case "circle": {
                double r = Double.parseDouble(scanner.nextLine());
                System.out.println(Math.PI*r*r);
                break;
            }
            case "triangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                System.out.println((a*h)/2);
                break;
            }
        }

    }
}
