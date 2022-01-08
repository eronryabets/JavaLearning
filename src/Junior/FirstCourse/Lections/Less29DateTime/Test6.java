package Junior.FirstCourse.Lections.Less29DateTime;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER,1);
        LocalDateTime ldt = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25);
        LocalTime lt = LocalTime.of(16,40);
//        System.out.println(ldt.getDayOfWeek());
//        System.out.println(ldt.getMonth());
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 14 2015", f);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2015-01-14");
        System.out.println(date2);

    }
}
