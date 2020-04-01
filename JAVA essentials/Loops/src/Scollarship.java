import java.util.Scanner;

public class Scollarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minimumsallary = Double.parseDouble(scanner.nextLine());

        if (grade<4.5 || income>minimumsallary){
            System.out.printf("You cannot get a scholarship!");
        } else if (grade<5.5&&income<minimumsallary) {
            System.out.printf("You get a Social scholarship %.2f BGN", 0.35*minimumsallary);
        } else  if (grade>5.5&&grade<6.0) {
            if (0.35*minimumsallary>grade*25) {
                System.out.printf("You get a Social scholarship %.2f BGN", 0.35*minimumsallary);
            } else {
                System.out.printf("You get a scholarship for excellent results %.2f BGN", grade * 25);
            }
        }
    }
}
