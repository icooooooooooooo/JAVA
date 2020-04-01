import java.util.Scanner;

public class OneToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = Integer.parseInt(scanner.nextLine());
int i = 0;
        for (i=0;i<=limit;i++){
            System.out.println(i);
        }
    }
}
