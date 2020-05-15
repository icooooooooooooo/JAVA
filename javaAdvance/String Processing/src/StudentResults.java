import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine ().split (" - ");
        String name = input[0];

        double[] grades = Arrays.stream (input[1].split (", "))
                .mapToDouble (Double::parseDouble)
                .toArray ();
        double sum=0;
        for (double grade : grades) {
            sum+=grade;
        }

        System.out.printf ("Name      |   JAdv|JavaOOP| AdvOOP|Average|\n");
        System.out.printf ("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name,grades[0],grades[1],grades[2],sum/grades.length);
    }
}
