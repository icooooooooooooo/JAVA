import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int l = input.length() - 1; l >= 0; l--) {

            char currentNum = input.charAt(l);
            int charToNum = Integer.parseInt("" + currentNum);

            //System.out.printf("%c\n", charToNum + 33);
            //System.out.println(charToNum);
            if (charToNum == 0) {
                System.out.print("ZERO");
            }

            for (int row = 1; row <= charToNum; row++) {

                System.out.print((char) (charToNum + 33));

            }
            System.out.println("");

        }
    }

}

