import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if ("+".equals(operator) || operator.equals("-") || operator.equals("*")) {


            System.out.printf("%d %s %d",n1,operator,n2);
        }


    }
}

