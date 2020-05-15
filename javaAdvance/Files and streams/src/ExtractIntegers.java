import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String input = "input.txt";

        try {
            FileInputStream fis = new FileInputStream (location + input);
            Scanner scanner = new Scanner (fis);


            while (scanner.hasNext ()) {
                if (scanner.hasNextInt ()) {
                    System.out.println (scanner.nextInt ());
                }
                scanner.next ();
            }

            fis.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
