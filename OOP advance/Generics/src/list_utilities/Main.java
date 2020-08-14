package list_utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("rteref");
            add("dsadfdsafsa");
        }};
        List<Double> list2 = new ArrayList<>() {{
            add(2.2);
            add(3.6);
            add(99.9);
        }};
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 1, null, null, 2, 5, null);

        List<Integer> coordinates = ListUtilities.getNullIndices(list1);

        List<Integer> listInt = new ArrayList<>() {{
            add(3);
            add(7);
            add(99);
            add(3);
            add(5);
        }};


        List<Double> listDou = new ArrayList<>() {{
            add(5.5);
            add(566.5);
            add(2.5);
            add(5.5);
            add(4.5);
            add(3.5);
        }};

        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, listInt, listDou);

        List<Number> dest = new ArrayList<>();
        ListUtilities.flatten(dest, jagged);

        List<Number> dest2 = new ArrayList<>();
        ListUtilities.addAll(dest2, listInt);
        ListUtilities.addAll(dest2, listDou);
        ListUtilities.addAll(dest2, listInt);

        for (Number number : dest2) {
            System.out.print(number+" ");
        }
    }
}
