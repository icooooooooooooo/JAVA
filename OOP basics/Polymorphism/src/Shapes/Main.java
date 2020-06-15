package Shapes;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle (3);
        Shape rectangle = new Rectangle (4, 6);

        System.out.println (circle.getArea ());
        System.out.println (circle.getPerimeter ());
        System.out.println (rectangle.getArea ());
        System.out.println (rectangle.getPerimeter ());
    }
}
