package Junior.FirstCourse.Lections.Less29DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'время' HH:mm:ss");
        System.out.println(formatForDateNow.format(dateNow));
    }
}
