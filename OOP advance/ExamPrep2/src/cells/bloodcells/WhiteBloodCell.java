package cells.bloodcells;

import cells.Cell;
import cells.bloodcells.BloodCell;

import java.util.Map;

public class WhiteBloodCell extends BloodCell {
    private static final int MIN_WHITE_BLOOD_CELL_SIZE = 1;
    private static final int WHITE_BLOOD_CELL_ENERGY_MULTIPLIER = 2;

    private int size;

    public int getSize() {
        return this.size;
    }

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
    }

    @Override
    public Integer energy() {
        Integer energy = (getHealth() + getSize()) * WHITE_BLOOD_CELL_ENERGY_MULTIPLIER;
        return energy;
    }



    @Override
    public String specialCharacteristic() {
        return String.format("Size: %d", getSize());
    }

}