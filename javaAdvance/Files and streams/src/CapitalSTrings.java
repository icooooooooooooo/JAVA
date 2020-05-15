import java.io.*;

public class CapitalSTrings {
    public static void main(String[] args) {

        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String input = "input.txt";
        String output = "output2.1.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader (location + input));

            PrintWriter write = new PrintWriter (new FileWriter (location + output));


            String line = reader.readLine ();
            while (line != null) {
                write.println (line.toUpperCase ());
                line = reader.readLine ();
            }
            reader.close ();
            write.close ();


        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
