package shopping_spree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final int MIN_NAME_LENGTH = 1;
    private final double MIN_MONEY_POSESSED = 0.0;
    private final int MAX_SPACES_ALLOWED = 1; // will break into an Array and if more than 1 = fail;

    private String name;
    private double money;
    private List<Product> productList;

    private Person() {
        this.productList = new ArrayList<> ();
    }

    private void spend(double cost) {
        setMoney (getMoney () - cost);
    }

    public String purchase(Product item) throws Exception {
        String purchase = "";

        String name = item.getName ();
        double cost = item.getCost ();

        if (getMoney () - cost >= 0) {
            this.productList.add (item);
            purchase = getName () + " bought " + name;
            spend (cost);
            return purchase;

        } else {
            throw new Exception (getName () + " can't afford Milk");
        }

    }

    public Person(String name, double money) {
        this ();
        setName (name);
        setMoney (money);
    }

    public Person(String name, double money, Product product) {
        this (name, money);
        setProductList (product);
    }

    private void setProductList(Product product) {
        this.productList.add (product);
    }

    private void setMoney(double money) {
        if (money >= MIN_MONEY_POSESSED) {
            this.money = money;
        } else {
            throw new IllegalArgumentException ("Money cannot be negative");
        }
    }

    private void setName(String name) {
        if (name.length () >= MIN_NAME_LENGTH && name.split ("\\s+").length == MAX_SPACES_ALLOWED) {
            this.name = name;
        } else {
            throw new IllegalArgumentException ("Name cannot be empty");
        }
    }

    private String getName() {
        return this.name;
    }

    private double getMoney() {
        return this.money;
    }

    private List<Product> getProductList() {
        return Collections.unmodifiableList (this.productList);
    }

    public String allPurchases() {
        StringBuilder sb = new StringBuilder ();

        String allPurchases;
        if (getProductList ().size () > 0) {
            sb.append (getName ()).append (" - ");
            for (Product product : productList) {
                sb.append (product).append (", ");
            }
            allPurchases = sb.toString ();
            int length = allPurchases.length ();
            allPurchases = allPurchases.substring (0, length - 2);
            return allPurchases;
        } else {
            allPurchases = getName () + " Nothing bought";
            return allPurchases;
        }
    }
}
