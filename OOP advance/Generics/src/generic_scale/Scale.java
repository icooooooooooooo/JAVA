package generic_scale;

public class Scale<T extends Comparable> {
    private T left;
    private T right;

    public Scale(T left, T right) {

        this.left = left;
        this.right = right;
    }

    public T getHeavier() {

        if (this.right.compareTo(this.left) > 0) {

            return this.right;
        } else if (this.left.compareTo(this.right) > 0) {
            return this.left;
        }
        return null;
    }
}


