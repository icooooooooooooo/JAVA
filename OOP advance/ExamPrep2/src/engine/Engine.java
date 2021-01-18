package engine;

import IO.ConsoleReader;
import IO.ConsoleWriter;
import engine.controller.HealthManager;
import dispatcher.Dispatcher;

import java.io.IOException;

public class Engine {

    private Dispatcher dispatcher;
    private HealthManager manager;
    private ConsoleWriter writer;
    private ConsoleReader reader;
    private boolean isStarted;

    public Engine(Dispatcher dispatcher, HealthManager healthManager, ConsoleReader consoleReader, ConsoleWriter consoleWriter) {
        this.dispatcher = dispatcher;
        this.manager = healthManager;
        this.reader = consoleReader;
        this.writer = consoleWriter;
        this.isStarted = false;
    }

    public void start() {

        this.isStarted = true;
        while (isStarted == true) {
            try {
                String input = reader.readLine();
                String[] args = input.split("\\s+");

                String result = dispatcher.commandProcessor(args, this.manager);

                if (!"".equals(result)) {
                    System.out.println(result);
                }

                if ("BEER IS COMING".equals(input)) {
                    isStarted = false;
                }
            } catch (IOException e) {
                this.writer.writeLine(e.getMessage());
            }
        }
    }
}
