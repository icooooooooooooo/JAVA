import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade>=5.50){
            System.out.println("Excellent");
        } else if (grade>=4.5){
            System.out.println("Very Good");
        } else if (grade>=3.5){
            System.out.println("Good");
        } else if (grade>=2.5){
            System.out.println("Average");
        } else {
            System.out.println("Failed");
        }
    }
}
