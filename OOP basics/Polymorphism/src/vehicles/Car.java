package vehicles;

public class Car extends Vehicle {

    public Car(String type, double fuelType, double consumption, double maxCapacity) {
        super (type, fuelType, consumption, maxCapacity);

        setAcUsage (0.9);
        setRefuelMax (1);
    }

}
