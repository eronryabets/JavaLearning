package Junior.FirstCourse.Lections.Less29DateTime;

import java.time.LocalDate;
import java.time.LocalTime;


public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        ld1.plusDays(5);
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);
//        LocalDate ld2 = LocalDate.of(2014,Month.MAY,15);
//        System.out.println(ld2);
//        LocalDateTime ldt1 = LocalDateTime.of(2014,Month.MAY,10,17,25,59);
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        lt1 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).plusNanos(5);
        System.out.println(lt1);

    }
}
