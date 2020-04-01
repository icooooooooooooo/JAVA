import java.util.Scanner;

public class numPiramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numCount = 1;

        for (int row = 1; row <= n; row++) {
           // System.out.println(row+"row");
            for (int col = 1; col <=row ; col++) {
                if ((n+1)==numCount){
                    break;
                }
                System.out.printf("%d ", numCount);
                numCount++;
            }
            System.out.println("");
        }
    }
}


