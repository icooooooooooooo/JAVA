import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class GetFolderSize {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";

        ArrayDeque<File> queue = new ArrayDeque<> ();
        File directory = new File (location);
        queue.add (directory);
        long size = 0;

        while (true) {
            if (queue.isEmpty ()){
                break;
            }
            File[] files = queue.poll ().listFiles ();

            for (File file : files) {
                if (file.isDirectory ()) {
                    queue.add (file);
                } else if (file.isFile ()) {
                    size += file.length ();
                }
            }
        }
        System.out.println (size);
    }
}
