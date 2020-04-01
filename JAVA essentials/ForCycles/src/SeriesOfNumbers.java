import java.util.Scanner;

public class SeriesOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //total number of numbers
        int number = 0; //allocating memory for the new numbers

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number > Max) {
                Max = number;
            }
            if (number < Min) {
                Min = number;
            }
        }
        System.out.printf("min num is %d\nmax num is %d",Min,Max);
    }
}