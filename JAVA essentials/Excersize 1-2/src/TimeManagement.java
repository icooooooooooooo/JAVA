import java.util.Scanner;

public class TimeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int time = 3;
        int projects = Integer.parseInt(scanner.nextLine());
        int neededtime = time * projects;

        System.out.printf("The architect %s will need %d hours to complete %d of projects",name, neededtime, projects);
    }
}