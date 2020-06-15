package wild_animals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cat extends Felime {
    public String getBreed() {
        return breed;
    }

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super (animalName, animalType, animalWeight, 0, livingRegion);
        this.breed = breed;

    }

    @Override
    public void sound() {
        System.out.println ("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten (food.getQuantity ());

    }

    @Override
    public String toString() {
        //{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
        StringBuilder sb = new StringBuilder ();
        DecimalFormat decimalFormat = new DecimalFormat ("#.###############");

        List<String> list = new ArrayList<> () {{
            add (getAnimalName ());
            add (getBreed ());
            add (decimalFormat.format (getAnimalWeight ()));
            add (getLivingRegion ());
            add (getFoodEaten ()+"");
        }};
        sb.append (getAnimalType ()).append (list);

        String result = sb.toString ();

        return result;

    }
}
