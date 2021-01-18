package cars;

public abstract class BaseCar implements BaseCarInterface {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;
    private boolean isParked;
    private boolean isRaceParticipant;

    public void tune(int increase){
        int horsePowerIncrease = increase;
        int suspensionIncrease = increase*50/100;
        
        increaseHorsepower(horsePowerIncrease);
        increaseSuspension(suspensionIncrease);
    }

    public void increaseSuspension(int increaseSuspensionValue) {
        this.suspension += increaseSuspensionValue;
    }

    public void increaseHorsepower(int increaseHPValue) {
        this.horsepower += increaseHPValue;
    }

    public void setParked(String status) {
        if ("false".equals(status)) {
            isParked = false;
        } else {
            isParked = true;
        }
    }

    public void setRaceParticipant(boolean raceParticipant) {
        isRaceParticipant = raceParticipant;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public boolean isParked() {
        return isParked;
    }

    public boolean isRaceParticipant() {
        return isRaceParticipant;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    public int getDurability() {
        return durability;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public BaseCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.horsepower = horsepower;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
        this.isParked = false;
        this.isRaceParticipant = false;
    }

    public String baseCheck() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %d", getBrand(), getModel(), getYearOfProduction())).append(System.lineSeparator());
        sb.append(String.format("%d HP, 100 m/h in %d s", getHorsepower(), getAcceleration())).append(System.lineSeparator());
        sb.append(String.format("%d Suspension force, %d Durability", getSuspension(), getDurability())).append(System.lineSeparator());
        return sb.toString();
    }

}
