import IO.ConsoleReader;
import IO.ConsoleWriter;
import controller.CarManager;
import dispatcher.CommandDispatcher;
import engine.Engine;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        CarManager manager = new CarManager();
        CommandDispatcher commandDispatcher = new CommandDispatcher();
        Engine engine = new Engine(reader, writer, manager, commandDispatcher);

        engine.start();

    }
}
