package cards.enums;

import cards.annotation.CustomEnumAnnotation;

@CustomEnumAnnotation(category = "Rank", description = "Provides rank constants for a Card class.")
public enum Cards {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    public int getPower() {
        return power;
    }

    public String getCard() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), name());
    }

    public String getName() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }

    private int power;

    Cards(int power) {
        this.power = power;
    }


}
