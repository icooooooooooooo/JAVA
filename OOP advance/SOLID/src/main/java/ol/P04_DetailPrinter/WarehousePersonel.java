package ol.P04_DetailPrinter;

public class WarehousePersonel extends BaseEmpolyee {
    private String specialisation;

    public WarehousePersonel(String name, String specialisation) {
        super(name);
        this.specialisation = specialisation;
    }

    public String details() {
        return toString() + " and is specializing in " + this.specialisation;
    }
}
