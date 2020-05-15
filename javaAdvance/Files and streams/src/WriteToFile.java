import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String fileName = "input.txt";
        String output = "output.txt";
        List<Character> skip = new LinkedList<> () {
        };
        Collections.addAll (skip, ',', '.', '!', '?');

        String path = location + fileName;

        try {
            FileInputStream fis = new FileInputStream (path);
            FileOutputStream fos = new FileOutputStream (location + output);

            int reader = fis.read ();

            while (reader >= 0) {
                char symbol = (char) reader;

                if (!skip.contains (symbol)) {
                    fos.write (symbol);
                }
                reader = fis.read ();
            }

            fis.close ();
            fos.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
