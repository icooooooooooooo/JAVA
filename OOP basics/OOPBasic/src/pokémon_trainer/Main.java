package pokémon_trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, Trainer> trainerMap = new HashMap<> ();

        String raw = scan.readLine ();
        while (!"Tournament".equals (raw)) {
            String[] input = raw.split ("\\s+");
            String master = input[0];
            String pokeName = input[1];
            String element = input[2];
            int health = Integer.parseInt (input[3]);
            Pokemon pokemon = new Pokemon (pokeName, element, health);

            if (trainerMap.containsKey (master)) {
                trainerMap.get (master).setPokemons (pokemon);
            } else {
                Trainer trainer = new Trainer (master, pokemon);
                trainerMap.put (master, trainer);
            }
            raw = scan.readLine ();
        }

        String command = scan.readLine ();
        while (!"End".equals (command)) {
            for (String master : trainerMap.keySet ()) {

                if (trainerMap.get (master).getPokemons ().size () <= 0) {
                    break;
                } else {
//For every command you must check if a trainer has atleast 1 pokemon with the given element,
                    //if he does he receives 1 badge, otherwise all his pokemon lose 10 health,
                    String attackElement = command;
                    if (trainerMap.get (master).getPokemons ().stream ().anyMatch (x -> x.getElement ().equals (attackElement))) {
                        trainerMap.get (master).setBadges ();
                    } else {
                        trainerMap.get (master).getPokemons ().stream ().forEach (p -> p.setHealth ());
                    }
                }
                trainerMap.get (master).getPokemons ().removeIf (p -> p.getHealth () <= 0);
            }

            command = scan.readLine ();
        }


        //“<TrainerName> <Badges> <NumberOfPokemon>
        trainerMap.entrySet ().stream ()
                .sorted ((x, y) -> y.getValue ().getBadges () - x.getValue ().getBadges ())
                .forEach (master -> System.out.println (master.getValue ().toString ()));
    }
}
