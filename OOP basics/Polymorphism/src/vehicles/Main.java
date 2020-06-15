package vehicles;

import vehicles.VehicleException.CannotFitFuelInTank;
import vehicles.VehicleException.FuelMustBeAPositiveNumber;
import vehicles.VehicleException.InsufficientFuelException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InsufficientFuelException, FuelMustBeAPositiveNumber {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        String[] carRaw = scan.readLine ().split ("\\s+");
        String[] truckRaw = scan.readLine ().split ("\\s+");
        String[] busRaw = scan.readLine ().split ("\\s+");

        Vehicle car = new Car (carRaw[0], Double.parseDouble (carRaw[1]), Double.parseDouble (carRaw[2]), Double.parseDouble (carRaw[3]));
        Vehicle truck = new Truck (truckRaw[0], Double.parseDouble (truckRaw[1]), Double.parseDouble (truckRaw[2]), Double.parseDouble (truckRaw[3]));
        Vehicle bus = new Bus (busRaw[0], Double.parseDouble (busRaw[1]), Double.parseDouble (busRaw[2]), Double.parseDouble (busRaw[3]));

        int N = Integer.parseInt (scan.readLine ());
        while (N-- > 0) {
            String[] commands = scan.readLine ().split ("\\s+");
            String action = commands[0];
            double quantity = Double.parseDouble (commands[2]);

            if ("Car".equals (commands[1])) {
                actionExcecution (car, action, quantity);
            } else if ("Truck".equals (commands[1])) {
                actionExcecution (truck, action, quantity);
            } else if ("Bus".equals (commands[1])) {
                actionExcecution (bus, action, quantity);

            }
        }
        System.out.println (car.printFuelQuantity ());
        System.out.println (truck.printFuelQuantity ());
        System.out.println (bus.printFuelQuantity ());

    }

    private static void actionExcecution(Vehicle vehicle, String action, double quantity) {
        if ("Drive".equals (action)) {
            drive (vehicle, quantity);
        } else if ("DriveEmpty".equals (action)) {
            boolean empty = true;
            drive (vehicle, quantity, empty);
        } else if ("Refuel".equals (action)) {
            refuel (vehicle, quantity);
        }
    }

    public static void drive(Vehicle vehicle, double quantity) {
        try {
            System.out.println (vehicle.driving (quantity));

        } catch (InsufficientFuelException ex) {
            System.out.println (ex.getMessage ());
        }
    }

    public static void drive(Vehicle vehicle, double quantity, boolean empty) {
        try {
            System.out.println (vehicle.driving (quantity, empty));

        } catch (InsufficientFuelException ex) {
            System.out.println (ex.getMessage ());
        }
    }

    public static void refuel(Vehicle vehicle, double quantity) {

        try {
            vehicle.refueling (quantity);
        } catch (CannotFitFuelInTank ex) {
            System.out.println (ex.getMessage ());
        }catch (FuelMustBeAPositiveNumber ex){
            System.out.println (ex.getMessage ());
        }
    }
}
