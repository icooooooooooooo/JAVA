package stack_iterator;

import java.util.*;

public class MyStack<T> implements Iterable<T> {
    private static final int INITIAL_CAPACITY = 16;

    private T[] stack;
    private int elementCount;

    private void growStack() {
        this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
    }

    @SuppressWarnings("unchecked")
    public MyStack() {
        this.stack = (T[]) new Object[INITIAL_CAPACITY];
    }


    @Override
    public Iterator iterator() {
        return new MyStackIterator();
    }

    public void push(T element) {
        if (this.elementCount == this.stack.length) {
            growStack();
        }
        this.stack[elementCount] = element;
        elementCount++;
    }

    public T pop() {
        if (this.elementCount == 0) {
            throw new NoSuchElementException();
        }
        T output = this.stack[--elementCount];
        this.stack[elementCount] = null;
        return output;

    }

    private final class MyStackIterator implements Iterator<T> {
        private int cursor;


        public MyStackIterator() {
            this.cursor = elementCount - 1;
        }

        @Override
        public boolean hasNext() {
            return cursor >= 0;
        }

        @Override
        public T next() {
            if (hasNext() == true) {
                return stack[cursor--];
            } else {
                throw new NoSuchElementException("Out of bound");
            }
        }

    }
}
