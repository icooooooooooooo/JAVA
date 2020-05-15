import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] dimension = scanner.nextLine ().split ("\\s+");
        int row = Integer.parseInt (dimension[0]);
        int col = Integer.parseInt (dimension[1]);


        //matrix
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine ().split (" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input[j];
            }
        }

        //operations
        String input = scanner.nextLine ();
        while (!"END".equals (input)) {
            String[] commands = input.split (" ");

            if (!"swap".equals (commands[0])) {
                System.out.println ("Invalid input!");
            } else {
                int firstMoveRow = Integer.parseInt (commands[1]);
                int firstMoveCol = Integer.parseInt (commands[2]);
                int secondMoveRow = Integer.parseInt (commands[3]);
                int secondMoveCol = Integer.parseInt (commands[4]);
                if (firstMoveCol >= col || secondMoveCol >= col || firstMoveRow >= row || secondMoveRow >= row) {
                    System.out.println ("Invalid input!");
                } else {
                    shuffle (matrix, firstMoveCol, secondMoveCol, firstMoveRow, secondMoveRow);
                    for (String[] strings : matrix) {
                        for (String string : strings) {
                            System.out.print (string+" ");
                        }
                        System.out.println ("");
                    }
                }

            }
            input = scanner.nextLine ();
        }


    }

    private static String[][] shuffle(String[][] matrix, int firstMoveCol, int secondMoveCol, int firstMoveRow, int secondMoveRow) {

        String firstValue = matrix[firstMoveRow][firstMoveCol];
        String secondValue = matrix[secondMoveRow][secondMoveCol];
        matrix[firstMoveRow][firstMoveCol] = secondValue;
        matrix[secondMoveRow][secondMoveCol] = firstValue;

        return matrix;
    }
}
