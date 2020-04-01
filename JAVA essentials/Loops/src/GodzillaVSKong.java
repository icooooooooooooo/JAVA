import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int backgroundactors = Integer.parseInt(scanner.nextLine());
        double costume = Double.parseDouble(scanner.nextLine());

        double decore = budget*0.1;
        double costumebudget = backgroundactors*costume;


        if (backgroundactors>150) {
            costumebudget= costumebudget*0.9;
        }

        double summary =decore + costumebudget;
        double left = budget - summary;

        if (budget>summary) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left!",left);
        } else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",Math.abs(left));
        }


    }

}
