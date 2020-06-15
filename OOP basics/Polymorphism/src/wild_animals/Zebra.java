package wild_animals;

public class Zebra extends Mammal {
    /**
     * @param animalName
     * @param animalType
     * @param animalWeight
     * @param foodEaten
     * @param livingRegion
     */
    //vegeterian
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion){
        super(animalName, animalType, animalWeight, 0, livingRegion);

    }

    @Override
    public void sound() {
        System.out.println ("Zs");
    }

}
