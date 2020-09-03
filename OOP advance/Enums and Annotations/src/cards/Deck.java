package cards;

import cards.enums.Cards;
import cards.enums.Suits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Deck implements Iterable<Card> {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        this.create();
    }

    private void create() {
        for (Suits suit : Suits.values()) {
            for (Cards power : Cards.values()) {
                Card card = new Card(power.getName(), suit.getName());
                this.cards.add(card);
            }
        }
    }

    @Override
    public void forEach(Consumer action) {
        for (Card card : this.cards) {
            action.accept(card);
        }
    }

    @Override
    public Iterator<Card> iterator() {
        return new IterableDeck();
    }

    private final class IterableDeck implements Iterator<Card> {
        private int instance;

        public IterableDeck() {
            this.instance = 0;
        }

        @Override
        public boolean hasNext() {
            if (instance < cards.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Card next() {
            return (Card) cards.get(this.instance++);

        }
    }
}
