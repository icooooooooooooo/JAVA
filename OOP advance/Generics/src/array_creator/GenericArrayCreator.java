package array_creator;

import java.lang.reflect.Array;
import java.util.Objects;

public class GenericArrayCreator<T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[])Array.newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }

        return array;
    }


    public static <T> T[] create(Class<T> classT, int length, T item) {
        T[] array = (T[]) Array.newInstance(classT, length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}



