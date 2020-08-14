package array_creator;

import jar_of_T.Jar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] create = GenericArrayCreator.create(10, "none");

        Integer[] create2 = GenericArrayCreator.create(Integer.class, 10, 0);

        for (int i = 0; i < 10; i++) {
            System.out.println(create[i]+create2[i]);
        }

    }
}
