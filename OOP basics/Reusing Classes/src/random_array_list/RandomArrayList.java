package random_array_list;

import javax.swing.text.Element;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    /*
    Add additional function that returns and removes a random element from the list.
    •	Public method: getRandomElement(): Object
     */

    public Object removeRandomElement() {

        if (!super.isEmpty ()) {
            Random random = new Random ();
            int index = random.nextInt (super.size () - 1);
            Object e = super.get (index);
            super.remove (index);
            return e;


        } else if (super.size () == 1) {
            Object e = super.get (0);
            super.remove (0);
            return super.get (0);

        } else {
            throw new InvalidParameterException ("Something went wrong -> debug");
        }

    }

}
