import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameValuesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<String, Integer> counter = new HashMap<> ();

        String[] values = scanner.nextLine ().split (" ");

        int length = values.length;
        for (int i = 0; i < length; i++) {
            if (!counter.containsKey (values[i])) {
                counter.put (values[i], 0);
            }
            counter.replace (values[i], counter.get (values[i]) + 1);
            //test System.out.println (counter.get (values[i]));
        }

        for (Map.Entry<String, Integer> number : counter.entrySet ()) {
            System.out.printf ("%s - %d \n", number.getKey (), number.getValue ());
        }
    }
}
