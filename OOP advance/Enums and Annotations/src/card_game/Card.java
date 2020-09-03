package card_game;

public class Card implements Comparable<Card> {
    private Ranks rank;
    private Suits suit;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
        // TODO: 03/09/2020 nest Ranks and Suits Methods under an interface, as they are the same

    }

    public int power() {
        return this.rank.getPower() + this.suit.getPower();
    }


    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.power(), o.power());
    }
}