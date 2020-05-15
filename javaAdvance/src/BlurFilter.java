import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int blur = Integer.parseInt (scanner.nextLine ());

        String[] dimension = scanner.nextLine ().split ("\\s+");

        int row = Integer.parseInt (dimension[0]);
        int col = Integer.parseInt (dimension[1]);

        //define size
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            String[] lineInput = scanner.nextLine ().split ("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt (lineInput[j]);
            }
        }

        String[] blurCoordinates = scanner.nextLine ().split ("\\s+");
        int targetRow = Integer.parseInt (blurCoordinates[0]);
        int targetCol = Integer.parseInt (blurCoordinates[1]);

        int startRow = targetRow - 1 < 0 ? targetRow : targetRow - 1;
        int endRow = targetRow + 1 >= matrix[targetCol].length ? targetRow : targetRow + 1;

        int startCol = targetCol - 1 < 0 ? targetCol : targetCol - 1;
        int endCol = targetCol + 1 >= matrix[targetRow].length ? targetCol : targetCol + 1;

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                matrix[i][j] += blur;
            }
        }

        printMatrix (matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            List<String> line = new ArrayList<String> ();
            for (int j = 0; j < matrix[i].length; j++) {
                line.add (String.valueOf (matrix[i][j]));
            }
            System.out.println (String.join (" ", line));
        }
    }

}
