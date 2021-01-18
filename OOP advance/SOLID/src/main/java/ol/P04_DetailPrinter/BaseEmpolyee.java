package ol.P04_DetailPrinter;

public abstract class BaseEmpolyee implements BaseEmployeeMethods {

    private String name;

    public BaseEmpolyee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("%s is %s", this.getName(), this.getClass().getSimpleName());
    }

}