package ol.P01_ExtendedArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T> {

    public T min() {
        Iterator<T> iterator = super.iterator();
        T min = iterator.next();

        while (iterator.hasNext()) {
            T element = iterator.next();
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T max() {
        Iterator<T> iterator = super.iterator();
        T max = iterator.next();

        while (iterator.hasNext()) {
            T element = iterator.next();
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
