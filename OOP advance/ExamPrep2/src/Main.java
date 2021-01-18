import IO.ConsoleReader;
import IO.ConsoleWriter;
import engine.controller.HealthManager;
import dispatcher.Dispatcher;
import engine.Engine;

public class Main {
    public static void main(String[] args) {

        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();
        Dispatcher dispatcher = new Dispatcher();
        HealthManager healthManager = new HealthManager();
        Engine engine = new Engine(dispatcher,healthManager,reader,writer);

        engine.start();

    }
}
