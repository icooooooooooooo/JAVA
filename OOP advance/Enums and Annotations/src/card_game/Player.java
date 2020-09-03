package card_game;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {
    private static final int MAX_CARDS_ALLOWED = 5;

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public boolean isFull() {
        if (hand.size() < MAX_CARDS_ALLOWED) {
            return false;
        } else {
            return true;
        }
    }

    private int maxCard() {
        int maxValue = 0;
        for (Card card : hand) {
            if (card.power() > maxValue) {
                maxValue = card.power();
            }
        }
        return maxValue;
    }

    public void addCard(Card card, Game game) {
        if (!isFull()) {
            if (game.getDeck().contains(card)) {
                this.hand.add(card);
                game.getDeck().remove(card);
            } else {
                throw new IllegalArgumentException("Card is not in the deck.");
            }
        }
    }

    @Override
    public int compareTo(Player o) {
        if (this.maxCard() > o.maxCard()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("%s wins with %d.", this.name, this.maxCard() );
    }
}
