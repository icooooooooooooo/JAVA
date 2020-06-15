package google;

public class Car {
    private static final String DEFAULT_STRING_VALUE = "";
    private static final int DEFAULT_INTEGER_VALUE = -1;

    private String carModel;
    private int carSpeed;

    public String getCarModel(){
        return this.carModel;
    }

    @Override
    public String toString() {
        return carModel + " " + carSpeed;
    }

    public Car() {
        this.carModel = DEFAULT_STRING_VALUE;
        this.carSpeed = DEFAULT_INTEGER_VALUE;
    }

    public Car(String model, int speed) {
        this.carModel = model;
        this.carSpeed = speed;
    }

}
