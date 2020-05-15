import java.io.*;

public class CopyAPicture {
    public static void main(String[] args) {

        /*
        rite a program that makes a copy of a .jpg file
        using FileInputStream, FileOutputStream, and byte[] buffer.
        Set the name of the new file as picture-copy.jpg.
         */
        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String original = "ex.jpg";
        String copy = "ex-copy.jpg";

        try {
            FileInputStream fis = new FileInputStream (new File (location + original));
            FileOutputStream fos = new FileOutputStream (new File (location + copy));
fos.write (
            byte[] picInBytes = fis.readAllBytes ();

            fos.write (picInBytes);

        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
