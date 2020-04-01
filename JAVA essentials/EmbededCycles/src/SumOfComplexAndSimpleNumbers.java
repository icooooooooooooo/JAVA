import java.util.Scanner;

public class SumOfComplexAndSimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int prime = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative");
                continue;
            }
            boolean isPrime = true;
            if (num == 1) {
                isPrime = false;
            } else {
                for (int i = num; 2 <= i; i--) {

                    if (num % i == 0 && num != i) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                prime += num;
            } else {
                nonPrime += num;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is:%d\nSum of all non prime numbers is:%d", prime, nonPrime);
    }
}

