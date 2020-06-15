package vehicles.VehicleException;

public class InsufficientFuelException extends VehicleException {

    public InsufficientFuelException() {
        super ("Vehicle needs refueling");
    }

    public InsufficientFuelException(String type) {
        super (String.format ("%s needs refueling", type));
    }
}
