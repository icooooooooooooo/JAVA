package ol.P03_GraphicEditor;

public abstract class Drawable implements DrawableMethods {


    public String draw() {
        return "I'm " + this.getClass().getSimpleName();
    }
}
