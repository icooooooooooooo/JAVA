package shopping_spree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        //On the first two lines you are given all people and all products.

        String[] people = scan.readLine ().split (";");
        String[] products = scan.readLine ().split (";");

        Map<String, Person> personList = new HashMap<> ();
        for (String person : people) {
            String[] raw = person.split ("=");
            String name = raw[0];
            try {
                Person buyer = new Person (raw[0], Double.parseDouble (raw[1]));
                personList.putIfAbsent (name, buyer);
            } catch (Exception ex) {
                System.out.println (ex.getMessage ());
            }
        }

        Map<String, Product> productList = new HashMap<> ();

        //TODO rewrite as
        // Stream
        // .foreach(p-> {
        // split
        // define elements
        // call constructort
        // add elementto list
        // )

        for (String product : products) {
            String[] raw = product.split ("=");
            String name = raw[0];

            Product item = new Product (raw[0], Double.parseDouble (raw[1]));
            productList.putIfAbsent (name, item);
        }

        String command = scan.readLine ();
        while (!"END".equals (command)) {
            String[] raw = command.split ("\\s+");
            String person = raw[0];
            String purchase = raw[1];
            if (personList.get (person) != null) {
                try {
                    System.out.println (personList.get (person).purchase (productList.get (purchase)));
                } catch (Exception ex) {
                    System.out.println (ex.getMessage ());
                }
            }
            command = scan.readLine ();
        }

        for (Person person : personList.values ()) {
            if (person != null) {
                System.out.println (person.allPurchases ());
            }
        }

    }
}


// After all purchases print every person in the order of appearance and all products that he has bought also in order of appearance.
// If nothing is bought, print the name of the person followed by "Nothing bought".



