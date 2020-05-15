import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] command = scanner.nextLine ().split ("\\s+");
        int row = Integer.parseInt (command[0]);
        int col = Integer.parseInt (command[1]);

        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            int asciiCode = 97 + i;
            char letter = (char) asciiCode;
            for (int j = 0; j < col; j++) {
                matrix[i][j] = palindormGenerator (letter, j, asciiCode);
            }
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print (string +" ");
            }
            System.out.println ("");

        }

    }

    private static String palindormGenerator(char letter, int col, int ascii) {

       //StringBuilder is a good idea.
        String output = letter + "";
        int asciiLocation = ascii+col;
        char mid = (char)asciiLocation;
        output+=mid;
        output+=letter;
        return output;
    }
}
