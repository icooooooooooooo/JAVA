package card_game;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Deck> {
    private List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        generateDeck();
    }

    public void remove(Card card) {

        for (Card card1 : this.deck) {
            if (card.power() == card1.power()) {
                this.deck.remove(card1);
                break;
            }
        }
    }

    public boolean contains(Card card) {
        boolean status = false;
        for (Card card1 : deck) {
            if (card.power() == card1.power()) {
                status = true;
                break;
            }
        }
        return status;

    }

    private void generateDeck() {
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                Card card = new Card(rank, suit);
                this.deck.add(card);
            }
        }
    }

    @Override
    public Iterator<Deck> iterator() {
        return new IterableDeck();
    }

    private final class IterableDeck implements Iterator {

        private int element;

        public IterableDeck() {
            this.element = 0;
        }

        @Override
        public boolean hasNext() {
            if (element < deck.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return deck.get(element++);
        }
    }

}

