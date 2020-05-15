import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<String> guests = Arrays.stream (scan.readLine ().split ("\\s+")).collect (Collectors.toList ());

        String input = scan.readLine ();
        while (!"Party!".equals (input)) {
            String[] command = input.split ("\\s+");

            String process = command[0];
            String condition = command[1];
            String variable = command[2];
            List<String> temp = new ArrayList<> ();

            if ("Remove".equals (process)) {
                guests.removeIf (getFilter (condition, variable));
            } else if ("Double".equals (process)) {
                for (String name : guests) {
                    if (getFilter (condition, variable).test (name)) {
                        temp.add (name);//condition when you are doubling somebody
                    }
                    temp.add (name);//filling in the rest of the crew
                }
                guests = temp; //updating the original list
            }
            input = scan.readLine ();
        }

        if (guests.isEmpty ()) {
            System.out.println ("Nobody is going to the party!");
        } else {
            System.out.printf (String.join (", ",guests)+" are going to the party!");
        }
    }

    private static Predicate<String> getFilter(String filterType, String filterArg) {
        if ("StartsWith".equals (filterType)) { // boolean that triggers the boolean
            return x -> x.startsWith (filterArg); // general logic when you test with a value
        } else if ("EndsWith".equals (filterType)) {
            return x -> x.endsWith (filterArg);
        } else if ("Length".equals (filterType)) {
            return x -> x.length () == Integer.parseInt (filterArg);
        } else {
            return x -> false;
        }
    }
}
