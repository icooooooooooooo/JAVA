package random_array_list;

import javax.swing.text.Element;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomArrayList names = new RandomArrayList () {{
            add ("Petko");
            add ("Mitko");
            add ("Jecho");
            add ("Toni");
            add ("Kosio");
        }};

        try {
            System.out.println (names.removeRandomElement ());
            System.out.println (names.size ());

        } catch (InvalidParameterException ex) {
            ex.getMessage ();
        }


    }
}
