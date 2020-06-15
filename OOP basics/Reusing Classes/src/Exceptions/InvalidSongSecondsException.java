package Exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException() {
        super ("Song seconds should be between 0 and 59.");
    }

    public InvalidSongSecondsException(String message) {
        super (message);
    }
}
