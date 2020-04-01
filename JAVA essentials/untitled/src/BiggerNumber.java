import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int maxnum = Integer.MIN_VALUE;
        int num;

        while (count-- > 0) {
            num=Integer.parseInt(scanner.nextLine());
            if (num > maxnum) {
                maxnum = num;
            }


        }
        System.out.printf("Max number is, %d",maxnum);
    }
}
