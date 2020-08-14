package comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));


        String input;
        List<Person> people = new ArrayList<>();

        while (!"END".equals(input = scan.readLine())) {
            String[] arguments = input.split("\\s+");
            Person person = new Person(arguments[0], Integer.parseInt(arguments[1]), arguments[2]);
            people.add(person);
        }

        int n = Integer.parseInt(scan.readLine());
        if (people.size() <= n && n >= 0) {
            System.out.println("No matches");
        } else {
            Person person = people.get(n);

            long equalPeople = people
                    .stream()
                    .filter(person1 -> person1.compareTo(person) == 0)
                    .count();
            long unequalPeople = people.size() - equalPeople;
            int totalPeople = people.size();

            //On the single output line, you should bring statistics,
            // how many people are equal to him,
            // how many people are not equal to him
            // and the total people in your collection.
            //Format:
            //{number of equal people} {number of not equal people} {total number of people}
            System.out.println(String.format("%d %d %d", equalPeople, unequalPeople, totalPeople));
        }

    }
}
