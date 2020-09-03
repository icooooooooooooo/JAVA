package coffee_machine;

import coding_tracker.Author;
import coffee_machine.enums.CoffeeSize;
import coffee_machine.enums.CoffeeType;
import coffee_machine.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> coffees;
    private int coins;

    public CoffeeMachine() {
        coffees = new ArrayList<>();
    }
@Author(name = "Ivi")
    public void buyCoffee(String size, String type) {
        if (coins >= Enum.valueOf(CoffeeSize.class, size.toUpperCase()).getValue()) {
            this.coffees
                    .add(new Coffee(Enum.valueOf(CoffeeType.class, type.toUpperCase())
                            , Enum.valueOf(CoffeeSize.class, size.toUpperCase())));
        }
    }
    @Author(name = "Hristo")
    public void insertCoin(String coin) {
        this.coins += Enum.valueOf(Coin.class, coin.toUpperCase()).getNominal();

    }
    @Author(name = "Hristo")
    public Iterable<Coffee> coffeesSold() {

        return this.coffees;
    }

}
