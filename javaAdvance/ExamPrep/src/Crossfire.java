import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Crossfire {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] dimentions = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();

        int rows = dimentions[0];
        int columns = dimentions[1];
        int[][] matrix = new int[rows][columns];
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = counter;
                counter += 1;
            }
        }
        System.out.println ("Nuke what?");

        String input = scan.readLine ();
        while (!"Nuke it from orbit".equals (input)) {
            String[] raw = input.split ("\\s+");
            int row = Integer.parseInt (raw[0]);
            int column = Integer.parseInt (raw[1]);
            int radius = Integer.parseInt (raw[2]);

            matrix = destroyer (row, column, radius, matrix, columns, rows);

            input = scan.readLine ();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print (String.format ("%3d", matrix[i][j]));
            }
            System.out.println ("\n");
        }

    }

    private static int[][] destroyer(int row, int column, int radius, int[][] matrix, int columns, int rows) {
        int colMin = column - radius;
        int colMax = column + radius + 1;
        int rowMin = row - radius;
        int rowMax = row + radius + 1;

        if (colMin < 0) {
            colMin = 0;
        }
        if (rowMin < 0) {
            rowMin = 0;
        }
        if (colMax > columns) {
            colMax = columns;
        }
        if (rowMax > rows) {
            rowMax = rows;
        }

        for (int i = rowMin; i < rowMax; i++) {
            matrix[i][column] = 0;
        }
        for (int i = colMin; i < colMax; i++) {
            matrix[row][i] = 0;
        }

        return matrix;
    }
}
