import java.io.Serializable;

public class Cube implements Serializable {
    private String color;
    private double heigth;
    private double width;
    private double depth;

    public Cube(String color, double heigth, double width, double depth) {
        this.color = color;
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String toString() {
        return this.color + " " + this.depth + " " +this.heigth + " " + this.width;
    }

}