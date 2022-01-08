package Junior.FirstCourse.Projects.GasCounter;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        int day1 = 1;
        int hours1 = 18;
        int minute1 = 30;

        int day2 = 6;
        int hours2 = 13;
        int minute2 = 17;

        //разница в минутах

        int totalMinutesDay1  = ((day1-1)*24 + hours1)*60 + minute1;
        int totalMinutesDay2  = ((day2-1)*24 + hours2)*60 + minute2;

        double totalMinutesCalc = totalMinutesDay2 - totalMinutesDay1;

        System.out.println("Разница в минутах = " + totalMinutesCalc );
        System.out.println("TEST ================ первое значение");
        System.out.println("часов " + totalMinutesDay1 / 60 + " | минут " + totalMinutesDay1 % 60);
        System.out.println("Всего часов - " + totalMinutesDay1 /60); //18
        System.out.println("Всего минут - " + totalMinutesDay1);//1110
        System.out.println("TEST ================ второе значение");
        System.out.println("Дней " + (totalMinutesDay2 / 60) / 24 + "| часов " + totalMinutesDay2 % 24 + " | минут " + totalMinutesDay2 % 60);


    }
}
/*
Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        System.out.println("Дата записи " + formatForDateNow.format(dateNow));
        Date dateOld = new Date(2021, Calendar.MARCH,5);
=====================
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите показания счетчика [конец отчета]");
        String numbers = reader.readLine();
        System.out.println("Вы ввели " + numbers);

        System.out.println("Длинна строки " + numbers.length());
        System.out.println(": под индексом " + numbers.indexOf(':'));
        int dot = numbers.indexOf(':');
        int firstNumbers = Integer.parseInt(numbers.substring(0, dot));
        int lastNumbers = Integer.parseInt(numbers.substring(dot + 1, numbers.length()));
        System.out.println(firstNumbers);
        System.out.println(lastNumbers);

 */