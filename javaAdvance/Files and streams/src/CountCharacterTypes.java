import java.io.*;
import java.util.*;

public class CountCharacterTypes {
    public static void main(String[] args) {


        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input = "input.txt";
        String output = "output2.2.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            List<Character> chars = new ArrayList<> ();
            Collections.addAll (chars, '!', ',', '.', '?');
            List<Character> vowels = new ArrayList<> ();
            Collections.addAll (vowels, 'a', 'e', 'i', 'o', 'u');

            Map<String, Integer> counter = new HashMap<> ();

            //Vowels: 41
            //Consonants: 72
            //Punctuation: 6
            String line = reader.readLine ();
            while (line != null) {
                //line = line.toLowerCase ();
                char[] symbols = line.toCharArray ();

                for (char symbol : symbols) {

                    if (chars.contains (symbol)) {
                        if (!counter.containsKey ("Punctuation")) {
                            counter.put ("Punctuation", 0);
                        }
                        counter.replace ("Punctuation", counter.get ("Punctuation") + 1);
                    } else if (vowels.contains (symbol)) {
                        if (!counter.containsKey ("Vowels")) {
                            counter.put ("Vowels", 0);
                        }
                        counter.replace ("Vowels", counter.get ("Vowels") + 1);

                    } else if (symbol != 32) {
                        if (!counter.containsKey ("Consonants")) {
                            counter.put ("Consonants", 0);
                        }
                        counter.replace ("Consonants", counter.get ("Consonants") + 1);
                    }
                }
                line = reader.readLine ();
            }
            reader.close ();

            PrintWriter writer = new PrintWriter (new FileWriter (location + output));
            for (Map.Entry<String, Integer> pair : counter.entrySet ()) {
                String concatinated = pair.getKey () + ": " + pair.getValue ();
                writer.println (concatinated);
            }
            writer.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
