import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String fileName = "input.txt";
        String output = "output3.txt";

        try {
            FileInputStream fis = new FileInputStream (location + fileName);
            FileOutputStream fos = new FileOutputStream (location + output);

            int space = 32;
            int newLine = 10;
            int oneByte = fis.read ();

            while (oneByte >= 0) {
                if (oneByte == newLine || oneByte == space) {
                    fos.write (oneByte);
                } else {
                    String digit = String.valueOf (oneByte);
                    for (int i = 0; i < digit.length (); i++) {
                        fos.write (digit.charAt (i));
                    }
                }

                oneByte = fis.read ();
            }
            fis.close ();
            fos.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
