import java.util.Scanner;

public class Ma3x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int oneOne = a; oneOne <= b; oneOne++) {
            for (int oneTwo = a; oneTwo <= b; oneTwo++) {
                for (int twoOne = c; twoOne <= d; twoOne++) {
                    for (int twoTwo = c; twoTwo <= d; twoTwo++) {
                        if ((oneOne + twoTwo == oneTwo + twoOne)) {
                       //     System.out.printf("%d %d\n%d %d\n\n",oneOne,oneTwo,twoOne,twoTwo);
                            if (oneOne != oneTwo && twoOne != twoTwo) {
                                System.out.printf("%d %d\n%d %d\n", oneOne, oneTwo, twoOne, twoTwo);
                                System.out.println(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}