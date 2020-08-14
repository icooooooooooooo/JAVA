package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> set1 = new TreeSet<>(new CompareByName());
        Set<Person> set2 = new TreeSet<>(new CompareByAge());

        int elements = Integer.parseInt(scan.readLine());

        while (elements-- > 0) {
            String[] inputArgs = scan.readLine().split("\\s+");
            Person person = new Person(inputArgs[0], Integer.parseInt(inputArgs[1]));

            set1.add(person);
            set2.add(person);
        }

        for (Person person : set1) {
            System.out.println(person.print());
        }
        for (Person person : set2) {
            System.out.println(person.print());

        }

    }
}

