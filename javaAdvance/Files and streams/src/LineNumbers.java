import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input = "inputLineNumbers.txt";
        String output = "output2.3.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            PrintWriter writer = new PrintWriter (new FileWriter (location + output));

            int lineNum = 0;
            String line = reader.readLine ();
            while (line != null) {
                ++lineNum;
                line = lineNum + ". " + line;
                writer.println (line);

                line = reader.readLine ();
            }
            reader.close ();
            writer.close ();


        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
