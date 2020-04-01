import java.util.List;
import java.util.Scanner;

public class Xbits {
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
                if (matrix[i][j] == 1) {
                    if (    matrix[i][j + 2] == 1
                            && matrix[i][j + 1] == 0        //end of first row
                            && matrix[i + 1][j + 1] == 1
                            && matrix[i + 1][j] == 0
                            && matrix[i + 1][j + 2] == 0    //end of second row
                            && matrix[i + 2][j] == 1
                            && matrix[i + 2][j + 1] == 0
                            && matrix[i + 2][j + 2] == 1    // end of third row
                        ) {
                        counter++;

                        //altermative solution is to run 2 loops of 3 turns each. to compare with a pattern of 101 010 101
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
