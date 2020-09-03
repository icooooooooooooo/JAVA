package card_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        Player player1 = new Player(scan.readLine());
        Player player2 = new Player(scan.readLine());
        Game game = new Game(player1, player2);

        while (!player2.isFull()) {

            Card card = null;
            String[] cardArguments = scan.readLine().split(" of ");
            try {

                Ranks rank = Ranks.getEnum(cardArguments[0]);
                Suits suit = Suits.getEnum(cardArguments[1]);

                card = new Card(rank, suit);

                try {
                    if (player1.isFull()) {
                        player2.addCard(card, game);
                    } else {
                        player1.addCard(card, game);
                    }
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        game.play();
    }
}
