package dispatcher;

import engine.controller.HealthManager;

public class Dispatcher {

    public String commandProcessor(String[] args, HealthManager manager) {

        String command = args[0];

        String organismName;
        String id;
        int row;
        int col;
        String cluster;
        String cellType;
        String cellid;
        String clusterid;
        int health;
        String additionalProperty;

        String result = "";
        switch (command) {
            case "checkCondition":
                organismName = args[1];

                result = manager.checkCondition(organismName);
                break;

            case "createOrganism":
                organismName = args[1];

                result = manager.createOrganism(organismName);
                break;

            case "addCluster":
                organismName = args[1];
                id = args[2];
                row = Integer.parseInt(args[3]);
                col = Integer.parseInt(args[4]);

                result = manager.addCluster(organismName, id, row, col);
                break;

            case "addCell":
                organismName = args[1];
                clusterid = args[2];
                cellType = args[3];
                cellid = args[4];
                health = Integer.parseInt(args[5]);
                row = Integer.parseInt(args[6]);
                col = Integer.parseInt(args[7]);
                additionalProperty = args[8];

                result = manager.addCell(organismName, clusterid, cellType, cellid, health, row, col, additionalProperty);
                break;

            case "activateCluster":
                organismName = args[1];

                result = manager.activateCluster(organismName);
                break;
        }
        return result;
    }
}
