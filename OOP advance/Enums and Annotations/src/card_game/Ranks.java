package card_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Ranks {
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

    private int power;

    Ranks(int power) throws IllegalArgumentException {
        this.power = power;
    }


    public int getPower() {
        return this.power;
    }

    public static Ranks getEnum(String value) {
        for (Ranks v : values()) {
            if (v.name().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No such card exists.");
    }


}
