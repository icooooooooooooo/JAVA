package wild_animals;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super (animalName, animalType, animalWeight, 0, livingRegion);
    }

    @Override
    public void sound() {
        System.out.println ("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        if ("Meat".equals (food.getClass ())) {
            setFoodEaten (food.getQuantity ());
        }
    }

}
