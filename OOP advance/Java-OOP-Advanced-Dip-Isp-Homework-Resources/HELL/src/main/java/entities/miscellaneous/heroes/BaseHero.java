package entities.miscellaneous.heroes;

import constants.BaseStats;
import constants.Texts;
import entities.miscellaneous.ItemCollection;
import interfaces.Hero;
import interfaces.Inventory;
import interfaces.Item;
import interfaces.Recipe;
import constants.BaseStats;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class BaseHero implements Hero {

    private String name;
    private long strength;
    private long agility;
    private long intelligence;
    private long hitPoints;
    private long damage;
    private Inventory inventory;

    protected BaseHero(String name, long strength, long agility, long intelligence, long hitPoints, long damage, Inventory inventory) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength + this.inventory.getTotalStrengthBonus();
    }

    @Override
    public long getAgility() {
        return this.agility + this.inventory.getTotalAgilityBonus();
    }

    @Override
    public long getIntelligence() {
        return this.intelligence + this.inventory.getTotalIntelligenceBonus();
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints + this.inventory.getTotalHitPointsBonus();
    }

    @Override
    public long getDamage() {
        return this.damage + this.inventory.getTotalDamageBonus();
    }

    @Override
    public Collection<Item> getItems() throws IllegalAccessException {
        Collection<Item> items = null;
        Field[] fields = this.inventory.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(ItemCollection.class)) {
                field.setAccessible(true);

                Map<String, Item> itemMap = (Map<String, Item>) field.get(this.inventory);
                items = itemMap.values();
            }
        }
        return items;
    }

    @Override
    public void addItem(Item item) {
        this.inventory.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
        this.inventory.addRecipeItem(recipe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String items = null;
        try {
            items = this.getItems().size() == 0 ?
                    " None" :
                    System.lineSeparator() + this.getItems()
                            .stream()
                            .map(Item::toString)
                            .collect(Collectors.joining(System.lineSeparator()));
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        }

        sb.append(String.format(Texts.HERO, this.getName(), this.getClass().getSimpleName())).append(System.lineSeparator());
        sb.append(String.format("HitPoints: %d, Damage: %d", this.getHitPoints(), this.getDamage())).append(System.lineSeparator());
        sb.append(String.format("Strength: %d", this.getStrength())).append(System.lineSeparator());
        sb.append(String.format("Agility: %d", this.getAgility())).append(System.lineSeparator());
        sb.append(String.format("Intelligence: %d", this.getIntelligence())).append(System.lineSeparator());
        sb.append(String.format("Items:%s", items));

        return sb.toString();
    }

}
