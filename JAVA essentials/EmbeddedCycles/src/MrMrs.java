import java.util.Scanner;

public class MrMrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        switch (gender) {
            case "f":
                if (age > 16) {
                    System.out.printf("Miss");
                } else {
                    System.out.printf("Ms");
                }
                break;
            case "m":
                if (age > 16) {
                    System.out.printf("Mr");
                } else {
                    System.out.printf("Master");
                }
                break;}
        }
    }

