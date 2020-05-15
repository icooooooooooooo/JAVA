import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] matrixSize = scanner.nextLine ().split (" ");
        int row = Integer.parseInt (matrixSize[0]);
        int col = Integer.parseInt (matrixSize[1]);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine ().split ("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt (input[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int sum = calculator (matrix, i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow=i;
                    maxCol=j;
                }

            }
        }
        System.out.println (maxSum);
        for (int i = maxRow; i < maxRow + 3; i++) {
            for (int j = maxCol; j < maxCol + 3; j++) {
                System.out.print (matrix[i][j]+" ");
            }
            System.out.println ("");
        }

    }

    private static int calculator(int[][] matrix, int row, int col) {
        int sum = 0;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
