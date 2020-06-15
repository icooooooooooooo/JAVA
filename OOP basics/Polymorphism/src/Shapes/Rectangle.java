package Shapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB=sideB;

        setArea (calculateArea ());
        setPerimeter (calculatePerimeter ());
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideA + this.sideB;
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }
}
