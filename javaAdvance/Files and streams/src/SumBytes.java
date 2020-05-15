import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {


        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input = "input.txt";
        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            String line = reader.readLine ();
            int textSum = 0;
            while (line != null) {

                char[] arr = line.toCharArray ();
                for (char c : arr) {
                    textSum += c;
                }

                line = reader.readLine ();
            }
            System.out.println (textSum);


        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
