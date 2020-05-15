import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NestedFolders {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        File dirLocation = new File (location);

        Deque<File> dirName = new ArrayDeque<> ();
        dirName.addLast (dirLocation);

        try {
            PrintWriter writer = new PrintWriter (new FileWriter (location + "output9.txt"));

            while (!dirName.isEmpty ()) {
                File currentDir = dirName.removeFirst ();
                // logic tester System.out.println (currentDir);

                writer.println (currentDir);
                File[] files = currentDir.listFiles ();

                for (File file : files) {
                    if (file.isDirectory ()) {
                        dirName.add (file);
                    }
                }
            }
            writer.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
