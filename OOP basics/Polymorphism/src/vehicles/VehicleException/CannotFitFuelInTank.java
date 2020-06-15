package vehicles.VehicleException;

public class CannotFitFuelInTank extends VehicleException {
    public CannotFitFuelInTank() {
        super ("Cannot fit fuel in tank");
    }

    public CannotFitFuelInTank(String message) {
        super (message);
    }
}
