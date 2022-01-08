package Junior.FirstCourse.Lections.Less29DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4Shift {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konec)) {
            System.out.println("Nastypila data" + data + ". Pora menat dejurnogo");
            data = data.plus(p);

        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER,1);
        LocalDate konec = LocalDate.of(2017,Month.MAY,31);
        Period p = Period.ofMonths(1);
        smenaDejurnogo(nachalo,konec,p);


    }
}
