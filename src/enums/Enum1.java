package enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();
        WeekDays day1 = WeekDays.MONDAY;
        WeekDays day2 = WeekDays.FRIDAY;
        WeekDays day3 = WeekDays.SUNDAY;
        WeekDays[] day10 = WeekDays.values();
        System.out.println(Arrays.toString(day10));

    }
}


enum WeekDays {
    MONDAY("bad"), TUESDAY("bad"), WEDNESDAY("so-so"),
    THURSDAY("so-so"), FRIDAY("good"),
    SATURDAY("great"), SUNDAY("good");

    private final String mood;

    WeekDays(String mood) {
        this.mood = mood;
//        System.out.println("hello");
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch(weekDays){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Иди на работу!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Можно отдохнуть!");
                break;
        }
        System.out.println("Настроение в этот день " + weekDays.getMood());
    }

}

enum WeekDays2 {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY,
    SATURDAY, SUNDAY
}