import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
//if not a class -> Map<Integer,List<String>>
        List<Person> people = new ArrayList<> ();
        String input = scan.readLine ();

        while (!"END".equals (input)) {
            String[] raw = input.split ("\\s+");
            StringBuilder name = new StringBuilder ();
            int group = Integer.parseInt (raw[2]);
            name.append (raw[0]).append (" ").append (raw[1]);

            Person person = new Person (name.toString (), group);
            people.add (person);
            input = scan.readLine ();
        }
        scan.close ();

        Map<Integer, List<Person>> peoplePerGroup = people.stream ()
                .sorted (Comparator.comparing (x -> x.group))
                .collect (Collectors.groupingBy (Person::getGroup));

        peoplePerGroup
                .forEach ((key, value) ->
                        System.out.printf ("%d - %s \n", key, String.join (", ", value.stream ()
                                .map (p -> p.getName ()).collect (Collectors.toList ()))));
    }
}

class Person {

    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    String name;
    int group;

    public Person(String name, int group) {
        this.name = name;
        this.group = group;
    }

}
