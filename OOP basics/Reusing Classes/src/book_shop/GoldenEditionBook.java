package book_shop;

public class GoldenEditionBook extends Book {
    private final double GOLDEN_COEFICIENT = 0.3;
    //•	GoldenEditionBook - represents a special book holds the same properties as any Book, but its price is always 30% higher.


    public GoldenEditionBook(String author, String title, double price) {
        super (author, title, price);
    }

    @Override
    protected void setPrice(double price) {
        super.setPrice (price * (1.0 + GOLDEN_COEFICIENT));
    }


}
