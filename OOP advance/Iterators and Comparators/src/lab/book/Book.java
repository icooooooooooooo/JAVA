package lab.book;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int publishYear, String... args) {
        this.authors = new ArrayList<>();
        setTitle(title);
        setAuthors(args);
        setYear(publishYear);
    }

    @Override
    public String toString() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setAuthors(String... authors) {
        if (authors.length >= 1) {
            for (String author : authors) {
                this.authors.add(author);
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }


    public List<String> getAuthors() {
        return this.authors;
    }


    @Override
    public int compareTo(Book book) {
//Book have to be compared by name. When name is equal, compare them by year.
        if (getTitle().compareTo(book.getTitle()) == 0) {
            return getYear() - book.getYear();
        }
        return this.title.compareTo(book.title);
    }
}
