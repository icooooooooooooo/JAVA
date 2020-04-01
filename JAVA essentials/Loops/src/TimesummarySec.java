import java.util.Scanner;

public class TimesummarySec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totaltime = first+second+third;

        int minutes = totaltime/60;
        int seconds = totaltime%60;

        if (second<10) {
            System.out.printf("%d:0%d",minutes,seconds);
        } else {
            System.out.printf("%d:%d", minutes,seconds);
        }
    }
}
