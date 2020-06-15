package override;

public class Square extends Rectangle {

    public Square(double a) {
        super (a, 0);
    }

    @Override
    public double area() {
        return this.sideA * this.sideA;
    }
}
