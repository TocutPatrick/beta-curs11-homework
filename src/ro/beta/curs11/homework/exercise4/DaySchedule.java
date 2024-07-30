package ro.beta.curs11.homework.exercise4;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private final WeekDays day;
    private final  List<String> activities = new ArrayList<>();

    public DaySchedule(WeekDays day) {
        this.day = day;
    }
}
