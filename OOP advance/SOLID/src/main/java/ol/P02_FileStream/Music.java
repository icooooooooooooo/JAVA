package ol.P02_FileStream;

public class Music extends Streamable {

    private String album;

    public Music(String name, int length, int bytesSent, String album) {
        super(name, length, bytesSent);
        this.album = album;

    }
}
