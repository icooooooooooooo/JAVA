package rpg_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dummy implements Target, RandomProvider {

    private int health;
    private int experience;
    private List<Weapon> rewardWeapons;

    public Dummy(int health, int experience) {
        this.health = health;
        this.experience = experience;
        this.rewardWeapons = new ArrayList<>();
        // TODO: 20/09/2020 write weapon Generator to fill in the possible loot - outside of the problem
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void takeAttack(int attackPoints) {
        if (this.isDead()) {
            throw new IllegalStateException("Dummy is dead.");
        }

        this.health -= attackPoints;
    }

    @Override
    public int giveExperience() {
        if (!this.isDead()) {
            throw new IllegalStateException("Target is not dead.");
        }

        return this.experience;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }

    @Override
    public Weapon giveWeapon() {
        return this.rewardWeapons.get(new Random().nextInt());
    }
}
