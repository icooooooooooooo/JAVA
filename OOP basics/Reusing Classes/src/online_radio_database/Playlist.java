package online_radio_database;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Playlist extends Song {
    private static final String ADDED_SONG_MESSAGE = "Song added.";

    private static List<Song> songs;

    public static int getLenght() {
        return lenght;
    }

    private static int lenght;

    public static int getCount() {
        return count;
    }

    private static int count;


    public Playlist() {
        songs = new ArrayList<> ();
    }

    public void add(Song song) {

        String duration = song.getDuration ();
        songs.add (song);
        this.lenght += secondsconvertor (getMinutes (duration), getSeconds (duration));
        this.count += 1;

        System.out.println (ADDED_SONG_MESSAGE);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder ();
        sb.append ("Songs added: ").append (this.getCount ()).append (System.lineSeparator ());
        sb.append ("Playlist length: ").append (timeCalculator (getLenght ())).append (System.lineSeparator ());

        return sb.toString ();
    }

    private String timeCalculator(int lenght) {
        int raw = lenght;
        int hours = raw / 3600;
        raw %= 3600;
        int minutes = raw / 60;
        int seconds = raw % 60;

        StringBuilder sb = new StringBuilder ();

        String timeString = sb.append (hours).append ("h ").append (minutes).append ("m ").append (seconds).append ("s").toString ();
        return timeString;
    }

}
