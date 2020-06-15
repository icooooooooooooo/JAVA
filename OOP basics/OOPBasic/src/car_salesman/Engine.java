package car_salesman;

public class Engine {
    private static final String DEFAULT_EMPTY_STRING = "n/a";
    private static final int DEFAULT_EMPTY_INT = -1;

    //model, power, displacement and efficiency
    private String model;
    private int power;
    private int displacement;       // optional
    private String efficiency;        // optional

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return this.power;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }


    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = DEFAULT_EMPTY_INT;
        this.efficiency = DEFAULT_EMPTY_STRING;
    }

    public Engine(String model, int power, int displacement) {
        this (model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this (model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this (model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

}
