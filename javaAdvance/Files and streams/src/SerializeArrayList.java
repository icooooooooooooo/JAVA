import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeArrayList {
    public static void main(String[] args) {

        /*
            Write a program that saves and loads an ArrayList of doubles
         to a file using ObjectInputStream and ObjectOutputStream.
         Set the name of the file as list.ser.
         */
        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\Exercises Resources\\";
        String name = "list.ser";
        List<Double> list = new ArrayList<> ();
        Collections.addAll (list, 8.9, 7.6);
        try {
            ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (location + name));
            oos.writeObject (list);


            ObjectInputStream ois = new ObjectInputStream (new FileInputStream (location + name));
            List<Double> result =(List<Double>) ois.readObject ();

            for (Double aDouble : result) {
                System.out.println (aDouble);
            }

        } catch (IOException e) {
            e.printStackTrace ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }


    }
}
