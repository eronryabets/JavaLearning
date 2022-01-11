package Junior.SecondCourse.N10_Other_Important_subjects.N1_Enum;

import java.util.Arrays;
import java.util.Objects;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1==w2);
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));

    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private WeekDays(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }


}


enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;



}


class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDays) {
        this.weekDay = weekDays;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Нужно идти на работу.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной! Можно отдохнуть :)");
        }
        System.out.println("Настроение на этот день: " + weekDay.getMood());
    }


}
