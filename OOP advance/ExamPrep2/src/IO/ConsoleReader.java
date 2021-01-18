package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    private BufferedReader scan;

    public ConsoleReader() {
        this.scan = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine() throws IOException {
        return this.scan.readLine();
    }

}
