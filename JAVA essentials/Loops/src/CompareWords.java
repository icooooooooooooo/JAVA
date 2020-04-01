import java.util.Scanner;

public class CompareWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstword = scanner.nextLine();
        String secondword = scanner.nextLine();
        firstword=firstword.toLowerCase();
        secondword=secondword.toLowerCase();

        if (firstword.equals(secondword)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
