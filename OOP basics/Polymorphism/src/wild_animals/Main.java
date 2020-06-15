package wild_animals;

import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Animal> animals = new ArrayList<> ();
        String input = scan.readLine ();

        while (!"End".equals (input)) {
            String munch = scan.readLine ();

            Animal animal = null;
            Food food = null;

            String[] raw = input.split ("\\s+");
            String[] rawFood = munch.split ("\\s+");


            String foodType = rawFood[0];
            int foodQuantity = Integer.parseInt (rawFood[1]);

            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable (foodQuantity);
                    break;
                case "Meat":
                    food = new Meat (foodQuantity);
                    break;
            }

            //{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]

            String animalType = raw[0];
            String animalName = raw[1];
            double animalWeight;
            String animalRegion;
            String breed;


            //{AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]
            if ("Cat".equals (animalType)) {

                animalWeight = Double.parseDouble (raw[2]);
                animalRegion = raw[3];
                breed = raw[4];

            } else {
                breed = "";
                animalWeight = Double.parseDouble (raw[2]);
                animalRegion = raw[3];
            }

            switch (animalType) {
                case "Cat":

                    animal = new Cat (animalName, animalType, animalWeight, animalRegion, breed);
                    break;

                case "Tiger":

                    animal = new Tiger (animalName, animalType, animalWeight, animalRegion);
                    //animalName, animalType, animalWeight, foodEaten, livingRegion
                    break;

                case "Mouse":

                    animal = new Mouse (animalName, animalType, animalWeight, animalRegion);
                    break;

                case "Zebra":

                    animal = new Zebra (animalName, animalType, animalWeight, animalRegion);

                    break;
            }
            try {

                animal.sound ();
                animal.eat (food);
            } catch (IllegalArgumentException ex) {
                ex.getMessage ();
            }
            System.out.println (animal.toString ());
            input = scan.readLine ();

        }
    }
}

