package vehicles.VehicleException;

import vehicles.Vehicle;

public class VehicleException extends Exception {

    public VehicleException() {
        super ("Invalid Vehicle Exception");
    }

    public VehicleException(String text) {
        super (text);
    }

}
