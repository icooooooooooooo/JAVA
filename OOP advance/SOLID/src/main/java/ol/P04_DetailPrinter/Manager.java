package ol.P04_DetailPrinter;

public class Manager extends BaseEmpolyee {

    private Iterable<String> documents;

    public Manager(String name, Iterable<String> documents) {
        super(name);
        this.documents = documents;
    }

    public String documentPrinter() {
        StringBuilder sb = new StringBuilder();
        for (String document : this.documents) {
            sb.append("- ").append(document).append(System.lineSeparator());
        }
        return sb.toString().substring(0, sb.length() - 2);
    }

    public String details() {
        return toString() + "\n" + getName() + " has the following documents: \n" + documentPrinter();
    }
}
