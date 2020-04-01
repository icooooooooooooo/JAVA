import java.util.Scanner;

public class Minnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;
        int num;

        while (count-- > 0) {
            num = Integer.parseInt(scanner.nextLine());
            if (num < minNum) {
                minNum = num;
            }
        }
       System.out.printf("Min number is, %d", minNum);
    }
}

