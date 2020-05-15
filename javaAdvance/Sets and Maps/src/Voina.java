import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] player1 = scanner.nextLine ().split (" ");
        String[] player2 = scanner.nextLine ().split (" ");

        Set<Integer> player1Deck = new LinkedHashSet<> ();
        Set<Integer> player2Deck = new LinkedHashSet<> ();

        for (int i = 0; i < 20; i++) {
            player1Deck.add (Integer.parseInt (player1[i]));
            player2Deck.add (Integer.parseInt (player2[i]));
        }

        for (int i = 0; i < 50; i++) {
            if (player1Deck.isEmpty () || player2Deck.isEmpty ()) {
                break;
            }
            Iterator iterator1 = player1Deck.iterator ();
            Iterator iterator2 = player2Deck.iterator ();
            int card1 = (int) iterator1.next ();
            int card2 = (int) iterator2.next ();

            if (card1 > card2) {
                player2Deck.remove (card2);
                player1Deck.remove (card1);
                player1Deck.add (card1);
                player1Deck.add (card2);
            } else if (card2 > card1) {
                player1Deck.remove (card1);
                player2Deck.remove (card2);
                player2Deck.add (card2);
                player2Deck.add (card1);
            }
        }

        int player1Count = player1Deck.size ();
        int player2Count = player2Deck.size ();

        if (player1Count>player2Count) {
            System.out.println ("First player win!");

        } else if (player2Count>player1Count) {
            System.out.println ("Second player win!");
        } else {
            System.out.println ("Draw!");
        }

    }
}
