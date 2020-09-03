package card_game;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    Suits(int power) {
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

    public static Suits getEnum(String value) {
        for (Suits v : values()) {
            if (v.name().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No such card exists.");
    }

}
