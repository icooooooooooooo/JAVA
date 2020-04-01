import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starthour = Integer.parseInt(scanner.nextLine());
        int startminutes = Integer.parseInt(scanner.nextLine());

        int timeinminutes= starthour*60+startminutes;
        int timeplus15 = timeinminutes+15;

        int newhour=timeplus15/60;
        int newminutes=timeplus15%60;

        if (newhour>=24) {
            newhour=0;
        }
        if ((newminutes<10)) {
            System.out.printf("%d:0%d",newhour, newminutes);
        } else {
            System.out.printf("%d:%d",newhour, newminutes);
        }




    }
}
