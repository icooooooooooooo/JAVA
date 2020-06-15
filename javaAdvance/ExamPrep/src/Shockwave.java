import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int[] dimentions = Arrays.stream (scan.readLine ().split ("\\s+")).mapToInt (x -> Integer.parseInt (x)).toArray ();

        int row = dimentions[0];
        int colums = dimentions[1];
        int[][] matrix = new int[row][colums];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colums; j++) {
                matrix[i][j] = 0;
            }
        }

        String input = scan.readLine ();
        while (!"Here We Go".equals (input)) {
            int[] boundries = Arrays.stream (input.split ("\\s+")).mapToInt (Integer::parseInt).toArray ();
            int botRow = boundries[0];
            int botCol = boundries[1];
            int topRow = boundries[2];
            int topCol = boundries[3];

            for (int i = botRow; i <= topRow; i++) {
                for (int j = botCol; j <= topCol; j++) {
                    matrix[i][j] += 1;
                }
            }
            input = scan.readLine ();

        }
        for (int[] line : matrix) {
            StringBuilder sb = new StringBuilder ();
            for (int e : line) {
                sb.append (e).append (" ");
            }
            System.out.println (sb.toString ().trim ());
        }

    }
}

