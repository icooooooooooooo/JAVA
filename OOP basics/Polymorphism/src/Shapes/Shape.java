package Shapes;

public abstract class Shape {

    protected void setPerimeter(double perimeter) {
        this.perimeter = calculatePerimeter ();
    }

    protected void setArea(double area) {
        this.area = calculateArea ();
    }

    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

}
