package cells.microbe;

import cells.Cell;

import java.util.Map;

public class Virus extends Microbe {
    public Virus(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }


    @Override
    public Integer energy() {
        Integer energy = getHealth() + getVirulence();
        return energy;
    }




}
