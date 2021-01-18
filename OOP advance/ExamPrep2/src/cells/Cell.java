package cells;

import cells.bloodcells.BloodCell;
import organism.Cluster;

import java.util.HashMap;
import java.util.Map;

public abstract class Cell implements CellMethods {
    private static final int MIN_HEALTH = 1;
    private static final int MIN_ROW_POSITION = 0;
    private static final int MIN_COL_POSITION = 0;

    private String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public String getId() {
        return this.id;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public int getPositionCol() {
        return positionCol;
    }

    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionCol = positionCol;
        this.positionRow = positionRow;
    }

    public String getlocationString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [").append(getPositionRow()).append(",").append(getPositionCol()).append("]");
        return sb.toString();
    }

    public void locationSetter(Cell defeatedCell) {
        this.positionRow = defeatedCell.getPositionRow();
        this.positionCol = defeatedCell.getPositionCol();

    }

    public int getHealth() {
        return this.health;
    }

    public void absorb(Cell absorbedCell) {
        this.health += absorbedCell.getHealth();
        absorbedCell.takeDamage(absorbedCell.getHealth());
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public void move(int row, int col, int[][] map, Map<String, Cell> cells, Cell movingCell) {
        int startRow = movingCell.positionRow; // start on the same row
        int startCol = movingCell.positionCol + 1; // start on the next col

        while (movingCell.getHealth() > 0 && cells.size() >= 2) {
            for (int i = startRow; i < row; i++) {
                for (int j = startCol; j < col; j++) {
                    if (map[i][j] == 1&&cells.size()!=1) {
                        String coordinates = new Cluster().locationCoordinateGenerator(i, j);
                        Cell stationaryCell = cells.get(coordinates);

                        Cell cellToBeRemoved = movingCell.engage(movingCell, stationaryCell);
                        String RemovedCellID = new Cluster().locationCoordinateGenerator(cellToBeRemoved.positionRow, cellToBeRemoved.positionCol);
                        cells.remove(RemovedCellID);
                    }
                }
                startCol = 0;
            }
        }
    }

    //TODO setters for positions and -> validation

    @Override
    public String toString() {
        return "";
        // TODO: 19/07/2020 - set it to print, as shown in output
    }

}
