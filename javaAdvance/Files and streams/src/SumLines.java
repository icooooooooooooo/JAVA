import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SumLines {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input = "input.txt";


        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            String line = reader.readLine ();
            List<Integer> linesSums = new ArrayList<> ();
            while (line != null) {
                char[] symbols = line.toCharArray ();
                int lineSum = 0;
                for (char s : symbols) {
                    lineSum += (int)s;
                }
                linesSums.add (lineSum);
                line = reader.readLine ();
            }
            for (Integer linesSum : linesSums) {

                System.out.println (linesSum);
            }


        } catch (
                IOException e) {
            e.printStackTrace ();
        }
    }
}
