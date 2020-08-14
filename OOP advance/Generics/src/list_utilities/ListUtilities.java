package list_utilities;

import java.util.ArrayList;
import java.util.List;

public class ListUtilities<T> {

    public static <T extends Comparable> T getMin(List<T> list) throws IllegalArgumentException {

        if (list.isEmpty()) {
            throw new IllegalArgumentException("list cannot be empty");
        }

        T min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) < 0) {
                min = list.get(i);
            }
        }
        return min;

    }

    public static <T extends Comparable> T getMax(List<T> list) throws IllegalArgumentException {

        if (list.isEmpty()) {
            throw new IllegalArgumentException("list cannot be empty");
        }

        T maxElement = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (maxElement.compareTo(list.get(i)) > 0) {
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

    public static List<Integer> getNullIndices(List<?> list) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                positions.add(i);
            }
        }
        return positions;
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source) {

        for (List<? extends T> list : source) {
            destination.addAll(list);
        }
    }

    public static <T> void addAll(List<? super T> destination, List<? extends T> src) {
        destination.addAll(src);
    }
}

