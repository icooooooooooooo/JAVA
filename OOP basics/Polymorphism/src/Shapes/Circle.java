package Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

        setArea (calculateArea ());
        setPerimeter (calculatePerimeter ());

    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);

    }
    /**
     * •	Fields:
     * o	height and width for Rectangle
     * o	radius for Circle
     * •	Encapsulation for this fields
     * •	Public constructor
     * •	Concrete methods for calculations (perimeter and area)
     */


}
