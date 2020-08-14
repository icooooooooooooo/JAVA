package comparing_objects;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    private static final int MIN_AGE_ALLOWED = 2;
    private static final int MAX_AGE_ALLOWED = 100;

    private String name;
    private int age;
    private String town;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    public Person(String name, int age, String town) {
        try {
            setAge(age);
            this.name = name;
            this.town = town;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setAge(int age) {
        if (age > MIN_AGE_ALLOWED && age < MAX_AGE_ALLOWED) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("value out of bound");
        }
    }

    @Override
    public int compareTo(@NotNull Person o) {

        //two people, first you should compare
        // their names, after that -
        // their age and last but not at least -
        // compare their town
        int compareByName = this.name.compareTo(o.name);
        if (compareByName != 0) {
            return compareByName;
        }

        int compareByAge = this.age - o.getAge();
        if (compareByAge != 0) {
            return compareByAge;
        }

        int compareByTown = this.town.compareTo(o.getTown());
        if (compareByTown != 0) {
            return compareByTown;
        }
        else return 0;

    }

}
