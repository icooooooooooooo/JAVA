import java.util.Scanner;

public class examPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedBadGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double grade = 0;

        int badGradeCounter = 0;
        int issuesResolved = 0;
        double gradeSummary = 0;
        String lastIssue = null;

        boolean enough = "Enough".equals(input);

        while (!enough) {
            grade = Integer.parseInt(scanner.nextLine());
            issuesResolved++;
            gradeSummary += grade;
            if (grade <= 4) {
                badGradeCounter++;
            }
            if (badGradeCounter == allowedBadGrades) {
                break;
            }
            lastIssue=input;
            input = scanner.nextLine();

        }

        if (input.equals("Enough")) {
            System.out.println(String.format("Average score: %.2f", gradeSummary / issuesResolved));
            System.out.println(String.format("Number of problems: %d", issuesResolved));
            System.out.println(String.format("Last problem: %s", lastIssue));
        } else if (allowedBadGrades == badGradeCounter)
            System.out.printf("You need a break, %d poor grades.", badGradeCounter);
    }
}