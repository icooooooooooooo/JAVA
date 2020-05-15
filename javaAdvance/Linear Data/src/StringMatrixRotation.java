import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        //substring is an alternative approach
        String command = scanner.nextLine ();
        //Pattern pat = Pattern.compile ("\\d+");
        //Matcher matcher = pat.matcher (command);
        int rotNum = Integer.parseInt (command.replaceAll ("\\D+", ""));

        ArrayList<String> words = new ArrayList<String> ();
        String input = scanner.nextLine ();
        int longestWord = 0;

        while (!"END".equals (input)) {
            words.add (input);
            if (input.length () > longestWord) {
                longestWord = input.length ();
            }
            input = scanner.nextLine ();
        }

        int row = words.size ();
        int col = longestWord;

        char[][] matrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            String word = words.get (i);
            for (int j = 0; j < col; j++) {
                if (word.length () > j) {
                    matrix[i][j] = word.charAt (j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        int rotations = rotNum / 90;
        //not necessary to rotate on the fourth time = same result, as the initial position
        rotations %= 4;

        if (rotations != 0) {
            for (int i = 0; i < rotations; i++) {

                matrix = rotate (matrix, rotations);
            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print (aChar);
            }
            System.out.println (" ");
        }
    }

    private static char[][] rotate(char[][] matrix, int rotations) {

        int rowCur = matrix.length;
        int colCur = matrix[0].length;

        char[][] newMatrix = new char[colCur][rowCur];

        //needs a fix on the rotation
        for (int i = 0; i < colCur; i++) {
            for (int j = 0; j < rowCur; j++) {
                newMatrix[i][j]=matrix[j][i];
            }
        }

        return newMatrix;
    }
}
