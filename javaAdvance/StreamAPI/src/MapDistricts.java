import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDistricts {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, List<Integer>> cityData = new HashMap<> ();

        String input = scan.readLine ();
        int boundary = Integer.parseInt (scan.readLine ());
        scan.close ();

        String[] elements = input.split ("\\s+");
        for (String element : elements) {
            String[] raw = element.split (":");
            String city = raw[0];
            Integer population = Integer.parseInt (raw[1]);

            if (!cityData.containsKey (city)) {
                cityData.computeIfAbsent (city, k -> new ArrayList<Integer> ()).add (population);
            } else {
                cityData.get (city).add (population);
            }
        }

        //for (Map.Entry<String, List<Integer>> stringListEntry : cityData.entrySet ()) {
        //    System.out.printf ("%s %s", stringListEntry.getKey (), stringListEntry.getValue ().toString ());
        //}

        cityData.entrySet ()
                .stream ()
                .filter (x -> {
                    int sum = x.getValue ().stream ().mapToInt (Integer::intValue).sum ();
                    if (sum > boundary) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .sorted ((kv1, kv2) -> {
                    int kv1Sum = kv1.getValue ().stream ().reduce ((x, y) -> x + y).get ();
                    int kv2Sum = kv2.getValue ().stream ().reduce ((x, y) -> x + y).get ();
                    return Integer.compare (kv2Sum, kv1Sum);
                })
                .forEach (x -> {
                    System.out.printf ("%s: ", x.getKey ());
                    x.getValue ().stream ().sorted ((z, y) -> y.compareTo (z)).forEach (p -> System.out.printf ("%d ", p));
                    System.out.println (" ");
                });

    }
}