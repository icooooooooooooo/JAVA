package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class DummyTests {
    private static final int ATTACK = 10;
    private static final int DURABILITY = 10;
    private static final int HEALTH = 10;
    private static final int EXPERIENCE = 10;
    private static final int EXPECTED_EXPERIENCE = 10;

    private Axe axe;

    @Before
    public void axeGenerator() {
        this.axe = new Axe(ATTACK, DURABILITY);
    }

    @Test
    public void dummyLosesHealth() {
        Dummy dummy = new Dummy(HEALTH, EXPERIENCE);
        axe.attack(dummy);
        Assert.assertTrue(dummy.getHealth() == 0);

    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionIfAttacked() {
        Dummy dummy = new Dummy(HEALTH, EXPERIENCE);

        this.axe.attack(dummy);
        this.axe.attack(dummy);
    }

    @Test
    public void deadDummyCanGiveXP() {
        Dummy dummy = new Dummy(HEALTH, EXPERIENCE);
        axe.attack(dummy);
        Assert.assertTrue(dummy.giveExperience() == EXPECTED_EXPERIENCE);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCannotGiveXP() {
        Dummy dummy = new Dummy(HEALTH + HEALTH, EXPERIENCE);
        axe.attack(dummy);
        dummy.giveExperience();

    }

}
