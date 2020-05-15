import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader (new InputStreamReader (System.in));

        int count = Integer.parseInt (scanner.readLine ());

        Map<String, Integer> nameAgeMap = new LinkedHashMap<> ();

        for (int i = 0; i < count; i++) {
            String[] input = scanner.readLine ().split (", ");
            nameAgeMap.putIfAbsent (input[0], Integer.parseInt (input[1]));
        }

        String condition = scanner.readLine ();
        int ageTurnpoint = Integer.parseInt (scanner.readLine ());
        String format = scanner.readLine ();

        Predicate<Integer> conditionFunc = condition (ageTurnpoint, condition);

        for (Map.Entry<String, Integer> person : nameAgeMap.entrySet ()) {
            if (conditionFunc.test (person.getValue ())) {
                getPring (format, person).accept (person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> getPring(String format, Map.Entry<String, Integer> person) {
        if ("name".equals (format)) {
            return e -> System.out.printf ("%s \n", e.getKey ());
        } else if ("age".equals (format)) {
            return e -> System.out.printf ("%d \n", e.getValue ());
        } else {
            return e -> System.out.printf ("%s %d \n", e.getKey (), e.getValue ());
        }
    }

    private static Predicate<Integer> condition(int ageTurnpoint, String condition) {
        if ("younger".equals (condition)) {
            return x -> x < ageTurnpoint;
        } else {
            return x -> x >= ageTurnpoint;
        }
    }
}

