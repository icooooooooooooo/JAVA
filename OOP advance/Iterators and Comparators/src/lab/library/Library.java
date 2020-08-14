package lab.library;

import lab.book.Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] library;

    public Library(Book... books) {
        this.library = books;
    }

    public Iterator<Book> iterator() {

        return new LibraryIterator();
    }

    public final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;


        @Override
        public boolean hasNext() {
            if (this.counter < library.length) {
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            return library[counter++];

        }
    }
}
