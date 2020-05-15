import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int entries = Integer.parseInt (scanner.nextLine ());
        Set<String> students = new HashSet<> ();

        for (int i = 0; i < entries; i++) {
            String input = scanner.nextLine ();
            students.add (input);
        }
        for (String name : students) {
            System.out.println (name);
        }
    }
}
