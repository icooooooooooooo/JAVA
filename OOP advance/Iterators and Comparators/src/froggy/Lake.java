package froggy;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;

public class Lake<T> implements Iterable<T> {

    private List<T> lakeSpots;


    public Lake(List<T> numbers) {
        this.lakeSpots = numbers;
    }

    @Override
    public Iterator<T> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<T> {

        int location;
        boolean isEven = true;

        public Frog() {
            this.location=0;

        }

        @Override
        public boolean hasNext() {
            return lakeSpots.size() > location;

        }

        @Override
        public T next() {

            location += 2;
            T output = lakeSpots.get(location - 2);

            if (location % 2 == 0 && location >= lakeSpots.size()) {
                location = 1;
            }
            return output;

        }
    }
}
