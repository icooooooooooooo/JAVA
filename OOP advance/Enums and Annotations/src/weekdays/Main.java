package weekdays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        WeeklyCalendar<WeeklyEntry> wc = new WeeklyCalendar();
        wc.addEntry("Friday", "sleep");
        wc.addEntry("Monday", "run");

//        Iterable<WeeklyEntry> schedule = wc

        for (WeeklyEntry we : wc) {
            System.out.println(we);
        }
    }
}
