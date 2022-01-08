package Junior.FirstCourse.Projects.GasCounter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Ввод1 - часы, минуты. кубатура газа. 1-12:24 8038.756;
//Ввод2 - часы, минуты. кубатура газа. 1-21:08 8044.476;
//1-18:30 and 6-13:17
public class Test2 {
    public static void main(String[] args) throws IOException {
//        Counter first = new Counter();
//        first.createAdmission();
//        Counter last = new Counter();
//        last.createAdmission();
//        int th = timeHoursAmount(first,last);
//        int tm = timeMinutesAmount(first,last);
//        double gh = gasInHour(first,last);
//        double gm = gasInMinute(first,last);
//        System.out.println("Сумма всех часов в вычислении - " + th);
//        System.out.println("Сумма всех минут в вычислении - " + tm);
//        System.out.println("Сумма часов и минут в вычислении : " + th + ":" + tm % 60 );
//        System.out.println("Кол-во потраченных кубов газа в час = " + String.format("%.3f",gh));
//        System.out.println("Кол-во потраченных кубов газа в minute = " + String.format("%.3f",gm));
//        Counter first = new Counter();
//        first.createAdmission();
//        System.out.println(first.getTime().getNumbersInput());

        Date dateNow = new Date();
        //System.out.println(dateNow.toString());
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'время' HH:mm:ss");
        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));





    }
}
