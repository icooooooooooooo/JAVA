package engine.controller;

import cells.Cell;
import cells.microbe.Bacteria;
import cells.microbe.Fungi;
import cells.microbe.Virus;
import organism.Cluster;
import organism.Organism;
import cells.bloodcells.RedBloodCell;
import cells.bloodcells.WhiteBloodCell;

import java.util.HashMap;
import java.util.Map;

public class HealthManager {
    private Map<String, Organism> organismMap;

    public HealthManager() {
        this.organismMap = new HashMap<>();
    }

    public String checkCondition(String organismName) {
        // TODO: 20/07/2020 build logic in check method -
        //  RETURNS detailed information about the condition of the organism with the given name.
        //  Check output examples for exact requirement
        return this.organismMap.get(organismName).check();
    }

    public String createOrganism(String name) {
        //o	CREATES an organism with the given name
        //o	RETURNS message "Created organism <name>"
        //o	If an organism with the same name already exists, returns message "organism.Organism <name> already exists"

        Organism organism = new Organism(name);
        if (!organismMap.containsKey(name)) {
            organismMap.put(name, organism);
            return organism.createdOrganismName();
        } else {
            return String.format("Organism %s already exists", name);
        }
    }

    public String addCluster(String organismName, String id, int rows, int cols) {
        //o	CREATES a cluster with the given id, rows and cols
        //o	ADDS the cluster to the cluster collection of the organism with the given name
        //o	If the organism already has a cluster with the same Id, nothing happens
        //o	RETURNS message "organism.Organism <organism name>: Created cluster <cluster id>";

        Organism organism = organismMap.get(organismName);
        if (organism != null) {
            Cluster cluster = new Cluster(id, rows, cols);

            return organism.add(cluster);
        } else {
            return "";
        }
    }

    public String addCell(String organismName, String clusterId, String cellTYpe, String cellId, int health, int positionRow, int positionCol, String additionalProperty) {
        Organism organism = null;
        Cluster cluster = null;
        Cell newCell = null;

        //o	CREATES a cell of the given type with the given id, health, positionRow, positionCol,
        // and the given additional property (size, velocity or virulense).
        //o	FINDS the organism with given name, find the cluster with given id in the cluster collection of that organism and ADDS the cell to the cells collection of that cluster
        //o	RETURNS message "organism.Organism <organism name>: Created cell <cell id> in cluster <cluster id>"

        if (this.organismMap.containsKey(organismName)) {
            organism = organismMap.get(organismName);
            if (!organism.getClusters().contains(clusterId)) {
                cluster = organism.getCluster(clusterId);
                //todo logic here is broken, since a validation and data structure was changed => it has to be checking the cluster

                if (cluster.checkLocation(positionRow, positionCol) == false) {
                    switch (cellTYpe) {
                        case "Bacteria":
                            newCell = new Bacteria(cellId, health, positionRow, positionCol, Integer.parseInt(additionalProperty));
                            break;
                        case "Virus":
                            newCell = new Virus(cellId, health, positionRow, positionCol, Integer.parseInt(additionalProperty));
                            break;
                        case "Fungi":
                            newCell = new Fungi(cellId, health, positionRow, positionCol, Integer.parseInt(additionalProperty));
                            break;
                        case "WhiteBloodCell":
                            newCell = new WhiteBloodCell(cellId, health, positionRow, positionCol, Integer.parseInt(additionalProperty));
                            break;
                        case "RedBloodCell":
                            newCell = new RedBloodCell(cellId, health, positionRow, positionCol, Integer.parseInt(additionalProperty));
                            break;
                    }
                    cluster.addCell(newCell, positionRow, positionCol);
                    return String.format("Organism %s: Created cell %s in cluster %s", organismName, cellId, clusterId);
                }
            }
        }
        return "";
    }

    public String activateCluster(String organismName) {
        Organism organism = null;

        if (organismMap.containsKey(organismName)) {
            organism = organismMap.get(organismName);

            if (organism.clusterCount() > 0) {
                organism = organismMap.get(organismName);
                String result = organism.activates();
                return result;
            } else {
                return "";
            }
        } else {
            //o	FINDS the organism with the given name
            //o	ACTIVATES the next cluster in order
            //o	RETURNS message "organism.Organism <organism name>: Activated cluster <cluster id>. Cells left: <cells count>"

            return "";
        }
    }
}
