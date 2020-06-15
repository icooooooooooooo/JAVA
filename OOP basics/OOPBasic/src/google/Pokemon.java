package google;

public class Pokemon {
    private static final String DEFAULT_VALUE = "";

    private String pokeName;
    private String pokeType;

    @Override
    public String toString() {
        return pokeName + " " + pokeType;
    }

    public Pokemon() {
        this.pokeName = DEFAULT_VALUE;
        this.pokeType = DEFAULT_VALUE;
    }

    public Pokemon(String name, String type) {
        this.pokeName = name;
        this.pokeType = type;
    }
}
