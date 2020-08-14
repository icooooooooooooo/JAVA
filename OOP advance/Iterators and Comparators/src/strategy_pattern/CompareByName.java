package strategy_pattern;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class CompareByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        //first comparator should compare people based on
        // the length of their name as a first parameter,
        // if 2 people have a name with the same length,
        // perform a case-insensitive compare based on the first letter of their name instead

        int compareByNameLenght = o1.getName().length() - o2.getName().length();
        if (compareByNameLenght != 0) {
            return compareByNameLenght;
        }

        char startLettero1 = o1.getName().charAt(0);
        char startLettero2 = o2.getName().charAt(0);

        return String.valueOf(startLettero1).compareToIgnoreCase(String.valueOf(startLettero2));
    }
}
