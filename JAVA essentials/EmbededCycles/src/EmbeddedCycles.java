import java.util.Scanner;

public class EmbeddedCycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    for (int l = 0; l <= num; l++) {
                        for (int m = 0; m <= num; m++) {
                            if (i + j + k + l + m == num) {
                                counter++;

                            }
                        }

                    }

                }

            }

        }
        System.out.printf("%d", counter);
    }
}
