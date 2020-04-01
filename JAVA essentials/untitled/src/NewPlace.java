import java.util.Scanner;

public class NewPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int countBox = 0;

        int volume = h * w * d;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int newBoxes = Integer.parseInt(input);
            countBox += newBoxes;
            if (countBox >= volume) {
                break;
            }
            input=scanner.nextLine();
        }
        if (countBox >= volume) {
            System.out.printf("No more free space. You need %d, more space.", Math.abs(countBox - volume));
        } else {
            System.out.printf("%d cubic feet left.", Math.abs(countBox - volume));
        }
    }
}