import java.util.Scanner;

public class Graduationv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double totalGrade = 0;
        int classCounter = 1;
        int expellCount = 0;

        while (classCounter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                classCounter++;
                totalGrade += grade;
            } else {
                expellCount++;
            }
            if (expellCount==2){
                break;
            }
        }
        if (expellCount==2) {
            System.out.printf("%s failed at %dth grade",name,classCounter);
        } else {
            System.out.printf("%s graduated with %.2f",name, totalGrade/12);
        }
    }
}