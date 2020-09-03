package cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String STRING_FORMAT = "Type = %s, Description = %s";

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String command = scan.readLine();

        if ("Card Deck".equals(command)) {
            Deck deck = new Deck();

            deck.forEach(System.out::println); }


        // if ("Rank".equals(command)) {
        //     Class<Cards> rankTypeClass = Cards.class;
        //     if (rankTypeClass.isAnnotationPresent(CustomEnumAnnotation.class)) {
        //         System.out.println(String.format(STRING_FORMAT, Cards.class.getAnnotation(CustomEnumAnnotation.class).type(), Cards.class.getAnnotation(CustomEnumAnnotation.class).description()));
        //     }
        // } else if ("Suit".equals(command)) {
        //     Class<Suits> suitsTypeClass = Suits.class;
        //     if (suitsTypeClass.isAnnotationPresent(CustomEnumAnnotation.class)) {
        //         System.out.println(String.format(STRING_FORMAT, Suits.class.getAnnotation(CustomEnumAnnotation.class).type(), Suits.class.getAnnotation(CustomEnumAnnotation.class).description()));
        //     }
        // }

        //String card1 = scan.readLine();
        //String suit1 = scan.readLine();
        //String card2 = scan.readLine();
        //String suit2 = scan.readLine();

        //Card palyCard1 = new Card(card1, suit1);
        //Card palyCard2 = new Card(card2, suit2);

        //String result = palyCard1.compareTo(palyCard2) > 0 ? palyCard1.toString() : palyCard2.toString();

        //System.out.println(result);

        //if ("Card Suits".equals(input)) {
        //    EnumSet.allOf(Suits.class).forEach(suits -> System.out.println(suits.getSuit()));
        //} else if ("Card Ranks".equals(input)) {
        //    EnumSet.allOf(Cards.class).forEach(cards -> System.out.println(cards.getCard()));
        //} else if (input.toUpperCase().equals(Enum.valueOf(Cards.class, input.toUpperCase()).name())) {
        //    String suit = scan.readLine();
        //    if (suit.toUpperCase().equals(Enum.valueOf(Suits.class, suit.toUpperCase()).name())) {
        //        Card card = new Card(input, suit);
        //        System.out.println(card.toString());
        //    }
        //}
    }
}
