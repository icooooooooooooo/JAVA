package wild_animals;

public abstract class Animal {
    public String getAnimalName() {
        return animalName;
    }

    private String animalName;

    protected String getAnimalType() {
        return animalType;
    }

    protected String animalType;
    protected double animalWeight;

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    protected int foodEaten;

    protected abstract void sound();

    protected abstract void eat(Food food);

    public Animal(String animalName, String animalType, double animalWeight, int foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }


}
