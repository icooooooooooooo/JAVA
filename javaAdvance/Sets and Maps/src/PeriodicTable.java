import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int loops = Integer.parseInt (scanner.nextLine ());

        Set<String> elements = new TreeSet<> ();
        for (int i = 0; i < loops; i++) {
            String[] chemicals = scanner.nextLine ().split ("\\s+");
            for (int j = 0; j < chemicals.length; j++) {
                String element = chemicals[j];
                elements.add (element);
            }
        }
        for (String element : elements) {
            System.out.print (element+ " ");
        }
    }
}
