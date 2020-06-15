package car_salesman;

public class Car {
    private static final String DEFAULT_EMPTY_STRING = "n/a";
    private static final int DEFAULT_EMPTY_INT = -1;

    //model, engine, weight and color
    private String model;
    private Engine engine;
    private int weight;      // optional
    private String color;       // optional

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }


    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = DEFAULT_EMPTY_INT;
        this.color = DEFAULT_EMPTY_STRING;
    }

    public Car(String model, Engine engine, int weight) {
        this (model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this (model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this (model, engine);
        this.weight = weight;
        this.color = color;

    }
}
