package raw_data;

public class Car {
    //“<Model>
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tires;

    public Car(String model, Engine engine, Cargo cargo, Tire tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tire getTires() {
        return this.tires;
    }

}
