package weekdays;

import java.util.*;

public class WeeklyCalendar<WeeklyEntry> implements Iterable<WeeklyEntry> {
    private List<WeeklyEntry> events;

    public WeeklyCalendar() {
        this.events = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public void addEntry(String weekday, String note) {
        this.events.add((WeeklyEntry) new weekdays.WeeklyEntry(weekday, note));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {

//todo        Collections.sort(this.events, WeeklyEntry.BY_WEEKDAY);
        return this.events;
    }

    @Override
    public Iterator<WeeklyEntry> iterator() {
        return new CalendarIterator();
    }

    private final class CalendarIterator implements Iterator<WeeklyEntry> {
        private int ind;

        public CalendarIterator() {
            ind = 0;
        }

        @Override
        public boolean hasNext() {
            if (ind < events.size()) {
                return true;
            }
            return false;
        }

        @Override
        public WeeklyEntry next() {
            return events.get(ind++);
        }
    }
}
