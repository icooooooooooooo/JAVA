package fragile_base_class;

import java.util.List;

public class Predator extends Animal {
    /*
    •	Private field: health: int
    •	Public method: feed(Food): void
     */
    private int health;

    public void feed(Food food) {
        super.eat (food);
        this.health += 1;

    }

    public void feed(List<Food> foods) {
        super.eatAll (foods);
        this.health += foods.size ();
    }

    public int getHealth() {
        return this.health;
    }
}
