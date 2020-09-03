package cards;

import cards.enums.Cards;
import cards.enums.Suits;

import java.util.Comparator;

public class Card implements Comparable<Card> {
    private Cards card;
    private Suits suit;
    private int power;

    public Card(String card, String suit) {
        int pow = Enum.valueOf(Suits.class, suit.toUpperCase()).getPower() + Enum.valueOf(Cards.class, card.toUpperCase()).getPower();
        this.card = Enum.valueOf(Cards.class, card.toUpperCase());
        this.suit = Enum.valueOf(Suits.class, suit.toUpperCase());
        this.power = pow;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d"
                , this.card.name()
                , this.suit.name()
                , this.power
        );
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.power, o.power);
    }
}