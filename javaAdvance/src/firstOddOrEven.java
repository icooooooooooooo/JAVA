import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class firstOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numArrInStr = scanner.nextLine().split(" ");
        int numLenght = numArrInStr.length;
        int[] numArr = new int[numLenght];
        for (int i = 0; i < numLenght; i++) {
            numArr[i] = Integer.parseInt(numArrInStr[i]);
        }

        String[] command = scanner.nextLine().split(" ");
        int maxSequence = Integer.parseInt(command[1]);
        String type = command[2];

        int stopCounter = 0;


        if ("even".equals(type)) {
            for (int i = 0; i < numLenght; i++) {

                if (stopCounter < maxSequence) {
                    if (numArr[i] % 2 == 0) {
                        System.out.printf(numArr[i] + " ");
                        stopCounter++;
                    }
                } else {
                    break;
                }
            }

        } else if ("odd".equals(type)) {
            for (int i = 0; i < numLenght; i++) {
                if (stopCounter < maxSequence) {
                    if (numArr[i] % 2 != 0) {
                        System.out.printf(numArr[i] + " ");
                        stopCounter++;
                    }
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Invalid input");
        }


    }
}
