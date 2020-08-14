package custom_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable> implements Iterable {

    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<T>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public boolean contains(T element) {
        boolean isPresent = false;
        for (T t : this.list) {
            if (t.compareTo(element) == 0) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public void swap(int index1, int index2) {
        T element1 = this.list.get(index1);
        T element2 = this.list.get(index2);

        this.list.remove(index1);
        this.list.add(index1, element2);
        this.list.remove(index2);
        this.list.add(index2, element1);
    }

    public int countGreaterThan(T element) {
        int conunt = 0;

        for (T t : list) {
            if (element.compareTo(t) < 0) {
                conunt += 1;
            }
        }
        return conunt;
    }

    public T getMax() {
        T max = null;
        if (this.list.size() == 0) {
            max = null;
        } else if (this.list.size() == 1) {
            max = this.list.get(0);
        } else {
            max = this.list.get(0);
            for (T e : this.list) {
                if (e.compareTo(max) > 0) {
                    max = e;
                }
            }
        }
        return max;
    }

    public T getMin() {
        T min = null;
        if (this.list.size() == 0) {
            min = null;
        } else if (this.list.size() == 1) {
            min = this.list.get(0);
        } else {
            min = this.list.get(0);
            for (T e : this.list) {
                if (e.compareTo(min) < 0) {
                    min = e;
                }
            }
        }
        return min;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();

        this.list.stream().forEach(t -> sb.append(t.toString()).append(System.lineSeparator()));

        String result = sb.toString().substring(0, sb.length() - 1);
        return result;
    }

    public void sort() {
        this.list.sort(Comparator.naturalOrder());
    }

    @Override
    public Iterator iterator() {
        return this.list.iterator();
    }

}
