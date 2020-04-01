import java.util.Scanner;

public class SameNumOnOddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            String currentNum = "" + i;
            int oddPosition = 0;
            int evenPosition = 0;

            for (int position = 0; position < currentNum.length(); position++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(position));

                if (position % 2 == 1) {
                    evenPosition = evenPosition + currentDigit;
                } else if (position % 2 == 0) {
                    oddPosition = oddPosition + currentDigit;
                }
            }
            if (oddPosition == evenPosition) {
                System.out.println(currentNum);
            }

        }


    }
}

