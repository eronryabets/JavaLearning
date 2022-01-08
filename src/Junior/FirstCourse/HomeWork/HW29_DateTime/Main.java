package Junior.FirstCourse.HomeWork.HW29_DateTime;

import java.time.*;
import static Junior.FirstCourse.HomeWork.HW29_DateTime.MyDate.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2016,1,1,9,0,0);
        LocalDateTime end = LocalDateTime.of(2016,10,31,18,0,0);
        Period period =  Period.of(0,1,2);
        Duration duration = Duration.ofMinutes(600);
        shift(start,end,period,duration);

    }
}
