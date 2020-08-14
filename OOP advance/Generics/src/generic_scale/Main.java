package generic_scale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> scale = new Scale(11, 22);
        System.out.println(scale.getHeavier());

        Scale scale1 = new Scale("a","c");
        System.out.println(scale1.getHeavier());
    }
}
