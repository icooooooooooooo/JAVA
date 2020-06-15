package shopping_spree;

public class Product {
    private final int MIN_NAME_LENGTH = 1;
    private final int MAX_SPACES_ALLOWED = 0;
    private final double MIN_COST = 0.01;

    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName (name);
        setCost (cost);
    }

    String getName() {
        return this.name;
    }

    double getCost() {
        return this.cost;
    }

    private void setName(String name) {
        if (name.trim ().length () >= MIN_NAME_LENGTH) { // not sure about the white space condition
            this.name = name;
        } else {
            throw new IllegalArgumentException ("Name cannot be empty");
        }
    }

    private void setCost(double cost) {
        if (cost >= MIN_COST) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException ("Cost cannot be zero");
        }
    }


}
