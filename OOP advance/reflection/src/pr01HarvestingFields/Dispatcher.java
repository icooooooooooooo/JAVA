package pr01HarvestingFields;

public class Dispatcher {
    private Engine engine;

    public Dispatcher() {
        this.engine = new Engine(RichSoilLand.class);
    }

    public void engine(String command) {
        switch (command) {
            case "private":
                engine.printPrivate();
                break;
            case "public":
                engine.printPublic();
                break;
            case "protected":
                engine.printProtected();
                break;
            case "all":
                engine.printAll();
                break;
            default:
                throw new IllegalArgumentException("Invalid command");
        }
    }
}
