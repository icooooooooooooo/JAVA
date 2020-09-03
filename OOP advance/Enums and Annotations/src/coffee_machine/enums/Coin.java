package coffee_machine.enums;


public enum Coin {
    ONE(1), TWO(2), FIVE(5), TEN(10),TWENTY(20), FIFTY(50);
    private int nominal;


    Coin(int value) {
        this.nominal=value;
    }

    public int getNominal() {
        return this.nominal;
    }

}
