import java.util.Scanner;

public class Xbits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrSize = 8;
        int binLength = 32;

        int[] arr = new int[arrSize];
        int[][] matrix = new int[arrSize][binLength];

        for (int i = 0; i < arrSize; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            char[] chars =
                    Integer.toBinaryString(num)
                            .toCharArray();

            for (int j = 0; j < chars.length; j++) {

                int index = matrix[i].length - chars.length + j;

                matrix[i][index] = Integer.parseInt(String.valueOf(chars[j]));
            }
        }

        int counter = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                // create method on Xbit validity
                if (matrix[i][j] == 1 && isXbit(matrix, i, j)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    private static boolean isXbit(int[][] matrix, int i, int j) {

        int[] pattern = {1, 0, 1, 0, 1, 0, 1, 0, 1};

        int currentIndex = 0;

        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (pattern[currentIndex++] != matrix[k][l]) {
                    return false;
                }
            }
        }
        return false;
    }
}
