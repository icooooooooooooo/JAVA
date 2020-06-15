package wild_animals;

public class Mouse extends Mammal {
    //vegeterian
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion){
        super(animalName, animalType, animalWeight, 0, livingRegion);


    }


    @Override
    public void sound() {
        System.out.println ("SQUEEEAAAK!");

    }

}
