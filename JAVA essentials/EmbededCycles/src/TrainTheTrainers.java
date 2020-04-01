import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double whileLoop = 0;
        double forLoop = 0;
        double regex = 0;
        double arrays = 0;
        double lists = 0;
        double objectsandclasses = 0;
        double dictionaries = 0;
        int presentationCounter = 0;
        double cumulativeGrade = 0;

        while (!input.equals("Finish")) {
            presentationCounter++;
            double grade = 0;
            double presentationGrade = 0;
            for (int i = jury; 0 < i; i--) {
                grade = Double.parseDouble(scanner.nextLine());
                cumulativeGrade += grade;
                presentationGrade+=grade;
                switch (input) {
                    case "While-Loop":
                        whileLoop += grade;
                        break;
                    case "For-Loop":
                        forLoop += grade;
                        break;
                    case "Arrays":
                        arrays += grade;
                        break;
                    case "Lists":
                        lists += grade;
                        break;
                    case "Objects and Classes":
                        objectsandclasses += grade;
                        break;
                    case "RegEx":
                        regex += grade;
                        break;
                    case "Dictionaries":
                        dictionaries += grade;
                        break;
                }

            }
            System.out.printf("%s - %.2f.\n", input, presentationGrade / jury);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f", cumulativeGrade / (jury * presentationCounter));


    }
}
