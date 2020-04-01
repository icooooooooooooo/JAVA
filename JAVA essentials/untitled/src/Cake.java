import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int cakeSize = w * d;
        int piecesTaken = 0;
        int totalPiecesTaken = 0;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            piecesTaken = Integer.parseInt(input);
            totalPiecesTaken += piecesTaken;
            if (cakeSize <= totalPiecesTaken) {
                break;
            }
            input = scanner.nextLine();
        }
        if (cakeSize<totalPiecesTaken) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakeSize-totalPiecesTaken));
        } else {
            System.out.printf("%d pieces are left.",cakeSize-totalPiecesTaken);
        }

    }
}
