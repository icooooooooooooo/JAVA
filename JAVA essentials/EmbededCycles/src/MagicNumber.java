import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int n = 0; n <= 9; n++) {
                                if (num == (i * j * k * l * m * n)){
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,l,m,n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
