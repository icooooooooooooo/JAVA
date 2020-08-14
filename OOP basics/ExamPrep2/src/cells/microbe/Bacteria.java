package cells.microbe;

import cells.Cell;

import java.util.Map;

public class Bacteria extends Microbe {
    private static final int BACTERIA_ENERGY_DIVIDOR = 3;

    public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }



    @Override
    public Integer energy() {
        Integer energy = (getHealth() + getVirulence())/BACTERIA_ENERGY_DIVIDOR;
        return energy;
    }



}
