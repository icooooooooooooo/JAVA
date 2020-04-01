import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededAmount = Integer.parseInt(scanner.nextLine());
        int availableAmount = Integer.parseInt(scanner.nextLine());
        boolean success = neededAmount <= availableAmount;

        String action = scanner.nextLine();
        int newAmount = Integer.parseInt(scanner.nextLine());
        int daysSaving = 0;
        int spendCount = 0;

        while (!success) {
            daysSaving++;

            switch (action) {
                case "save":
                    spendCount = 0;
                    availableAmount += newAmount;
                    break;
                case "spend":
                    spendCount++;
                    availableAmount -= newAmount;

                    break;
            }

            if (spendCount == 5) {
                break;
            }
            if (availableAmount<0){
                availableAmount=0;
            }
            if (availableAmount>=neededAmount){
                break;
            }
            action = scanner.nextLine();
            newAmount = Integer.parseInt(scanner.nextLine());
        }
        if (neededAmount <= availableAmount) {
            System.out.printf("You saved the money for %d days.", daysSaving);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(String.format("%d",spendCount));

        }
    }
}