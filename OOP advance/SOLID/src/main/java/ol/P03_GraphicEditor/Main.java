package ol.P03_GraphicEditor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drawable> list = new ArrayList<Drawable>();

        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        list.add(shape);
        list.add(circle);
        list.add(rectangle);

        for (Drawable drawable : list) {
            System.out.println(drawable.draw());
        }
    }
}
