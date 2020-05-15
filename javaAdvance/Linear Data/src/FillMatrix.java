import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] command = scanner.nextLine ().split (", ");

        int size = Integer.parseInt (command[0]);
        String pattern = command[1];

        int[][] matrix = new int[size][size];

        if ("A".equals (pattern)) {
            Sequencial (matrix, size);

        } else if ("B".equals (pattern)) {
            ZigZag (matrix, size);

        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print (anInt + " ");
            }
            System.out.println (" ");
        }
    }

    private static int[][] ZigZag(int[][] matrix, int size) {

        int num = 1;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    matrix[j][i] = num + j;
                }
            } else if (i % 2 != 0) {
                for (int j = 0; j < size; j++) {
                    matrix[j][i] = num + size - 1 - j;
                }
            }
            num += size;
        }
        return matrix;
    }

    private static int[][] Sequencial(int[][] matrix, int size) {
        int num = 1;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                matrix[j][i] = num + j;
            }
            num += size;
        }
        return matrix;

    }
}
