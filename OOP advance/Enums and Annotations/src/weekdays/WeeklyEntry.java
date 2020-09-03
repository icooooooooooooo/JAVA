package weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getComparator();

    private Weekdays weekday;
    private String note;

    public WeeklyEntry(String day, String note) {
        this.weekday = Enum.valueOf(Weekdays.class, day.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday.toString(), this.note);
    }


    //private static Comparator<WeeklyEntry> getCompByDay() {
    //    return (e1, e2) -> Integer.compare(e1.weekday.ordinal(), e2.weekday.ordinal());
    //}

    private static Comparator<WeeklyEntry> getComparator() {
        return Comparator.comparingInt(e->e.weekday.ordinal());
    }

    //private static Comparator<WeeklyEntry> getComparator() {
    //    return (e1, e2) -> e1.weekday.compareTo(e2.weekday);
    //}

}
