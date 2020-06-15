package box1_box2;

public class Box {
    private double length;
    private double width;
    private double height;

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException ("Length cannot be zero or negative. ");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException ("Width cannot be zero or negative. ");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException ("Height cannot be zero or negative. ");
        }
    }


    @Override
    public String toString() {
        StringBuilder op = new StringBuilder ();
        /*Surface Area - 52.00
        Lateral Surface Area - 40.00
        Volume – 24.00
        */
        op.append ("Surface Area - ").append (String.format ("%.2f", this.surfaceArea ())).append (System.lineSeparator ());
        op.append ("Lateral Surface Area - ").append (String.format ("%.2f", this.lateralSurfaceArea ())).append (System.lineSeparator ());
        op.append ("Volume – ").append (String.format ("%.2f", this.volume ())).append (System.lineSeparator ());
        return op.toString ();
    }

    public Box() {
    }

    public Box(double length, double width, double height) {
        setHeight (height);
        setLength (length);
        setWidth (width);
    }

    private double volume() {
        double volume = this.height * this.length * this.width;
        return volume;
    }

    private double lateralSurfaceArea() {
        double lateralSurfaceArea = 2 * this.length * this.height + 2 * this.width * this.height;
        return lateralSurfaceArea;
    }

    private double surfaceArea() {
        double sideA = this.height * this.width;
        double sideB = this.height * this.length;
        double sideC = this.width * this.length;
        double surfaceArea = 2 * sideA + 2 * sideB + 2 * sideC;
        return surfaceArea;
    }
    /*
    surface area, lateral surface area and the volume of the box
    Volume = lwh
    Lateral Surface Area = 2lh + 2wh
    Surface Area = 2lw + 2lh + 2wh
     */

}
