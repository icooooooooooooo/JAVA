package Exceptions;

public class InvalidSongNameException extends InvalidSongException{
    public InvalidSongNameException(){
        super("Song name should be between 3 and 30 symbols.");
    }

    public InvalidSongNameException(String message){
        super(message);
    }
}
