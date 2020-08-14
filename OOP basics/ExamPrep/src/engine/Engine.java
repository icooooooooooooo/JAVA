package engine;

import IO.ConsoleReader;
import IO.ConsoleWriter;
import controller.CarManager;
import dispatcher.CommandDispatcher;

import java.io.IOException;

public class Engine {
    private ConsoleReader reader;
    private ConsoleWriter writer;
    private CarManager manager;
    private CommandDispatcher dispatcher;
    private boolean isStarted;

    public Engine(ConsoleReader reader, ConsoleWriter writer, CarManager manager, CommandDispatcher commandDispatcher) {
        this.manager = manager;
        this.reader = reader;
        this.writer = writer;
        this.dispatcher = commandDispatcher;
    }

    public void start() {
        this.isStarted = true;

        while (this.isStarted) {
            try {
                String input = this.reader.readLine();
                String[] args = input.split("\\s+");

                String result = this.dispatcher.dispatchCommand(args, manager);

                if (!"".equals(result)) {
                    System.out.println(result);
                }

                if ("Cops Are Here".equals(input)) {
                    this.isStarted = false;
                }
            } catch (IOException e) {
                this.writer.writeLine(e.getMessage());
            }
        }
    }
}