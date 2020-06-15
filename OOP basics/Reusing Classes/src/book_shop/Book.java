package book_shop;

import java.text.DecimalFormat;

public class Book {
    private final double MIN_PRICE = 0;
    private final double MIN_TITLE = 3;

    private String author;
    private String title;
    private double price;
    private DecimalFormat df;

    private String getTitle() {
        return this.title;
    }

    private String getAuthor() {
        return this.author;
    }

    private double getPrice() {
        return this.price;
    }

    public Book() {
        df = new DecimalFormat ("#.#");
    }

    public Book(String author, String title, double price) {
        this ();
        this.setAuthor (author);
        this.setPrice (price);
        this.setTitle (title);
    }

    @Override
    public String toString() {
        StringBuilder book = new StringBuilder ();

        book.append ("Type: Book").append (System.lineSeparator ());
        book.append ("Title: ").append (this.getTitle ()).append (System.lineSeparator ());
        book.append ("Author: ").append (this.getAuthor ()).append (System.lineSeparator ());
        book.append ("Price: ").append (df.format (this.getPrice ())).append (System.lineSeparator ());

        return book.toString ();
    }

    /**
     * •	If the title’s length is less than 3 symbols – exception’s message is: "Title not valid!"
     *
     * @param title
     */
    protected void setTitle(String title) {
        if (title.length () < MIN_TITLE) {
            throw new IllegalArgumentException ("Title not valid!");
        } else {
            this.title = title;
        }
    }

    /**
     * •	If the author has two names and the second name is starting with a digit– exception’s message is: "Author not valid!"
     *
     * @param author
     */
    void setAuthor(String author) {

        boolean isValid = validator (author);


        if (isValid == true) {
            this.author = author;
        } else {
            throw new IllegalArgumentException ("Author not valid!");
        }
    }

    private boolean validator(String author) {

        boolean validate = true;
        if (author.split ("\\s+").length == 1) {
            validate = true;
        } else if (author.split ("\\s+").length > 1) {
            String[] raw = author.split ("\\s+");
            if (raw[1].charAt (0) >= 48 && raw[1].charAt (0) <= 57) {
                validate = false;
            }
        }

        return validate;
    }

    /**
     * •	If the price is zero or it is negative – exception’s message is: "Price not valid!"
     *
     * @param price input double that represents the monetary value of a book.
     */
    protected void setPrice(double price) {
        if (price > MIN_PRICE) {
            this.price = price;
        } else {
            throw new IllegalArgumentException ("Price not valid!");
        }
    }

}
