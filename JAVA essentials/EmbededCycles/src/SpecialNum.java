import java.util.Scanner;

public class SpecialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l < 9; l++) {

                        if (input % i == 0 && input % j == 0 && input % k == 0 && input % l == 0){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }

                    }

                }

            }

        }

    }
}
