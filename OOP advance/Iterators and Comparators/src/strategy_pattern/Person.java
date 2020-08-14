package strategy_pattern;

public class Person {
    /*
    •	A person’s name will be a string that contains only alphanumerical characters with a length between [1…50] symbols.
    •	A person’s age will be a positive integer between [1…100].
    •	The number of people N will be a positive integer between [0…100].
    */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        // TODO: 11/08/2020 implement constraints
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name).append(" ").append(this.age);

        return stringBuilder.toString();
    }

}
