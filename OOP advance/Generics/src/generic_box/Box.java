package generic_box;

import list_utilities.ListUtilities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private T item;

    public Box() {
    }

    public void setValue(T value) {
        this.item = value;
    }

    public String toString() {
        return String.format("%s: %s", this.item.getClass().getName(), this.item.toString());
    }

    public String toString(Box<T> box) {
        return String.format("%s: %s", box.item.getClass().getName(), item.toString());
    }

    public List<Box<T>> swap(List<Box<T>> list, String coordinates) {

        String[] locations = coordinates.split("\\s+");
        int loc1 = Integer.parseInt(locations[0]);
        int loc2 = Integer.parseInt(locations[1]);

        Box<T> item1 = list.get(loc1);
        Box<T> item2 = list.get(loc2);

        list.remove(loc1);
        list.add(loc1, item2);
        list.remove(loc2);
        list.add(loc2, item1);

        return list;
    }

    public <T extends Comparable> int count(List<Box<T>> list, T element) {
        int count = 0;

        for (Box<T> tBox : list) {
            if (tBox.item.compareTo(element) >0) {
                int check = element.compareTo(tBox.item);
                count++;
            }
        }

        return count;
    }

}
