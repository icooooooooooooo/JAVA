package ol.P02_FileStream;

public abstract class Streamable {
    private String name;
    private int length;
    private int bytesSent;


    public Streamable(String name, int length, int bytesSent) {
        this.bytesSent = bytesSent;
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public int getBytesSent() {
        return bytesSent;
    }
}
