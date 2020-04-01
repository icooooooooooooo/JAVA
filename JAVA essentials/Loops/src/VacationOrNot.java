import java.util.Scanner;

public class VacationOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripprice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingdoll = Integer.parseInt(scanner.nextLine());
        int teddybears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totaltoys = puzzle + talkingdoll + teddybears + minions + trucks;
        double totalprice = puzzle*2.6 + talkingdoll*3 + teddybears*4.10 + minions*8.2 + trucks*2;;
        double totalnetprofit = 0;

        if (totaltoys > 50) {
            totalprice = totalprice * 0.75;
        }
        totalnetprofit = totalprice*0.9;
        double left = totalnetprofit-tripprice;

        if (totalnetprofit>=tripprice) {
            System.out.printf("Yes! %.2f leva left.", left);
        } else {
            System.out.printf("No!%.2f leva to go", Math.abs(left));
        }
    }
}
