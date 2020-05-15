import java.util.Scanner;

public class MaximumSumSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] matrixSize = scanner.nextLine ().split (", ");
        int row = Integer.parseInt (matrixSize[0]);
        int col = Integer.parseInt (matrixSize[1]);

        int[][] matrix = new int[Integer.parseInt (matrixSize[0])][Integer.parseInt (matrixSize[1])];

        for (int[] ints : matrix) {
            String[] dataInput = scanner.nextLine ().split (", ");
            for (int i = 0; i < col; i++) {
                ints[i] = Integer.parseInt (dataInput[i]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[] winElement = new int[2];

        for (int i = 0; i < row - 1; i++) {

            for (int j = 0; j < col - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    winElement[0] = i;
                    winElement[1] = j;
                }
            }
        }
        int winRow = winElement[0];
        int winCol = winElement[1];

// it looks confusing if you call the elements of the array.
        System.out.println (matrix[winRow][winCol] + " " + matrix[winRow][winCol + 1]);
        System.out.println (matrix[winRow + 1][winCol] + " " + matrix[winRow + 1][winCol + 1]);
        System.out.println (maxSum);
    }
}
