import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        char[] input = scanner.nextLine ().toCharArray ();
        int length = input.length;

        Map<Character, Integer> map = new TreeMap<> ();

        for (int i = 0; i < length; i++) {
            if (!map.containsKey (input[i])) {
                map.put (input[i], 0);
            }
            map.replace (input[i], map.get (input[i]).intValue () + 1);
        }

        for (Map.Entry<Character, Integer> element : map.entrySet ()) {
            System.out.printf ("%s: %d time/s\n", element.getKey (), element.getValue ());
        }
    }
}
