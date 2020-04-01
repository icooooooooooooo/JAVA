import java.util.Scanner;

public class NumPiramid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int row = 1; row <= n; row++) {
            System.out.println("");

            for (int col = 1; col <= row; col++) {
                counter++;
                if (counter>n){
                    break;
                }
                System.out.printf("%d", counter);
            }

        }
    }
}
