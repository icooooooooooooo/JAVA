package panzer.io;

import panzer.contracts.InputReader;
import panzer.contracts.OutputWriter;

import java.io.InputStreamReader;

public class Writer implements OutputWriter {
    @Override
    public void println(String output) {
        System.out.println(output);
    }

    @Override
    public void print(String output) {
        System.out.print(output);
    }


}
