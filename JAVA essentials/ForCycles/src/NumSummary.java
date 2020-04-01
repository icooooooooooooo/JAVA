import java.util.Scanner;

public class NumSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int total = 0;

        for (int i =1; i<=n;i++) {
            int newAmount =Integer.parseInt(scanner.nextLine());
            total+=newAmount;
        }
        System.out.println(total);
    }
}
