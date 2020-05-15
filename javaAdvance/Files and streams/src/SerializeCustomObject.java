import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) {
        String location = "C:\\Users\\Hristo\\Desktop\\JAVA\\JAVA\\javaAdvance\\Files and Streams\\resources\\";
        String stringPath = location + "object.ser";


        Cube cube1 = new Cube ("green", 1.0, 24.0, 11.0);

        try {
            FileOutputStream fos = new FileOutputStream (stringPath);
            ObjectOutputStream oos = new ObjectOutputStream (fos);

            oos.writeObject (cube1);

            ObjectInputStream ois = new ObjectInputStream (new FileInputStream (stringPath));

            Cube imported = (Cube) ois.readObject ();

            System.out.println (imported);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        }

    }


}

