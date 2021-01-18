package organism;

import cells.Cell;

import java.util.*;

public class Organism {
    private String name;
    private List<Cluster> clusters;

    public Organism() {
        this.clusters = new ArrayList<>();
    }

    public Organism(String name) {
        this();
        this.name = name;
    }

    public String add(Cluster cluster) {
        boolean isPresent = false;
        String result = "";
        for (Cluster addedCluster : clusters) {

            if (cluster.equals(addedCluster)){
                isPresent = true;
                break;
            }
        }
        if (isPresent==false) {
            clusters.add(cluster);
            result = String.format("Organism %s: Created cluster %s", this.name, cluster.getId());
        }
        return result;
    }

    public List< Cluster> getClusters() {

        return Collections.unmodifiableList(clusters);
    }

    public Cluster getCluster(String clusterId){
        Cluster searched = null;
        for (Cluster cluster : clusters) {
            if (cluster.getId().equals(clusterId)){
                searched=cluster;
            }
        }
        return searched;
    }

    public int clusterCount() {
        return this.clusters.size();
    }

    public int cellCount() {
        int count = 0;
        for (Cluster cluster : clusters) {
            count += cluster.cellCount();
        }
        return count;
    }

    public String getName() {
        return this.name;
    }

    public String createdOrganismName() {
        return String.format("Created organism %s", this.name);
    }

    @Override
    public String toString() {
        return "";
        // TODO: 19/07/2020 - set it to print, as shown in output
    }

    public String check() {
        StringBuilder sb = new StringBuilder();
        sb.append("Organism - ").append(getName()).append(System.lineSeparator());
        sb.append("--Clusters: ").append(clusterCount()).append(System.lineSeparator());
        sb.append("--Cells: ").append(cellCount()).append(System.lineSeparator());

        try {
            for (Cluster cluster : clusters) {
                sb.append("----Cluster ").append(cluster.getId()).append(System.lineSeparator());
                Map<String, Cell> cellMap = cluster.getCells();
                for (Cell cell : cellMap.values()) {
                    sb.append("------Cell ").append(cell.getId()).append(cell.getlocationString()).append(System.lineSeparator());
                    sb.append("--------Health: ").append(cell.getHealth()).append(" | ").append(cell.specialCharacteristic()).append(" | Energy: ").append(cell.energy()).append(System.lineSeparator());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString().substring(0, sb.length() - 1);
    }

    public String activates() {
        Cluster cluster = clusters.get(0);
        clusters.remove(0);

        cluster.activated();
        clusters.add(cluster);


        return String.format("Organism %s: Activated cluster %s. Cells left: %d", this.name, cluster.getId(), cluster.cellCount());
    }
}
