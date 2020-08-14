package cells.bloodcells;

import cells.Cell;

public abstract class BloodCell extends Cell {
    public BloodCell(String id, int health, int positionRow, int positionCol) {
        super(id, health, positionRow, positionCol);
    }

    @Override
    public String cellType() {
        return "BloodCell";
    }

    public Cell engage(Cell attackingCell, Cell defendingCell) {
        attackingCell.absorb(defendingCell);
        defendingCell.takeDamage(defendingCell.getHealth());
        attackingCell.locationSetter(defendingCell);
        return defendingCell;
    }

}
