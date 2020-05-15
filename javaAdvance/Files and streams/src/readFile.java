import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {

        String folder = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String fileName = "input.txt";
        String pathConcat = folder + fileName;
        String path = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\input.txt";

        try {
            FileInputStream fis = new FileInputStream (path);
            int oneByte = fis.read ();

            while (oneByte >= 0) {


                System.out.printf ("%s ", Integer.toBinaryString (oneByte));
                oneByte = fis.read ();
            }

            fis.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
