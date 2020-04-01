import java.util.Scanner;

public class Geaduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double totalGrade = 0;
        int count = 1;
        int expellCount = 0;

        while (count <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                count++;
                totalGrade += grade;

            } else {
                expellCount++;
            }
            if (expellCount == 2) {
                break;
            }
        }

        if (expellCount == 2) {
            System.out.printf("Expelled at %d grade.", count);
        } else {
            System.out.printf("The %s average grade is %.2f", name, totalGrade / 12);
        }
    }
}

