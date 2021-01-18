import constants.Texts;
import entities.miscellaneous.HeroInventory;
import entities.miscellaneous.heroes.Assassin;
import entities.miscellaneous.heroes.Barbarian;
import entities.miscellaneous.heroes.Wizard;
import entities.miscellaneous.items.CommonItem;
import entities.miscellaneous.items.RecipeItem;
import interfaces.*;
import io.ConsoleInputReader;
import io.ConsoleOutputWriter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //this makes it visible everywhere;
    // injection is a must if Engine is present

    private static Map<String, Hero> heroRepository = new LinkedHashMap<>();

    public static void main(String[] args) {


        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();

        //engine
        while (true) {
            String input = reader.readLine();

            String[] tokens = input.split(Texts.SPLIT_DELIMITER);

            String command = tokens[0];
            String[] arguments = Arrays.stream(tokens).skip(1).toArray(String[]::new);

            String result = interpretCommand(command, arguments);

            writer.writeLine(result);

            if (Texts.KILL_COMMAND.equals(input)) {
                break;
            }

        }
    }

    // dispatcher
    private static String interpretCommand(String command, String[] arguments) {
        Hero hero;
        switch (command) {
            case "Hero":
                hero = createHero(arguments[0], arguments[1]);
                heroRepository.putIfAbsent(hero.getName(), hero);
                return String.format(Texts.HERO_CREATE, hero.getClass().getSimpleName(), hero.getName());
            case "Item":
                hero = heroRepository.get(arguments[1]);
                Item commonItem = itemCreation(arguments);
                hero.addItem(commonItem);
                return String.format(Texts.ADDED_ITEM, commonItem.getName(), hero.getName());
            case "Recipe":
                hero = heroRepository.get(arguments[1]);
                Recipe recipe = recipeCreation(arguments);
                hero.addRecipe(recipe);
                return String.format(Texts.ADDED_RECIPE, recipe.getName(), hero.getName());
            case "Inspect":
                hero = heroRepository.get(arguments[0]);
                return hero.toString();
            case "Quit":
                return printHeroesInfo();

        }
        return null;
    }


    //factories

    private static Recipe recipeCreation(String[] recipeParameters) {
        return new RecipeItem(
                recipeParameters[0],
                Integer.parseInt(recipeParameters[2]),
                Integer.parseInt(recipeParameters[3]),
                Integer.parseInt(recipeParameters[4]),
                Integer.parseInt(recipeParameters[5]),
                Integer.parseInt(recipeParameters[6]),
                Arrays.stream(recipeParameters).skip(7).collect(Collectors.toList())) {
        };
    }

    private static Item itemCreation(String[] itemParameters) {
        return new CommonItem(
                itemParameters[0],
                Integer.parseInt(itemParameters[2]),
                Integer.parseInt(itemParameters[3]),
                Integer.parseInt(itemParameters[4]),
                Integer.parseInt(itemParameters[5]),
                Integer.parseInt(itemParameters[6]));
    }

    private static Hero createHero(String name, String type) {

        switch (type) {
            case "Barbarian":
                return new Barbarian(name, new HeroInventory());
            case "Wizard":
                return new Wizard(name, new HeroInventory());
            case "Assassin":
                return new Assassin(name, new HeroInventory());
        }
        return null;
    }

    private static Comparator<? super Hero> getHeroesComparator() {
        return (hero1, hero2) -> {
            long firstComparatorSumHero1 = hero1.getStrength() + hero1.getAgility() + hero1.getIntelligence();
            long firstComparatorSumHero2 = hero2.getStrength() + hero2.getAgility() + hero2.getIntelligence();

            int comparatorByFirstSum = Long.compare(firstComparatorSumHero2, firstComparatorSumHero1);

            if (comparatorByFirstSum != 0) {
                return comparatorByFirstSum;
            }

            long secondComparatorSumHero1 = hero1.getHitPoints() + hero1.getDamage();
            long secondComparatorSumHero2 = hero2.getHitPoints() + hero2.getDamage();

            return Long.compare(secondComparatorSumHero2, secondComparatorSumHero1);
        };
    }

    private static String printHeroesInfo() {
        StringBuilder heroesInfo = new StringBuilder();

        final int[] index = {1};
        heroRepository.values()
                .stream()
                .sorted(getHeroesComparator())
                .forEach(hero -> {
                    String items = null;
                    try {
                        if (hero.getItems().size() == 0) items = "None";
                        else items = hero.getItems().stream()
                                .map(Item::getName)
                                .collect(Collectors.joining(", "));
                    } catch (IllegalAccessException exception) {
                        ;
                    }
                    heroesInfo
                            .append(String.format("%d. %s: %s",
                                    index[0]++,
                                    hero.getClass().getSimpleName(),
                                    hero.getName()))
                            .append(System.lineSeparator())
                            .append(String.format("###HitPoints: %d", hero.getHitPoints()))
                            .append(System.lineSeparator())
                            .append(String.format("###Damage: %d", hero.getDamage()))
                            .append(System.lineSeparator())
                            .append(String.format("###Strength: %d", hero.getStrength()))
                            .append(System.lineSeparator())
                            .append(String.format("###Agility: %d", hero.getAgility()))
                            .append(System.lineSeparator())
                            .append(String.format("###Intelligence: %d", hero.getIntelligence()))
                            .append(System.lineSeparator())
                            .append(String.format("###Items: %s", items))
                            .append(System.lineSeparator());
                });

        return heroesInfo.toString().trim();
    }
}