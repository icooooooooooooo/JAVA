import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] lengths = Arrays
                .stream (scanner.nextLine ()
                        .split (" "))
                .mapToInt (Integer::parseInt)
                .toArray ();

        int length1 = lengths[0];
        int length2 = lengths[1];
        Set<Integer> numbers1 = new HashSet<> ();
        Set<Integer> numbers2 = new HashSet<> ();

        for (int i = 0; i < length1; i++) {
            funnel (scanner, numbers1);
        }
        for (int i = 0; i < length2; i++) {
            funnel (scanner, numbers2);
        }
        for (int i = 0; i < length1; i++) {
            Iterator compare1 = numbers1.iterator ();
            int rival = (int) compare1.next ();

            for (Integer integer : numbers2) {
                if ( rival == integer){
                    System.out.print (integer+" ");
                }
            }
            numbers1.remove (rival);
        }
    }

    private static void funnel(Scanner scanner, Set<Integer> numbers1) {
        int input = Integer.parseInt (scanner.nextLine ());
        numbers1.add (input);
    }
}
