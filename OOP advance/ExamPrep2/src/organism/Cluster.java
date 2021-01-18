package organism;

import cells.Cell;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cluster {

    private String id;
    private int rows;
    private int cols;
    private Map<String, Cell> cells;
    private int[][] map;

    public Map<String, Cell> getCells(){
        return this.cells;
    };
    public Cluster() {
        this.cells = new HashMap<>();

    }

    public Cluster(String id, int rows, int cols) {
        this();
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.map = new int[this.rows][this.cols];

    }

    public String getId() {
        return this.id;
    }

    public int cellCount() {

        return this.cells.size();
    }

    public void activated() {
        /*
        Cluster Activation
        Clusters are always activated in order of creation.
        After a cluster is activated, it should wait for all the other clusters until it can be activated again.
        */
        for (int i = 0; i <= this.rows; i++) {
            for (int j = 0; j <= this.cols; j++) {
                if (map[j][i] == 1) {
                    String location = locationCoordinateGenerator(i, j);
                    Cell cell = this.cells.get(location);//first cell -> closest to coordinates [0,0]
                    cell.move(this.rows, this.cols, this.map, getCells(), cell);
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "";
        // TODO: 19/07/2020 - set it to print, as shown in output
    }

    public boolean checkLocation(int row, int col) {
        boolean isOccupied = false;
        if (this.cells.containsKey(locationCoordinateGenerator(row, col))) {
            isOccupied = true;
        }
        return isOccupied;
    }

    public void addCell(Cell cell, int row, int col) {
        cells.putIfAbsent(locationCoordinateGenerator(row, col), cell);
        this.map[row][col] = 1; // this is marking the exact coordinates of cells, so we could activate in an easier manner.
    }

    public String locationCoordinateGenerator(int row, int col) {
        StringBuilder cellLocation = new StringBuilder();
        cellLocation.append(row).append(" ").append(col);

        return cellLocation.toString();
    }

}
