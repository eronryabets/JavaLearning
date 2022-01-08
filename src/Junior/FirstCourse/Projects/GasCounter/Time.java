package Junior.FirstCourse.Projects.GasCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    private int day;
    private int hour;
    private int minute;
    private String numbersInput;

    public Time(int day, int hour, int minute, String numbersInput) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.numbersInput = numbersInput;
    }

    public Time() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getNumbersInput() {
        return numbersInput;
    }


    public void setNumbersInput(String numbersInput) {
        this.numbersInput = numbersInput;
    }

    public static Object  timeToInt(BufferedReader reader) throws IOException {
        //28-21:12
        String numbers = reader.readLine();
        int dot = numbers.indexOf(':');
        int hyphen = numbers.indexOf('-');
        int dayNumbers = Integer.parseInt(numbers.substring(0, hyphen));
        int hoursNumbers = Integer.parseInt(numbers.substring(hyphen+1, dot));
        int minutesNumbers = Integer.parseInt(numbers.substring(dot+1,numbers.length()));
        Time t = new Time(dayNumbers,hoursNumbers,minutesNumbers,numbers);
        return t;
    }

    @Override
    public String toString() {
        return "Time{" +
                "day=" + day +
                ", hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите дату-часы:минуты (28-21:09)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Time firstTime = new Time();
        firstTime = (Time) timeToInt(reader);
        System.out.println(firstTime);
        System.out.println("Day - " + firstTime.getDay());
        System.out.println("Hours - " + firstTime.getHour());
        System.out.println("Minute - " + firstTime.getMinute());




    }
}
/*
System.out.println("SUBSTRING TEST");
        String day = "28-21:09";
        int dot = day.indexOf(':');
        int hyphen = day.indexOf('-');
        System.out.println("Hyphen = " + hyphen);
        System.out.println("Dot = " + dot);
        int dayNumbers = Integer.parseInt(day.substring(0, hyphen));
        System.out.println("dayNumbers = " + dayNumbers);
        int hoursNumbers = Integer.parseInt(day.substring(hyphen+1, dot));
        System.out.println("hoursNumbers = " + hoursNumbers);
        int minutesNumbers = Integer.parseInt(day.substring(dot+1,day.length()));
        System.out.println("minutesNumbers = " + minutesNumbers);
=============================
public static Object  timeToInt(BufferedReader reader) throws IOException {
        //28-21:12
        String numbers = reader.readLine();
        int dot = numbers.indexOf(':');
        int hyphen = numbers.indexOf('-');
        int dayNumbers = 0;
        int hoursNumbers = Integer.parseInt(numbers.substring(0, dot));
        int minutesNumbers = Integer.parseInt(numbers.substring(dot + 1, numbers.length()));
        Time t = new Time(dayNumbers,hoursNumbers,minutesNumbers);
        return t;
    }
======================================
System.out.println("Введите показания счетчика [конец отчета]");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Time firstTime = new Time();
        firstTime = (Time) timeToInt(reader);
        Time lastTime = new Time();
        lastTime = (Time) timeToInt(reader);
        System.out.println(firstTime);
        System.out.println(firstTime.getHour());
        System.out.println(firstTime.getMinute());
====
static Object  timeToInt(BufferedReader reader) throws IOException {
        String numbers = reader.readLine();
        int dot = numbers.indexOf(':');
        int firstNumbers = Integer.parseInt(numbers.substring(0, dot));
        int lastNumbers = Integer.parseInt(numbers.substring(dot + 1, numbers.length()));
        Time t = new Time(firstNumbers,lastNumbers);
        return t;
    }
====
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
