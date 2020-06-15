package first_and_reserve_team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int N = Integer.parseInt (scan.readLine ());
        Team team = new Team ("Test Team");
        while (N-- > 0) {
            String[] input = scan.readLine ().split ("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt (input[2]);
            double salary = Double.parseDouble (input[2]);

            Player player = new Player (firstName, lastName, age, salary);

            team.addPlayer (player);
        }
        System.out.println (String.format ("First team have %d players", team.getFirstTeam ().size ()));
        System.out.println (String.format ("Reserve team have %d players", team.getReserveTeam ().size ()));


    }
}
