import java.util.Scanner;

public class Sallary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= tabs; i++) {
            String name = scanner.nextLine();
            switch (name) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
                    }
        if (salary!=0){
            System.out.printf("%d",salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
