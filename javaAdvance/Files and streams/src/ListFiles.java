import java.io.*;

public class ListFiles {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";

        File directory = new File (location);

        File[] files = directory.listFiles ();

        try {
            PrintWriter writer = new PrintWriter (new FileWriter (location + "output8.txt"));
            for (File file : files) {
                System.out.println (file);

                writer.println (file);
                //  Method test
                //if(file.isDirectory ()){
                //    System.out.println ("Directory ^");
                //}

            }
            writer.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        for (File file : files) {
            System.out.println (file);

            //  Method test
            //if(file.isDirectory ()){
            //    System.out.println ("Directory ^");
            //}
        }

    }
}
