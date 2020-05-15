import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String input = "input1.txt";
        String output = "output7.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            String line = reader.readLine ();
            ArrayList<String> lines = new ArrayList<> ();

            while (line != null) {
                lines.add (line);
                line = reader.readLine ();
            }
            reader.close ();

            Collections.sort (lines);

            PrintWriter writer = new PrintWriter (new FileWriter (location + output));
            for (String ln : lines) {
                writer.println (ln);
            }
            writer.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
