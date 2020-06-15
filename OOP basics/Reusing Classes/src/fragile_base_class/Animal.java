package fragile_base_class;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    /*
•	Protected field: foodEaten: ArrayList<Food>
•	Public final method: eat(Food): void
•	Public method: eatAll(Food[]): void

Note: First, make eatAll() to use eat() to do its job.
Do not make the eat() method final. override eat() in Predator.
Now if you change the implementation of eatAll() (to no longer use eat()
, you can use Collections.addAll()) you should observe a bug introduced in you program.
     */
    protected List<Food> foodEaten;

    public Animal() {
        this.foodEaten = new ArrayList<> ();
    }

    public final void eat(Food food) {
        this.foodEaten.add (food);
    }

    public void eatAll(List<Food> foods) {
        for (Food food : foods) {
            this.eat (food);
        }
    }
}
