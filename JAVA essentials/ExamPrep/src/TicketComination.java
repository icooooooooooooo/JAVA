import java.util.Scanner;

public class TicketComination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int combination = Integer.parseInt(scanner.nextLine());
        //  for (int n = 1; n <= combination; n++) {
        int counter = 0;
        for (int i = 66; i <= 90; i += 2) {
            for (int j = 102; j >= 97; j--) {
                for (int k = 65; k <= 67; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 10; m >= 1; m--) {
                            counter++;
                            if (counter == combination) {
                                System.out.printf("Ticket combination: %c%c%c%d%d\n", i, j, k, l, m);
                                System.out.printf("Prize: %d lv.\n", i + j + k + l + m);
                                break;
                            }
                        }

                    }

                }

            }

        }
    }
//}
