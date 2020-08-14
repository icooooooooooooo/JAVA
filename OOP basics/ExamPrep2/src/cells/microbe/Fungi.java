package cells.microbe;

import cells.Cell;

import java.util.Map;

public class Fungi extends Microbe {
    private static final int FUNGI_ENERGY_DIVIDOR = 4;

    public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public Integer energy() {
        Integer energy = (getHealth() + getVirulence()) / FUNGI_ENERGY_DIVIDOR;
        return energy;
    }


}
