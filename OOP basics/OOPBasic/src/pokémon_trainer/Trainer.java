package pokémon_trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private static final int DEFAULT_BADGES = 0;
    //name, number of badges and a collection of pokemon
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    @Override
    public String toString() {
        return name + " " + badges + " " + pokemons.size ();
    }

    public void setBadges() {
        this.badges += 1;
    }

    public int getBadges() {
        return this.badges;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        this.badges = DEFAULT_BADGES;
        this.pokemons = new ArrayList<> ();
        pokemons.add (pokemon);
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add (pokemon);
    }
}
