package pl.sda.zdjavapol73.homework.enumTasks.task1;

import java.util.regex.Pattern;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return !this.isWeekDay();
    }

    public void whichIsGreater(Weekday weekday){
        if(this.ordinal() < weekday.ordinal()){
            System.out.println("its before: " + weekday);
        } else {
            System.out.println("its after: " + weekday);
        }
    }

}
