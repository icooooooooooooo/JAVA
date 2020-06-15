package vehicles;

public class Truck extends Vehicle {

    public Truck(String type, double fuelType, double consumption, double maxCapacity) {
        super (type, fuelType, consumption, maxCapacity);

        setAcUsage (1.6);
        setRefuelMax (0.95);
    }
}

