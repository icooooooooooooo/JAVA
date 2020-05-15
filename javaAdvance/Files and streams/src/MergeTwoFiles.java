import java.io.*;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class MergeTwoFiles {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input1 = "inputOne.txt";
        String input2 = "inputTwo.txt";

        String output = "output2.5.txt";

        try {
            ArrayDeque<String> queue = new ArrayDeque<> ();

            BufferedReader reader = new BufferedReader (new FileReader (location + input1));

            String line = reader.readLine ();
            while (line != null) {
                queue.add (line);

                line = reader.readLine ();
            }
            reader = new BufferedReader (new FileReader (location + input2));

            line = reader.readLine ();
            while (line != null) {
                queue.add (line);

                line = reader.readLine ();
            }

            reader.close ();

            PrintWriter writer = new PrintWriter (new FileWriter (location + output));
            while (!queue.isEmpty ()) {
                String element = queue.poll ();
                writer.println (element);
            }

            writer.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }


    }

}
