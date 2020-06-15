import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DHARMASupplies {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<String> crates = new ArrayList<> ();

        String regex = "[\\[].*?[]]";
        Pattern pattern = Pattern.compile (regex);

        String input = scan.readLine ();


        int lines = 0;
        while (!"Collect".equals (input)) {
            lines += 1;
            Matcher matcher = pattern.matcher (input);

            while (matcher.find ()) {
                String crate = matcher.group ();
                crates.add (crate);
            }

            input = scan.readLine ();
        }
        int N = crates.size () / lines;

        List<Integer> foodCrates = new ArrayList<> ();
        List<Integer> drinkCrates = new ArrayList<> ();

        Pattern pattern1 = Pattern.compile ("(\\[)(#[0-9]{" + N + "}|#[a-z]{" + N + "})([0-9a-zA-Z\\s+]*)\\2(\\])");


        for (String crate : crates) {
            Matcher matcher = pattern1.matcher (crate);

            if (matcher.find ()) {
                String type = matcher.group (2);
                if (type.charAt (0) == '#') {
                    type = type.substring (1);
                }
                String beverage = matcher.group (3);

                if (Character.isDigit (type.charAt (0))) {
                    foodCrates.add (food (beverage, type));
                } else if (Character.isLowerCase (type.charAt (0))) {
                    drinkCrates.add (drink (beverage, type));
                }
            }
        }

        if (foodCrates.size () + drinkCrates.size () <= 0) {
            System.out.println ("No supplies found!");
        } else {
            System.out.printf ("Number of supply crates: %d\n", foodCrates.size () + drinkCrates.size ());
            System.out.printf ("Amount of food collected: %d\n", foodCrates.stream ().mapToInt (x -> x).sum ());
            System.out.printf ("Amount of drinks collected: %d", drinkCrates.stream ().mapToInt (x -> x).sum ());
        }

    }
//•	The amount of food in the food crates is calculated by multiplying the sum of the supply body unique ascci codes
// with the length of the supply tag(without the "#").

    private static Integer food(String beverage, String type) {
        int result = 0;

        int foodSum = 0;
        Set<Character> letters = new HashSet<> ();
        for (int i = 0; i < beverage.length (); i++) {
            letters.add (beverage.charAt (i));
        }
        for (Character letter : letters) {
            foodSum += letter;
        }

        int multiplier = type.length ();


        result = multiplier * foodSum;
        return result;
    }

    //•	The amount of drinks is calculated by multiplying the sum of the supply body ascci codes
// with the sum of the supply tag ascii codes(without the "#").
    private static Integer drink(String beverage, String type) {
        int result = 0;

        int drinkSum = 0;
        for (int i = 0; i < beverage.length (); i++) {
            drinkSum += beverage.charAt (i);
        }

        int multiplier = 0;
        for (char c : type.toCharArray ()) {
            multiplier += c;
        }

        result = multiplier * drinkSum;
        return result;
    }
}

