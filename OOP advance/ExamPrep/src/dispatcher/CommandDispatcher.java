package dispatcher;

import controller.CarManager;

public class CommandDispatcher {


    public String dispatchCommand(String[] args, CarManager manager) {

        String command = args[0];
        String output = "";
        int id;
        String brand;
        String model;
        int yearOfProduction;
        int horsepower;
        int acceleration;
        int suspension;
        int durability;
        String type;
        int length;
        String route;
        int prizePool;
        int tuneIndex;
        String addOn;

        switch (command) {
            case "register":
                id = Integer.parseInt(args[1]);
                type = args[2];
                brand = args[3];
                model = args[4];
                yearOfProduction = Integer.parseInt(args[5]);
                horsepower = Integer.parseInt(args[6]);
                acceleration = Integer.parseInt(args[7]);
                suspension = Integer.parseInt(args[8]);
                durability = Integer.parseInt(args[9]);

                manager.register(id, type, brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case "check":
                id = Integer.parseInt(args[1]);

                output = manager.check(id);
                break;
            case "open":
                id = Integer.parseInt(args[1]);
                type = args[2];
                length = Integer.parseInt(args[3]);
                route = args[4];
                prizePool = Integer.parseInt(args[5]);

                manager.open(id, type, length, route, prizePool);
                break;
            case "participate":
                id = Integer.parseInt(args[1]);
                int raceId = Integer.parseInt(args[2]);

                manager.participate(id, raceId);
                break;
            case "start":
                id = Integer.parseInt(args[1]);

                output=manager.start(id);
                break;
            case "park":
                id = Integer.parseInt(args[1]);

                manager.park(id);
                break;
            case "unpark":
                id = Integer.parseInt(args[1]);

                manager.unpark(id);
                break;
            case "tune":
                tuneIndex = Integer.parseInt(args[1]);
                addOn = args[2];

                manager.tune(tuneIndex, addOn);
                break;
            default:

        }
        return output;
    }
}
