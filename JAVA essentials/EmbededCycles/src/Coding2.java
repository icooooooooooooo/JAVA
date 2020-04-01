import java.util.Scanner;

public class Coding2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numInput = scanner.nextLine();
        //int lenght = numInput.length();

        for (int position = numInput.length() - 1; position >= 0; position--) {
            //System.out.println(numInput);
            char currentNum = numInput.charAt(position);
            int numToChar = Integer.parseInt("" + currentNum);
            //System.out.println(currentNum);

            for (int i = numToChar; i > 0; i--) {

                System.out.printf("%c", numToChar + 33);
            }
            if (numToChar != 0) {
                System.out.println("");
            } else {
                System.out.println("ZERO");
            }
        }
    }

}

