import java.io.*;

public class WriteEverythirdLine {
    public static void main(String[] args) {


        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String input = "input.txt";
        String output = "output6.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));
            PrintWriter out = new PrintWriter (new FileWriter (location + output));
            int count = 0;
            String line = reader.readLine ();
            while (line != null) {
                ++count;
                if (count % 3 == 0) {
                    System.out.println (line);
                    out.println (line);
                }
                line = reader.readLine ();
            }
            out.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
