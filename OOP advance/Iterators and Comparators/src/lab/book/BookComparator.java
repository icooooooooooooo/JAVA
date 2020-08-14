package lab.book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        //1.	Book title
        //2.	Year of publishing a lab.book
        if (b1.getTitle().compareTo(b2.getTitle()) == 0) {
            return b1.getYear() - b2.getYear();
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
