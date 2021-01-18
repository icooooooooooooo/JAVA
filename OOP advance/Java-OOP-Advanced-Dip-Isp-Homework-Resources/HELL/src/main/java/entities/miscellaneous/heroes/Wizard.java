package entities.miscellaneous.heroes;

import constants.BaseStats;
import interfaces.Inventory;

public class Wizard extends BaseHero{
    public Wizard(String name, Inventory inventory) {
        super(name,
                BaseStats.WIZARD_STRENGTH,
                BaseStats.WIZARD_AGILITY,
                BaseStats.WIZARD_INTELLIGENCE,
                BaseStats.WIZARD_HIT_POINTS,
                BaseStats.WIZARD_DAMAGE,
                inventory);
    }
}
