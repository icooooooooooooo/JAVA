import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] pointsX = new Integer[3];
        Integer[] pointsY = new Integer[3];

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            pointsX[i] = x;
            pointsY[i] = y;
        }

        int top = pointsX[0] * (pointsY[1] - pointsY[2]) + pointsX[1] * (pointsY[2] - pointsY[0]) + pointsX[2] * (pointsY[0] - pointsY[1]);


        double result = top / 2;

        if (result < 0) {
            result *= -1;
        }
        System.out.printf("%.2f", result);
    }
}
