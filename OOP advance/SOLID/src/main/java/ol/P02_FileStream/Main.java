package ol.P02_FileStream;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("Ivi", 3455,554, "Ivi Debut Album");
        File file = new File("top Secret", 32,5);

        System.out.println(music.getBytesSent());
        System.out.println(file.getLength());
    }
}
