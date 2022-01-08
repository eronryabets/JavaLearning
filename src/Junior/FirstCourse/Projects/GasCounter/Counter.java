package Junior.FirstCourse.Projects.GasCounter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Junior.FirstCourse.Projects.GasCounter.Time.timeToInt;

public class Counter {
    public static final double gasCost = 7.99;
    private Time time = new Time();
    private double valueGas;

    public Counter(double valueGas) {
        System.out.println("Введите день - часы : минуты (в формате 28-21:08).");
        Time t = new Time();
        this.valueGas = valueGas;
    }

    public Counter() throws IOException {
        System.out.println("Введите день - часы : минуты (в формате 28-21:08).");
    }


    public void createAdmission() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        this.time = (Time) timeToInt(reader);
        this.setValueGas();
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getValueGas() {
        return valueGas;
    }


    public void setValueGas() throws IOException {
        System.out.println("Введите показания счетчика [пример 888.777]");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        this.valueGas = Double.parseDouble(reader.readLine());
    }

    @Override
    public String toString() {
        return "Counter{" +
                "time=" + time.getHour() + ":" + time.getMinute() +
                ", valueGas=" + valueGas +
                '}';
    }
    //+расчет спаленных кубов газа
    public static double gasAmount(Counter first, Counter last) {
        return last.getValueGas() - first.getValueGas();
    }
    //+расчет суммы всех часов в данном вычислении
    public static int timeHoursAmount(Counter first, Counter last) {
        return timeMinutesAmount(first,last) / 60;
    }
    ///+расчет суммы всех минут в данном вычислении
    public static int timeMinutesAmount(Counter first, Counter last) {
        return totalMinutes(last) - totalMinutes(first);
    }
    //+ сумма всех минут обьекта
    public static int totalMinutes(Counter counter) {
        return ((counter.getTime().getDay() - 1) * 24 + counter.getTime().getHour()) * 60 + counter.getTime().getMinute() ;
    }
    //+ сумма всех часов обьекта
    public static int totalHours(Counter counter) {
        return totalMinutes(counter) / 60 ;
    }

    //+расчет траты газа в минуту
    public static double gasInMinute(Counter first, Counter last) {
        return gasAmount(first, last) / timeMinutesAmount(first, last);
    }
    //+расчет траты газа в час
    public static double gasInHour(Counter first, Counter last) {
        return gasInMinute(first, last) * 60;
    }
    //+стоимость всего потраченного газа
    public static double gasAllCost(Counter first, Counter last) {
        return gasAmount(first, last) * gasCost;
    }
    //+стоимость потраченного газа в час
    public static double gasHourCost(Counter first, Counter last) {
        return gasInHour(first, last) * gasCost;
    }
    //+стоимость потраченного газа в минуту
    public static double gasMinuteCost(Counter first, Counter last) {
        return gasInMinute(first, last) * gasCost * 100;
    }

    //+вывод результата подсчетов на экран
    public static void resultInfo(Counter first, Counter last) {
        System.out.println("Расчет от " + first.getTime().getNumbersInput() +  " -> по -> " + last.getTime().getNumbersInput() +".");
        System.out.println("За " + timeHoursAmount(first,last) / 24 + " Дней " +  timeHoursAmount(first,last) % 24 + " часов : " + timeMinutesAmount(first, last) % 60 + " минут.");
        System.out.println("Насчитано " + String.format("%.3f", gasAmount(first, last)) + " кубов газа (стоимостью на " + String.format("%.2f", gasAllCost(first, last)) + " грн);");
        System.out.println("Среднее потребление:");
        System.out.println("в день = " + String.format("%.3f",gasInHour(first, last) * 24) + " кубов (на " + String.format("%.2f", gasHourCost(first, last) * 24) + "грн);");
        System.out.println("в час = " + String.format("%.3f", gasInHour(first, last)) + " кубов (на " + String.format("%.2f", gasHourCost(first, last))+ "грн);");
        System.out.println("в минуту = "+ String.format("%.3f", gasInMinute(first, last)) + " кубов  (на " + String.format("%.2f", gasMinuteCost(first, last)) + " копеек);");
        System.out.println("Ориентировочная цена за месяц (31 дней) = " + String.format("%.2f",(gasHourCost(first, last) * 24)*31) + " грн. (" + String.format("%.3f",(gasInHour(first, last) * 24)*30) + " кубов)");

    }
    //*Вывод данных в Стриг - который мы потом логируем.
    public static String resultToFile(Counter first, Counter last) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'время' HH:mm:ss");

        String result = "\nДата записи " + formatForDateNow.format(dateNow) +
                "\nРасчет от " + first.getTime().getNumbersInput() +  " -> до -> " + last.getTime().getNumbersInput() +"." +
                "\nЗа " + timeHoursAmount(first,last) / 24 + " Дней " +  timeHoursAmount(first,last) % 24 + " часов : " + timeMinutesAmount(first, last) % 60 + " минут.\n" +
                "Насчитано " + String.format("%.3f", gasAmount(first, last)) + " кубов газа (стоимостью на " + String.format("%.2f", gasAllCost(first, last)) + " грн); " +
                "\nСреднее потребление:" +
                "\nв день = " + String.format("%.3f",gasInHour(first, last) * 24) + " кубов (на " + String.format("%.2f", gasHourCost(first, last) * 24) + "грн);" +
                "\nв час = " + String.format("%.3f",gasInHour(first, last) ) + " кубов (на " + String.format("%.2f", gasHourCost(first, last)) + "грн);" +
                "\nв минуту = " + String.format("%.3f", gasInMinute(first, last)) + " кубов (на " + String.format("%.2f", gasMinuteCost(first, last)) + "грн);" +
                "\nОриентировочная цена за месяц (30 дней) = " + String.format("%.2f",(gasHourCost(first, last) * 24)*30) + " грн. (" + String.format("%.3f",(gasInHour(first, last) * 24)*30) + " кубов)" +
                "\n";
        return result;
    }


    public static void main(String[] args) throws IOException {

        Counter first = new Counter();
        first.createAdmission();
        Counter second = new Counter();
        second.createAdmission();
        System.out.println("first " + first);
        System.out.println("second " + second);

    }
}
