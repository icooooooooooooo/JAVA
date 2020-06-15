package vehicles;

import vehicles.VehicleException.CannotFitFuelInTank;
import vehicles.VehicleException.FuelMustBeAPositiveNumber;
import vehicles.VehicleException.InsufficientFuelException;

import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double AC_USAGE;
    protected double REFUEL_MAX;

    public void setAcUsage(double acUsage) {
        this.AC_USAGE = acUsage;
    }

    public void setRefuelMax(double refuelMax) {
        this.REFUEL_MAX = refuelMax;
    }

    private DecimalFormat decimalFormatuelFuel;
    private DecimalFormat decimalFormatDistance;
    private boolean summer = true;

    private String type;
    private double fuelQuantity;
    private double litersPerKm;
    private double tankCapacity;


    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }


    protected String getType() {
        return type;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public String printFuelQuantity() {
        return decimalFormatuelFuel.format (getFuelQuantity ());
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public boolean isSummer() {
        return summer;
    }

    public Vehicle() {
        decimalFormatuelFuel = new DecimalFormat ("#.00");
        decimalFormatDistance = new DecimalFormat ("#.##");

    }

    public Vehicle(String vehicleType, double fuelQuantity, double litersPerKm, double tankCapacity) {
        this ();
        this.type = vehicleType;
        this.setFuelQuantity (fuelQuantity);
        this.litersPerKm = litersPerKm;
        this.tankCapacity = tankCapacity;

    }

    public String driving(double distance) throws InsufficientFuelException {
        //If vehicle cannot travel given distance its fuel does not change
        double maxDistance;
        double fuelNeeded;
        if (isSummer () == true) {
            double summerUsagePerKm = getLitersPerKm () + AC_USAGE;
            fuelNeeded = distance * summerUsagePerKm;
            maxDistance = getFuelQuantity () / (summerUsagePerKm);
        } else {
            fuelNeeded = distance * getLitersPerKm ();
            maxDistance = getTankCapacity () / (getLitersPerKm ());
        }
        if (maxDistance > distance) {
            setFuelQuantity (getFuelQuantity () - fuelNeeded);
            return String.format ("%s travelled %s km", getType (), decimalFormatDistance.format (distance));
        } else {
            throw new InsufficientFuelException (this.getType ());
        }
    }

    public String driving(double distance, boolean empty) throws InsufficientFuelException { //driveEmpty
        //If vehicle cannot travel given distance its fuel does not change
        double maxDistance;
        double fuelNeeded;

        fuelNeeded = distance * getLitersPerKm ();
        maxDistance = getFuelQuantity () / (getLitersPerKm ());

        if (maxDistance > distance) {
            setFuelQuantity (getFuelQuantity () - fuelNeeded);
            return String.format ("%s travelled %s km", getType (), decimalFormatDistance.format (distance));
        } else {
            throw new InsufficientFuelException (this.getType ());
        }
    }


    public void refueling(double liters) throws CannotFitFuelInTank, FuelMustBeAPositiveNumber {

        if (getFuelQuantity () + liters <= getTankCapacity () && liters > 0) {
            setFuelQuantity (getFuelQuantity () + liters);
        } else {
            if (getFuelQuantity () + liters > getTankCapacity ()) {
                throw new CannotFitFuelInTank ();
            } else if (liters <= 0) {
                throw new FuelMustBeAPositiveNumber ();
            }
        }
    }

    //fuel quantity, fuel consumption in liters per km and can be driven given distance and refueled with given liters
}
