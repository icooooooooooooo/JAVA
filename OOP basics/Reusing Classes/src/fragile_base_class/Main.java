package fragile_base_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Food> foods = new ArrayList<> () {{
            add (new Food ());
            add (new Food ());
            add (new Food ());
            add (new Food ());
            add (new Food ());
        }};

        Food food = new Food ();

        Predator predator = new Predator ();
        predator.feed (foods);
        predator.feed (food);

        System.out.println (predator.getHealth ());

    }
}
