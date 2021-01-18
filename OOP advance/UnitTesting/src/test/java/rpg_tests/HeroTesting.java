package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class HeroTesting {
    private static final int EXPECTED_EXPERIENCE_FROM_TARGET = 10;
    private static final int EXPECTED_WEAPON_ATTACK = 10;
    private static final String TEST_HERO_NAME = "UnitTestedHero";

    private Hero hero;

    @Test
    public void testHeroIfGainsXPWhenTargetDies1() {

        Target fakeTarget = new Target() {
            @Override
            public int getHealth() {
                return 0;
            }

            @Override
            public void takeAttack(int attackPoints) {

            }

            @Override
            public int giveExperience() {
                return EXPECTED_EXPERIENCE_FROM_TARGET;
            }

            @Override
            public boolean isDead() {
                return true;
            }

            @Override
            public Weapon giveWeapon() {
                return null;
            }
        };
        Weapon fakeWeapon = new Weapon() {
            @Override
            public int getAttackPoints() {
                return EXPECTED_WEAPON_ATTACK;
            }

            @Override
            public int getDurabilityPoints() {
                return 0;
            }

            @Override
            public void attack(Target target) {

            }
        };
        Hero hero = new Hero(TEST_HERO_NAME, fakeWeapon);

        hero.attack(fakeTarget);
        Assert.assertEquals(EXPECTED_EXPERIENCE_FROM_TARGET, hero.getExperience());
    }

    @Test
    public void testHeroIfGainsXPWhenTargetDies2() {

        Target fakeTarget = Mockito.mock(Target.class);
        Weapon fakeWeapon = Mockito.mock(Weapon.class);

        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(EXPECTED_EXPERIENCE_FROM_TARGET);
        Mockito.when(fakeWeapon.getAttackPoints()).thenReturn(EXPECTED_WEAPON_ATTACK);

        Hero hero = new Hero(TEST_HERO_NAME, fakeWeapon);

        hero.attack(fakeTarget);
        Assert.assertEquals("Wrong experience", EXPECTED_EXPERIENCE_FROM_TARGET, hero.getExperience());
    }

    @Test
    public void getWeaponFunctionalityAfterAKill() {

        Weapon fakeHeroWeapon = Mockito.mock(Weapon.class);
        Weapon fakeRewardWeapon = Mockito.mock(Weapon.class);
        Target fakeTarget = Mockito.mock(Target.class);

        Hero hero = new Hero(TEST_HERO_NAME, fakeHeroWeapon);

        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveWeapon()).thenReturn(fakeRewardWeapon);

        hero.attack(fakeTarget);
        Assert.assertEquals(1,hero.getInventory().size());

    }
}
