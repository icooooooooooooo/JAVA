package jar_of_T;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Jar<T> {

    private Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();

    }

    public void add(T element) {
        this.elements.push(element);
    }

    public <T> T remove() {
        return (T) this.elements.pop();
    }

}
