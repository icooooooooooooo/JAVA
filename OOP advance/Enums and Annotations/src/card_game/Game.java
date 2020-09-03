package card_game;

import java.util.Iterator;

public class Game {
    private Player player1;
    private Player player2;
    private Deck deck;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }

    public void play() {
        Player winner;
        if (this.player1.compareTo(this.player2) > 0) {
            winner = player1;
        } else {
            winner = player2;
        }

        System.out.println(winner.toString());
    }


}
