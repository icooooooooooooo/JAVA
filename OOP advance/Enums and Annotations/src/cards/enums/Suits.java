package cards.enums;

import cards.annotation.CustomEnumAnnotation;

@CustomEnumAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    public int getPower() {
        return power;
    }

    Suits(int power) {
        this.power = power;
    }

    public String getSuit() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), name());
    }

    public String getName() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }


}
