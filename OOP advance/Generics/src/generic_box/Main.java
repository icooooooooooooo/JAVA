package generic_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int bound = Integer.parseInt(scan.readLine());

        List<Box<Double>> boxes = new ArrayList<>();
        for (int i = 0; i < bound; i++) {
            double input = Double.parseDouble( scan.readLine());

            Box box = new Box();
            box.setValue(input);
            boxes.add(box);
        }
        double element = Double.parseDouble(scan.readLine());

        Box<Double> el = new Box<Double>();
        int count = el.count(boxes,element);

        System.out.println(count);
    }
}
