package Exceptions;

public class InvalidSongException extends NumberFormatException {

    /**
     * Design a custom exception hierarchy for invalid songs:
     * •	InvalidSongException
     * o	InvalidArtistNameException
     * o	InvalidSongNameException
     * o	InvalidSongLengthException
     * 	InvalidSongMinutesException
     * 	InvalidSongSecondsException
     */

    public InvalidSongException(){
        super("Invalid song.");
    }
    public InvalidSongException(String message){
        super(message);
    }



}
