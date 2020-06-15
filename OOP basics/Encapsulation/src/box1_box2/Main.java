package box1_box2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        double lenght = Double.parseDouble (scan.readLine ());
        double width = Double.parseDouble (scan.readLine ());
        double height = Double.parseDouble (scan.readLine ());
        Box box = null;
        try {
            box = new Box (lenght, width, height);
        } catch (IllegalArgumentException ex) {
            System.out.println (ex.getMessage ());
        }
        if (box != null) {
            System.out.println (box.toString ());
        }
    }
}
