import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<String, Integer> resources = new LinkedHashMap<> ();
        String input = scanner.nextLine ();
        String resource = "isEmpty";
        int quantity = 0;

        int count = 0;
        while (!"stop".equals (input)) {
            count++;
            if (count % 2 != 0) {
                resource = input;
            } else if (count % 2 == 0) {
                quantity = Integer.parseInt (input);
                if (!resources.containsKey (resource)) {
                    resources.put (resource, 0);
                }
                resources.replace (resource, resources.get (resource).intValue () + quantity);

            }
            input = scanner.nextLine ();
        }
        for (Map.Entry<String, Integer> element : resources.entrySet ()) {
            System.out.printf ("%s -> %d\n", element.getKey (), element.getValue ());
        }
    }
}
