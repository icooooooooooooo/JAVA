package Exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException{
    public InvalidSongMinutesException(){
        super("Song minutes should be between 0 and 14.");
    }
    public InvalidSongMinutesException(String message){
    super(message);
    }
}
