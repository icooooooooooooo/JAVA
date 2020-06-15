import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, ArrayList<String>> dataset = new HashMap<> ();


        String input = scan.readLine ();
        while (!"Season End".equals (input)) {
            String[] raw = input.split (" result ");

            String[] teams = raw[0].split (" - ");
            String[] score = raw[1].split (":");

            String homeTeam = teams[0];
            String guestTeam = teams[1];
            String homeScore = score[0];
            String guestScore = score[1];

            dataset.putIfAbsent (homeTeam, new ArrayList<> ());
            dataset.putIfAbsent (guestTeam, new ArrayList<> ());
            StringBuilder homeBuilder = new StringBuilder ();
            StringBuilder guestBuilder = new StringBuilder ();

            homeBuilder.append (guestTeam).append (" -> ").append (homeScore).append (":").append (guestScore);
            guestBuilder.append (homeTeam).append (" -> ").append (guestScore).append (":").append (homeScore);

            dataset.get (homeTeam).add (homeBuilder.toString ());
            dataset.get (guestTeam).add (guestBuilder.toString ());


            input = scan.readLine ();
        }


        String[] teamsToLookFor = scan.readLine ().split (", ");

        for (String team : teamsToLookFor) {
            dataset.get (team)
                    .stream ()
                    .map (x -> x.split (" -> "))
//                    .sorted ((x, y) -> y[1].compareTo (x[1])) - not working - it reverses the last score
                    .sorted ((x, y) -> x[0].compareTo (y[0]))
                    .forEach (x -> System.out.println (team + " - " + x[0] + " -> " + x[1]));

        }
    }
}

