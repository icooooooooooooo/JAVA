package online_radio_database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        int N = Integer.parseInt (scan.readLine ());
        Playlist playlist = new Playlist ();

        while (N-- > 0) {
            String[] input = scan.readLine ().split (";");
            Song song = null;
            try {
                song = new Song (input[0], input[1], input[2]);
                playlist.add (song);

            }catch (IllegalArgumentException ex){
                System.out.println (ex.getMessage ());
            }
        }
        System.out.println (playlist.toString ());

    }
}
