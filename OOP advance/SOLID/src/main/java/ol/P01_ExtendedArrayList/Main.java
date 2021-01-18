package ol.P01_ExtendedArrayList;

public class Main {
    public static void main(String[] args) {

        ExtendedArrayList<Integer> list = new ExtendedArrayList();

        list.add(1);
        list.add(87);
        list.add(2);
        list.add(-443);
        list.add(2321);
        list.add(3);
        list.add(23);

        System.out.println(list.min());
        System.out.println(list.max());
    }
}
