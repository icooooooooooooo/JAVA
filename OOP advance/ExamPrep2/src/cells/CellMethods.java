package cells;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Map;

public interface CellMethods {
    void move(int row, int col, int[][] map, Map<String, Cell> cells, Cell movingCell);

    Integer energy();

    Cell engage(Cell attackingCell, Cell defendingCell);

    String cellType();

    String specialCharacteristic();

}

