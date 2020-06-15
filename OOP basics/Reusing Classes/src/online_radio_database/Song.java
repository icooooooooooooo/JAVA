package online_radio_database;

import Exceptions.*;

public class Song {
    private static final String Invalid_Artist_Name_Exception = "Artist name should be between 3 and 20 symbols.";
    private static final int ARTIST_NAME_MIN = 3;

    private static final String Invalid_Song_Name_Exception = "Song name should be between 3 and 30 symbols.";
    private static final int ARTIST_NAME_MAX = 20;

    private static final String Invalid_Song_Length_Exception = "Invalid song length.";
    private static final int MIN_SONG_DURATION_SECONDS = 0;
    private static final int MAX_SONG_DURATION_SECONDS = 899; //14 min and 59sec

    private static final String Invalid_Song_Minutes_Exception = "Song minutes should be between 0 and 14.";
    private static final int MIN_SONG_MINUTES_ = 0;
    private static final int MAX_SONG_MINUTES_ = 14;

    private static final String Invalid_Song_Seconds_Exception = "Song seconds should be between 0 and 59.";
    private static final int MAX_SONG_SECONDS_ = 59;


    private String artistName;
    private String songName;
    private String duration;

    protected String getDuration() {
        return this.duration;
    }
    public Song() {

    }

    public Song(String artist, String song, String duration) {
        this.setArtistName (artist);
        this.setSongName (song);
        this.setDuration (duration);
    }

    private void setArtistName(String artistName) {
        boolean isFit = validator (artistName);
        if (isFit) {
            this.artistName = artistName;
        } else {
            throw new InvalidArtistNameException (Invalid_Artist_Name_Exception);
        }
    }

    private void setDuration(String duration) {

        int minutes = getMinutes (duration);
        int seconds = getSeconds (duration);
        int durationInSeconds = secondsconvertor (minutes, seconds);

        if (durationInSeconds >= MIN_SONG_DURATION_SECONDS && durationInSeconds <= MAX_SONG_DURATION_SECONDS) {
            if (minutes >= MIN_SONG_MINUTES_ && minutes <= MAX_SONG_MINUTES_) {
                if (seconds <= MAX_SONG_SECONDS_) {
                    this.duration = duration;
                } else {
                    throw new InvalidSongSecondsException (Invalid_Song_Seconds_Exception);
                }
            } else {
                throw new InvalidSongMinutesException (Invalid_Song_Minutes_Exception);
            }
        } else {
            throw new InvalidSongLengthException (); //message is not mandatory
        }

    }

    protected int getSeconds(String duration) {
        String[] durationSplit = duration.split (":");

        int seconds = Integer.parseInt (durationSplit[1]);

        return seconds;
    }

    protected int getMinutes(String duration) {
        String[] durationSplit = duration.split (":");

        int minutes = Integer.parseInt (durationSplit[0]);

        return minutes;
    }

    protected int secondsconvertor(int minutes, int seconds) {
        int lenghth = seconds + (minutes * 60);

        return lenghth;
    }

    private void setSongName(String songName) {
        boolean isFit = validator (songName);
        if (isFit) {
            this.songName = songName;
        } else {
            throw new InvalidSongNameException (Invalid_Song_Name_Exception);
        }
    }

    private boolean validator(String name) {
        boolean isFit = true;
        if (name.length () >= ARTIST_NAME_MIN && name.length () <= ARTIST_NAME_MAX) {
            isFit = true;
        } else {
            isFit = false;
        }
        return isFit;
    }
}
