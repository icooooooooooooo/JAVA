package entities.miscellaneous.items;

import interfaces.Recipe;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class RecipeItem extends BaseItem implements Recipe {
    private List<String> requiredItems;

    public RecipeItem(String nameBonus, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus, List<String> requiredItems) {
        super(nameBonus, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
        this.requiredItems = requiredItems;

    }

    @Override
    public List<String> getRequiredItems() {
        return Collections.unmodifiableList(this.requiredItems);
    }
}
