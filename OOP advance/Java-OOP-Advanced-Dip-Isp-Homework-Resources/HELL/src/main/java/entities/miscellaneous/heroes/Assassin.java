package entities.miscellaneous.heroes;

import constants.BaseStats;
import interfaces.Inventory;

public class Assassin extends BaseHero{
    public Assassin(String name, Inventory inventory) {
        super(name,
                BaseStats.ASSASSIN_STRENGTH,
                BaseStats.ASSASSIN_AGILITY,
                BaseStats.ASSASSIN_INTELLIGENCE,
                BaseStats.ASSASSIN_HIT_POINTS,
                BaseStats.ASSASSIN_DAMAGE,
                inventory);
    }
}
