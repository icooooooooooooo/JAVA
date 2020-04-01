import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Integer.parseInt(scanner.nextLine());
        String inputmeasure = scanner.nextLine();
        String outputmeasure = scanner.nextLine();

        inputmeasure.toLowerCase();
        outputmeasure.toLowerCase();

        if (inputmeasure.equals("mm")) {
            lenght /=1000;
        } else if (inputmeasure.equals("cm")) {
            lenght/=100;
        } else if (inputmeasure.equals("m")) {
            lenght/=1;
        } else {
            System.out.printf("Input measure error.");
        }
        if (outputmeasure.equals("mm")) {
            lenght *=1000;
        } else if (outputmeasure.equals("cm")) {
            lenght *=100;
        } else if (outputmeasure.equals("m")) {
            lenght *=1;
        } else {
            System.out.printf("Output measure error.");
        }
        System.out.printf("Lenght is %.3f",lenght);
    }
}
