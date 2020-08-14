package listyIterator;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class ListyIterator implements Iterable<String> {

    private String[] collection;
    private int index;

    public ListyIterator(String... collection) {
        this.collection = collection;
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.index < collection.length - 1;
    }

    public void print() {
        if (this.collection.length > 0) {
            System.out.println(collection[index]);
        } else System.out.println("Invalid Operation!");
    }


    public String PrintAll() {
        StringBuilder sb = new StringBuilder();
        for (String s : this) {
            sb.append(s).append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    @Override
    public Iterator<String> iterator() {
        return new IterableCollection();
    }

    private final class IterableCollection implements Iterator<String> {

        private int location;

        public IterableCollection() {
        }

        @Override
        public boolean hasNext() {
            return location < collection.length;
        }

        @Override
        public String next() {

                return collection[location++];
            }
    }
}
