package entities.miscellaneous.heroes;

import constants.BaseStats;
import interfaces.Inventory;

public class Barbarian extends BaseHero{
    public Barbarian(String name, Inventory inventory) {
        super(name,
                BaseStats.BARBARIAN_STRENGTH,
                BaseStats.BARBARIAN_AGILITY,
                BaseStats.BARBARIAN_INTELLIGENCE,
                BaseStats.BARBARIAN_HIT_POINTS,
                BaseStats.BARBARIAN_DAMAGE,
                inventory);
    }
}
