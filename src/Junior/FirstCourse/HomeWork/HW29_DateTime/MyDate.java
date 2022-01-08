package Junior.FirstCourse.HomeWork.HW29_DateTime;


import java.time.*;
import java.time.format.DateTimeFormatter;

//2016, января-01 !! 09:00
//9:00, 03/фев/16

public class MyDate {
    public static DateTimeFormatter shk1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm "); //2016, января-01 !! 09:00
    public static DateTimeFormatter shk2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy"); //9:00, 03/фев/16

    public static void shift(LocalDateTime start,LocalDateTime end, Period period, Duration duration){
        while(start.isBefore(end)){
            System.out.println("Работаем с: " +start.format(shk1));
            start = start.plus(period);
            System.out.println("До: " + start.format(shk1));
            System.out.println("Отдыхаем с: " + start.format(shk2) );
            start = start.plus(duration);
            System.out.println("До: " + start.format(shk2) );
        }
    }





    public static void main(String[] args) {
//        LocalDateTime start = LocalDateTime.of(2016,1,1,9,0);
//        LocalDateTime end = LocalDateTime.of(2016,1,2,9,0);
//        Period period =  Period.of(0,1,2);
//        System.out.println(start.format(shk1));
//        start = start.plus(period);
//        System.out.println(start.format(shk1));


    }
}
