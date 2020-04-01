import java.util.Scanner;

public class Circleface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        double pi = 3.14;

        double face = Math.PI*2*r;
        double parameter = Math.PI*r*r;

        System.out.println(String.format("A circle with a radius %d, has an area of %.2f and parameter %.2f.", r, face, parameter));

    }
}
