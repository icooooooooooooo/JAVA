package wild_animals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Mammal extends Animal {
    protected String getLivingRegion() {
        return livingRegion;
    }

    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super (animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }


    public void eat(Food food) {
        if ("Vegetable".equals (food.getClass ())) {
            setFoodEaten (food.getQuantity ());
        }
    }

    @Override
    public String toString() {
        //{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
        StringBuilder sb = new StringBuilder ();
        DecimalFormat decimalFormat = new DecimalFormat ("#.##############");

        List<String> list = new ArrayList<> () {{
            add (getAnimalName ());
            add (decimalFormat.format (getAnimalWeight ()));
            add (getLivingRegion ());
            add (getFoodEaten () + "");
        }};
        sb.append (getAnimalType ()).append (list);

        String result = sb.toString ();

        return result;
    }


}
