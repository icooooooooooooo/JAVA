package coffee_machine.enums;

public enum CoffeeSize {
    SMALL(50, 50), NORMAL(100, 75), Double(200, 100);
    private int size;
    private int value;

    public int getSize() {
        return size;
    }

    public int getValue() {
        return value;
    }

    CoffeeSize(int size, int value) {
        this.size = size;
        this.value = value;
    }

    @Override
    public String toString(){
        return name().charAt(0)+name().substring(1).toLowerCase();
    }

}
