import java.util.List;
import java.util.Scanner;

public class sumMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] dimensions = scanner.nextLine ().split (", ");
        int row = Integer.parseInt (dimensions[0]);
        int col = Integer.parseInt (dimensions[1]);
        int[][] matrix = new int[row][col];


        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine ().split (", ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt (input[j]);
            }
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println (sum);
    }
}
