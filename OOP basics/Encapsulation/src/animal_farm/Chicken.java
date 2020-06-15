package animal_farm;

import java.text.DecimalFormat;

public class Chicken {
    //contains a class Chicken. Chicken contains several fields, a constructor, several properties and several methods.
    // Your task is to encapsulate or hide anything that is not intended to be viewed or modified from outside the class.

    // Chicken lives for 15 years.
    // Chicken have name for sure, at least 1 symbol long.
    private final int MIN_CHICKEN_AGE = 0;
    private final int MAX_CHICKEN_AGE = 15;
    private final int MIN_CHICKEN_NAME = 1;

    private int age;
    private String name;
    private DecimalFormat df = new DecimalFormat ("#.##");

    public Chicken(String name, int age) {
        setAge (age);
        setName (name);
    }

    @Override
    public String toString() {
        StringBuilder chi = new StringBuilder ();
//Chicken Mara (age 10) can produce 1 eggs per day.
        chi.append ("Chicken ").append (getName ()).append (" can produce ").append (df.format (eggProduction ())).append (" eggs per day");
        return chi.toString ();
    }

    private void setName(String name) {
        if (name.length () <= MIN_CHICKEN_NAME) {
            throw new IllegalArgumentException ("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age > MIN_CHICKEN_NAME && age <= MAX_CHICKEN_AGE) {
            this.age = age;
        } else {
            throw new IllegalArgumentException ("Age should be between 0 and 15");
        }
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    // Chicken producing eggs:
    //•	First 6 years it produces 2 eggs per day [0 - 5]
    //•	Next 6 years it produces 1 egg per day [6 - 11]
    //•	And after that it produces 0.75 eggs per day
    private double eggProduction() {
        double eggsPerDay = 0;
        int age = getAge ();

        if (age < 6) {
            eggsPerDay = 2;
        } else if (age >= 6 && age < 12) {
            eggsPerDay = 1;
        } else if (age >= 12) {
            eggsPerDay = 0.75;
        }


        return eggsPerDay;
    }
}
