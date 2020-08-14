package custom_list;

import java.util.Comparator;
import java.util.List;

public class Dispatcher<T extends Comparable<T>> {

    public void dispatch(String[] commands, CustomList list) {

        String command = commands[0];
        String element;
        int index1;
        int index2;

        switch (command) {
            case "Add":
                element = commands[1];
                list.add(element);
                return;
            case "Remove":
                index1 = Integer.parseInt(commands[1]);
                list.remove(index1);
                return;
            case "Contains":
                element = commands[1];
                System.out.println(list.contains(element));
                return;
            case "Swap":
                index1 = Integer.parseInt(commands[1]);
                index2 = Integer.parseInt(commands[2]);
                list.swap(index1, index2);
                return;
            case "Greater":
                element = commands[1];
                System.out.println(list.countGreaterThan(element));
                return;
            case "Max":
                System.out.println(list.getMax());
                return;
            case "Min":
                System.out.println(list.getMin());
                return;
            case "Print":
                System.out.println(list.print());
                return;
            case "Sort":
                list.sort();
                return;

        }

    }
}
