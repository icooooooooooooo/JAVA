import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int studentCount = Integer.parseInt (scanner.nextLine ());
        Map<String, Double> students = new TreeMap<> ();

        for (int i = 0; i < studentCount; i++) {
            String name = scanner.nextLine ();
            double[] gradesArr = Arrays
                    .stream (scanner.nextLine ().split (" "))
                    .mapToDouble (Double::parseDouble)
                    .toArray ();
            double avgGrade = getAvgGrade (gradesArr);
            students.put (name, avgGrade);
        }
        for (Map.Entry<String, Double> student : students.entrySet ()) {
            System.out.printf ("%s, is graduated with %s\n", student.getKey (), student.getValue ().toString ());
        }

    }

    private static double getAvgGrade(double[] gradesArr) {
        double total = 0;
        for (double grade : gradesArr) {
            total += grade;
        }
        int elements = gradesArr.length;
        double average = total / elements;

        return average;
    }
}
