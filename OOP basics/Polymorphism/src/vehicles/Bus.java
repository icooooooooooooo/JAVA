package vehicles;

public class Bus extends Vehicle {

    public Bus(String type, double fuelType, double consumption, double maxCapacity) {
        super (type, fuelType, consumption, maxCapacity);

        setAcUsage (1.4);
        setRefuelMax (1);
    }


}
