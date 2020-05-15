import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //{personName}: {PT, PT, PT,… PT}

        Map<String, String> scores = new LinkedHashMap<> ();
        String input = scanner.nextLine ();

        while (!"JOKER".equals (input)) {
            String[] playerSet = input.split (": ");
            String player = playerSet[0];
            String cards = playerSet[1];

            if (!scores.containsKey (player)) {
                scores.put (player, cards);
            } else {
                scores.replace (player, scores.get (player) + ", " + cards);
            }

            input = scanner.nextLine ();
        }


        for (Map.Entry<String, String> player : scores.entrySet ()) {
            int score = Calculate (player.getValue ());

            System.out.printf ("%s: %d\n", player.getKey (), score);
        }

    }


    private static int Calculate(String set) {
        int result = 0;
        String[] cards = set.split (", ");
        Set<String> cheatCheck = new LinkedHashSet<> ();
        Collections.addAll (cheatCheck, cards);

        Iterator tekeNext = cheatCheck.iterator (); // not sure why is it not working - TODO - investigate!!

        //S -> 4, H-> 3, D -> 2, C -> 1
        for (String card : cheatCheck) {
            char[] calc = card.toCharArray ();
            char power = calc[0];
            String powInStr = String.valueOf (power);
            int powNum = 0;
            //TODO transfom to switch
            //too tired to fix now
            if (50 <= power && power <= 57) {
                powNum = Integer.parseInt (powInStr);
            } else if ("J".equals (powInStr) || "Q".equals (powInStr) || "K".equals (powInStr) || "A".equals (powInStr) || "1".equals (powInStr)) {
                switch (powInStr) {
                    case "1":
                        powNum = 10;
                        break;
                    case "J":
                        powNum = 11;
                        break;
                    case "Q":
                        powNum = 12;
                        break;
                    case "K":
                        powNum = 13;
                        break;

                    case "A":
                        powNum = 14;
                        break;
                }
            }

            char color = calc[calc.length - 1];
            switch (color) {
                case 'S':
                    powNum *= 4;
                    break;
                case 'H':
                    powNum *= 3;
                    break;
                case 'D':
                    powNum *= 2;
                    break;
                case 'C':
                    powNum *= 1;
                    break;
            }
            result += powNum;
        }
        return result;
    }
}
