package coffee_machine.enums;

public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString(){
        return name().charAt(0)+name().substring(1).toLowerCase();
    }
}
