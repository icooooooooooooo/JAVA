package coffee_machine;

import coffee_machine.enums.CoffeeSize;
import coffee_machine.enums.CoffeeType;

public class Coffee {
    private CoffeeType type;
    private CoffeeSize size;

    public Coffee(CoffeeType type, CoffeeSize size) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", size.toString(), type.toString());
    }

}
