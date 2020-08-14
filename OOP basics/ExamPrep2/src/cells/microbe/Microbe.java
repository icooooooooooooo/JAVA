package cells.microbe;

import cells.Cell;
import organism.Cluster;

import java.util.Map;

public abstract class Microbe extends Cell {

    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        this.virulence = virulence;
        // TODO: 19/07/2020 - virulence setter - positive integer/formally a validator/
    }

    public int getVirulence() {
        return this.virulence;
    }

    @Override
    public String cellType() {
        return "Microbe";
    }

    public Cell engage(Cell attackingCell, Cell defendingCell) {
        while (defendingCell.getHealth() > 0 && attackingCell.getHealth() > 0) {
            defendingCell.takeDamage(attackingCell.energy());
            if (defendingCell.getHealth() > 0) {
                attackingCell.takeDamage(defendingCell.energy());
            }
        }
        if (defendingCell.getHealth()<=0) {
            attackingCell.locationSetter(defendingCell);
            return defendingCell;
        } else {
            return attackingCell;
        }

    }

    @Override
    public String specialCharacteristic() {
        return String.format("Virulence: %d", getVirulence());
    }
}
