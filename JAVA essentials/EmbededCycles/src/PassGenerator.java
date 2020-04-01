import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int letters = 97 + l;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                for (int k = 97; k < letters; k++) {
                    //char l1 = (char) k;
                    //test - System.out.printf("%c",l1);

                    for (int m = 97; m < letters; m++) {
                        //char l2 = (char)m;
                        //System.out.printf("%c%c",l1,l2);
                        char l1 = (char) k;
                        char l2 = (char) m;

                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {

                                System.out.printf("%d%d%c%c%d ", i, j, l1, l2, o);
                            }

                        }

                    }

                }

            }

        }
    }
}
