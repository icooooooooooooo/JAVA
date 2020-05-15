import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int size = Integer.parseInt (scanner.nextLine ());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine ().split (" ");

            for (int j = 0; j < size; j++) {

                matrix[i][j] = Integer.parseInt (input[j]);
            }
        }

        int firsttDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < size; i++) {
            firsttDiagonal += matrix[i][i];
        }

        for (int i = 0; i < size; i++) {

            secondDiagonal+=matrix[i][size-i-1];
        }

        int diff = firsttDiagonal-secondDiagonal;
        System.out.println (Math.abs (diff));

    }
}
