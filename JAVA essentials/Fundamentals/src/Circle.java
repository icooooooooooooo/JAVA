public class Circle {
    private Point center;
    private int Radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.Radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }
}
