import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String inputWords = "words.txt";
        String inputText = "text.txt";
        String source = inputWords;
        String output = "output2.4.txt";


        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + source));
            List<String> words = new ArrayList<> ();
            String[] inputWordsArr = reader.readLine ().split (" ");
            Collections.addAll (words, inputWordsArr);

            source = inputText; // not sure if it is a good practice
            reader = new BufferedReader (new FileReader (location + source));

            Map<String, Integer> counter = new HashMap<> ();

            String line = reader.readLine ();
            while (line != null) {
                String[] lineArr = line.split (" ");
                int arrLength = lineArr.length;

                for (int i = 0; i < arrLength; i++) {
                    String word = lineArr[i];

                    if (words.contains (word)) {
                        if (!counter.containsKey (word)) {
                            counter.put (word, 0);
                        }
                        counter.replace (word, counter.get (word) + 1);
                    }
                }
                line = reader.readLine ();
            }
            reader.close ();
            PrintWriter writer = new PrintWriter (new FileWriter (location + output));

            for (Map.Entry<String, Integer> result : counter.entrySet ()) {
                String outputLine = result.getKey () + " - " + result.getValue ();
                System.out.println (outputLine);
                writer.println (outputLine);
            }
            writer.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
