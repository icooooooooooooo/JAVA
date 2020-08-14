package jar_of_T;

import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();
        Jar<Integer> jar2 = new Jar();

        jar.add("Pepo");
        jar.add("Pep2o");
        jar.add("Pep2231aaa");

        jar2.add(1);
        jar2.add(4);
        jar2.add(2);
        jar2.add(3);

        String word = jar.remove();
        int num = jar2.remove();
        System.out.println(word + num);
    }
}
