package override;

import java.security.PublicKey;

public class Rectangle {

    protected double sideA;
    private Double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public double area() {
        return this.sideA * this.sideB;
    }

}
