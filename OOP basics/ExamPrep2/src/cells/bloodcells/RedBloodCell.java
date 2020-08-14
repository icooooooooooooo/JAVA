package cells.bloodcells;

import cells.Cell;
import cells.bloodcells.BloodCell;

import java.util.Map;

public class RedBloodCell extends BloodCell {
    private static final int MIN_BLOOD_CELL_VELOCITY = 1;

    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    public int getVelocity(){
        return this.velocity;
    }


    @Override
    public Integer energy() {
        int energy = getHealth() + getVelocity();
        return energy;
    }

    @Override
    public String specialCharacteristic() {
        return String.format("Velocity: %d", getVelocity());
    }
    // TODO: 11/07/2020 setter for velocity - positive integer
}