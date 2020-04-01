import java.util.Scanner;

public class TimePlus15Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int timeinminutes=minute+(hour*60);
        int timeplus15=timeinminutes+15;

        int newhour = timeplus15/60;
        int newminutes = timeplus15%60;

        if (newhour>23) {
            newhour -=24;
        }

        if (newminutes<10) {
            System.out.printf("%d:0%d", newhour, newminutes);
        } else {
            System.out.printf("%d:%d", newhour, newminutes);
        }
    }
}
